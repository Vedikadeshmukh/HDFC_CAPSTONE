package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.DTO.EmployeeDTO;
import com.example.encryption.AesEncryptor;
import com.example.entity.Employee;
import com.example.exception.EmployeeNotFound;
import com.example.repository.EmployeeRepo;


@Service
public class ImpEmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public EmployeeDTO getEmployeeById(long id) throws Exception{
		Employee emp=repo.findById(id).orElse(null);
	
		if(emp==null) {
			throw new EmployeeNotFound(null);
		}

		EmployeeDTO dto=new EmployeeDTO();

		String x=AesEncryptor.encrypt(emp.getDOB().toString());
		dto.setDOB(x);
		dto.setId(id);
		dto.setName(emp.getName());
		return dto;
}
}
