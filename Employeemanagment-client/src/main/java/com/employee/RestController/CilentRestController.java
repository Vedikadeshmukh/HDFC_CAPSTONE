package com.employee.RestController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.employee.config.AesDcrypt;
import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotfound;


@RestController
@RequestMapping("/Client")
public class CilentRestController {
	
	@Autowired
	RestTemplate rest;
	
	@GetMapping("/employee/details/{id}")
	public Employee getemployeedetails(@PathVariable long id)throws Exception {
		Employee result=null;
		try {
		result=rest.getForObject("https://localhost:9292/Employeedetails/fetch/"+id, Employee.class);
		result.setDOB(AesDcrypt.decrypt(result.getDOB()));
		
		} catch (HttpServerErrorException ex) {
		    // Handle internal server error
		    HttpStatus statusCode = ex.getStatusCode();
		    if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR) {
		        // Log or display error message
		      throw new EmployeeNotfound("Invalid employee id");
		    }
		} catch (Exception ex) {
		    // Handle other exceptions
		    ex.printStackTrace();
		}
		return result;
}
}
