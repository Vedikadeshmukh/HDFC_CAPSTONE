package com.example.service;

import com.example.DTO.EmployeeDTO;
import com.example.exception.EmployeeNotFound;

public interface IEmployeeService {
	
	public EmployeeDTO getEmployeeById(long id) throws Exception;
	

}
