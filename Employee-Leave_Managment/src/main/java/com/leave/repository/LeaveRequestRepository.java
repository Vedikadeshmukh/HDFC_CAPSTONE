package com.leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leave.entity.LeaveRequest;



public interface LeaveRequestRepository extends JpaRepository<LeaveRequest,Long>{

}
