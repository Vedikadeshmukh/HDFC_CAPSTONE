package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.employee.DTO.EmployeeDTO;
import com.employee.encryption.AesEncryptor;
import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFound;
import com.employee.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepository repo;
	
	@Override
	public EmployeeDTO getEmployeeById(long id) throws EmployeeNotFound{
		
		Employee emp=repo.findById(id).orElse(null);
		if(emp==null) {
			throw new EmployeeNotFound(null);
		}
		
		EmployeeDTO vo=new EmployeeDTO();
		String x=AesEncryptor.encrypt(emp.getDOB().toString());
		vo.setDOB(x);
		vo.setId(id);
		vo.setName(emp.getName());
		return vo;
	}

	

}
