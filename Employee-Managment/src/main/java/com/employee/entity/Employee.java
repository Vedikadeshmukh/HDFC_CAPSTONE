package com.employee.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	long id;
	@Column(name="employee_name")
	String name;
	@Column(name="employee_date_of_birth")
	Date DOB;
	
	

}
