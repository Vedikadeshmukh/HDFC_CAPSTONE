package com.employee.service;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.DTO.EmployeeDTO;

import com.employee.exception.EmployeeNotFound;
@SpringBootTest
class EmployeeServiceImpTest {
	
	@Autowired
	IEmployeeService service;

	@Test
	void testGetEmployeeById() throws EmployeeNotFound {
		EmployeeDTO emp =service.getEmployeeById(101);
		assertEquals(emp.getId(),101);
	}

}
