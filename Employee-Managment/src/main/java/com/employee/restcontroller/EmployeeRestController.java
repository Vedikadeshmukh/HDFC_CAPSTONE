package com.employee.restcontroller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFound;
import com.employee.service.IEmployeeService;



@RestController
@RequestMapping("/Employee")
public class EmployeeRestController {

	Logger logger =LoggerFactory.getLogger(EmployeeRestController.class);
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/details/{id}")
	public Employee getEmployeeById(@PathVariable long id) throws EmployeeNotFound{
		logger.info("[getEmployeeById] info message");
		logger.warn("[getEmployeeById] warn message");
		logger.debug("[getEmployeeById] debug message");
		logger.error("[getEmployeeById] error message");
		logger.trace("[getEmployeeById] trace message");
		return service.getEmployeeById(id);
		
	}
}
