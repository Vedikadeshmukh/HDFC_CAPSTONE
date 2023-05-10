package com.employee.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotfound.class)
	public ResponseEntity<String> handleEmployeeNotfound(Exception e){
		return  new ResponseEntity<String>("Invalid employee id",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<String> handleInvalidFormantException(NumberFormatException ex){
		return  new ResponseEntity<String>("Please enter parameters in the given format", HttpStatus.BAD_REQUEST);
		
	}
	
}
