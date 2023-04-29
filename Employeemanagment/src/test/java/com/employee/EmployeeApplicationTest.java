package com.employee;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.DTO.EmployeeDTO;
import com.employee.exception.EmployeeNotFound;
import com.employee.service.IEmployeeservice;

@SpringBootTest
class EmployeeApplicationTest {

	/*@Autowired
	IEmployeeservice service;
	
	@Test
	void test() throws EmployeeNotFound {

		EmployeeDTO emp =service.getEmployeeById(101);
		assertEquals(emp.getId(),101);
	}*/

}
