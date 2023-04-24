package com.employee.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.client.entity.Employee;

@RestController
@RequestMapping("/client")
public class RestClientController {
	
	@Autowired
	RestTemplate rest;
	
	@GetMapping("/employee/{id}")
	public Employee getemployeedetails(@PathVariable long id) {
		Employee result=rest.getForObject("https://localhost:9090/Employee/details/"+id, Employee.class);
		return result;
	}

}
