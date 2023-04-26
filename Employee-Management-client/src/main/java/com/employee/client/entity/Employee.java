package com.employee.client.entity;

import java.sql.Date;

public class Employee {
	

	private long id;
	private String name;
	private String DOB;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, String name, String dOB) {
		super();
		this.id = id;
		this.name = name;
		this.DOB = dOB;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", DOB=" + DOB + "]";
	}
	
}
