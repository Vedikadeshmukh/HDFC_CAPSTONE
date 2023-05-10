package com.example.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
	@NotNull
	private long id;
	@Column(name="employee_name")
	@NotBlank
	@NotNull
	private String name;
	
	@Column(name="employee_date_of_birth")
	@NotNull
	private Date DOB;
	
	
	

}
