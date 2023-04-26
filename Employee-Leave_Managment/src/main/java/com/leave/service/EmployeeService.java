package com.leave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.DTO.EmployeeDTO;
import com.leave.entity.Employee;
import com.leave.repository.EmployeeRepository;


@Service
public class EmployeeService implements IEmployeeService {
	
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee add(EmployeeDTO empDTO) {
		
		Employee emp = new Employee();
		emp.setEmployee_id(empDTO.getEmployee_id());
		emp.setName(empDTO.getName());
		emp.setEmail(empDTO.getEmail());
		emp.setPhoneNumber(empDTO.getPhoneNumber());
		emp.setDepartment(empDTO.getDepartment());
		
		return repo.save(emp);
	}

	@Override
	public Employee getEmpById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmp(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.setEmployee_id(empDTO.getEmployee_id());
		emp1.setName(empDTO.getName());
		emp1.setEmail(empDTO.getEmail());
		emp1.setPhoneNumber(empDTO.getPhoneNumber());
		emp1.setDepartment(empDTO.getDepartment());
		
		
		return repo.save(emp1);
	}

	@Override
	public void deletebyid(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public List<Employee> gaetAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
