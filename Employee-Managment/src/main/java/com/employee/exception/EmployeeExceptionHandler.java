package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<Object> handleEmployeeNotFound(EmployeeNotFound ex){
		return  new ResponseEntity<>(ex+"",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
