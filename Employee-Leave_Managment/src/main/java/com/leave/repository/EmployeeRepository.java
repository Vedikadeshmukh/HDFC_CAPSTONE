package com.leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leave.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
