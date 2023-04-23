package com.employee.service;



import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFound;

public interface IEmployeeService {
	public Employee getEmployeeById(long id) throws EmployeeNotFound;
}
