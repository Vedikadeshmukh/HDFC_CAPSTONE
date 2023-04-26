package com.employee.service;




import com.employee.DTO.EmployeeDTO;
import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFound;

public interface IEmployeeService {
	public EmployeeDTO getEmployeeById(long id) throws EmployeeNotFound;
	
	
}
