package com.zeptoorder.exception;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.zeptoorder.response.ErrorResponse;

@RestControllerAdvice
public class ZeptoExceptionHandler {
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(ProductNotFoundException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("MYN-001");
		return ResponseEntity.ok(errorResponse);
	}

}
