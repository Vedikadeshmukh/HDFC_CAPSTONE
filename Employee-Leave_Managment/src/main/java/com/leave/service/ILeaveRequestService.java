package com.leave.service;

import com.leave.DTO.LeaveRequestDTO;

import com.leave.entity.LeaveRequest;

public interface ILeaveRequestService {
	
	
	public LeaveRequest addRequest(LeaveRequestDTO reqDTO);
	
	
	public void deletereq(long id);
	
	public  LeaveRequest getReqById(long id);


}
