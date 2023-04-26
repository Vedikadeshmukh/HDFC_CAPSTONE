package com.leave.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class LeaveRequestDTO {
	
	private long leave_request_id;
	private Date startDate;
	private Date endDate;
	private String leaveType;
	private String reason;
	private String status;
	private String comment;
	private long employee_id;

}
