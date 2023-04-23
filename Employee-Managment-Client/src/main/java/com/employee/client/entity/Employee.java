package com.employee.client.entity;

import java.sql.Date;


public class Employee {

	private long id;
	private String name;
	private Date DOB;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, String name, Date dOB) {
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
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", DOB=" + DOB + "]";
	}
	
	
	
}
