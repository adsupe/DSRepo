package com.cg.scb.book;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ApiExceptionResponseMessage> handleBookNotFoundException(BookNotFoundException e){
		ApiExceptionResponseMessage apiResponse = new ApiExceptionResponseMessage(e.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ApiExceptionResponseMessage>(apiResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BookNotFoundByNameException.class)
	public ResponseEntity<ApiExceptionResponseMessage> handleBookNotFoundByNameException(BookNotFoundByNameException e){
		ApiExceptionResponseMessage api = new ApiExceptionResponseMessage(e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ApiExceptionResponseMessage>(api, HttpStatus.NOT_FOUND);
	}
}
