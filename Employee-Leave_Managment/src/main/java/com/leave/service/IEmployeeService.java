package com.leave.service;

import java.util.List;

import com.leave.DTO.EmployeeDTO;
import com.leave.entity.Employee;

public interface IEmployeeService {
	
	
	public Employee add(EmployeeDTO empDTO);
	
	public Employee getEmpById(long id);

	
	public void deletebyid(long id);

	public Employee updateEmp(EmployeeDTO empDTO);
	
	public List<Employee> gaetAll();

}
