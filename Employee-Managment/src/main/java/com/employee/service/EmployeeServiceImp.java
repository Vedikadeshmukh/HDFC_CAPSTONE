package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFound;
import com.employee.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepository repo;
	
	@Override
	public Employee getEmployeeById(long id) throws EmployeeNotFound{
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()-> new EmployeeNotFound("Employee not found with:"+id));
	}

}
