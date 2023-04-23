package com.employee.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.client.entity.Employee;

@RestController
@RequestMapping("/client")
public class ClientRestController {

	@Autowired
	RestTemplate rest;
	
	@GetMapping("/employee/details/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
		Employee emp=rest.getForObject("http://localhost:9090/Employee/details/"+id, Employee.class);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
}
