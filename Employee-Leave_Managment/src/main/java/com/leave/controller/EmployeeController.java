package com.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leave.DTO.EmployeeDTO;
import com.leave.entity.Employee;
import com.leave.service.IEmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	
	@Autowired
	IEmployeeService service;
	
	
	@PostMapping("/add")
	public Employee add(@RequestBody EmployeeDTO empDTO) {
		return service.add(empDTO);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return service.gaetAll();
	}
	
	
	@GetMapping("/getById/{id}")
	public Employee getEmpById(@PathVariable long id) {
		return service.getEmpById(id);
	}
	
	@PutMapping("/update")
	public Employee updateEmp(@RequestBody EmployeeDTO empDTO) {
		return service.updateEmp(empDTO);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable long id) {
		service.deletebyid(id);
		return new ResponseEntity<String>("Record deleted",HttpStatus.OK);
	}
	
	
	
	
	
}
