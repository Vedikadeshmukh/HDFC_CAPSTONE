package com.leave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.DTO.LeaveRequestDTO;
import com.leave.entity.LeaveRequest;
import com.leave.repository.LeaveRequestRepository;

@Service
public class LeaveRequestService implements ILeaveRequestService {
	
	@Autowired
	LeaveRequestRepository repo;

	@Override
	public LeaveRequest addRequest(LeaveRequestDTO reqDTO) {
		// TODO Auto-generated method stub
		
		LeaveRequest req= new LeaveRequest();
		req.setLeave_request_id(reqDTO.getLeave_request_id());
		req.setEmployee_id(reqDTO.getEmployee_id());
		req.setStartDate(reqDTO.getStartDate());
		req.setEndDate(reqDTO.getEndDate());
		req.setReason(reqDTO.getReason());
		req.setLeaveType(reqDTO.getLeaveType());
		return repo.save(req);
	}

	@Override
	public void deletereq(long id) {
		repo.deleteById(id);
		
	}

	@Override
	public LeaveRequest getReqById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}
	

}
