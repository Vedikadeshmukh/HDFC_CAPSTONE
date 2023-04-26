package com.leave.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class EmployeeDTO {
	
	private long employee_id;
	private String name;
	private String email;
	private String phoneNumber;
	private String department;



}
