package com.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leave.DTO.LeaveRequestDTO;
import com.leave.entity.LeaveRequest;
import com.leave.service.ILeaveRequestService;


@RestController
@RequestMapping("/api/employee/leave")
public class LeaveRequestController {
	
	@Autowired
	ILeaveRequestService service;

	
	@PostMapping("/send/LeaveRequest")
	public LeaveRequest addRequest(@RequestBody LeaveRequestDTO reqDTO) {
		return service.addRequest(reqDTO);
	}
	
	@DeleteMapping("/delete/Request/{id}")
	public ResponseEntity<String> deletereq(@PathVariable long id) {
		service.deletereq(id);
		return new ResponseEntity<String>("Request deleted",HttpStatus.OK);
	}
	
	
	@GetMapping("/get/leaveRequest/{id}")
	public  LeaveRequest getReqById(long id) {
		return service.getReqById(id);
	}

}
