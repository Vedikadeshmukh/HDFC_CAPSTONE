package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.DTO.EmployeeDTO;
import com.example.exception.EmployeeNotFound;
import com.example.service.IEmployeeService;

@SpringBootTest
class EmployeeTest {

	@Autowired
	IEmployeeService service;
	
	@Test
	void test() throws Exception {
		EmployeeDTO emp =service.getEmployeeById(101);
		assertEquals(emp.getId(),101);
	}

}
