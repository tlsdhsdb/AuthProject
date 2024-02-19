package com.mogul.demo.advice;

import org.apache.coyote.Response;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mogul.demo.util.ErrorResponse;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class ExceptionManager {
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleEntityNotFoundException(EntityNotFoundException ex) {
		return ResponseEntity.ok(new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage()));
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public ResponseEntity<ErrorResponse> handleDuplicateKeyException(DuplicateKeyException ex) {
		return ResponseEntity.ok(new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage()));
	}

	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUsernameNotFoundException(UsernameNotFoundException ex){
		return ResponseEntity.ok(new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage()));
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorResponse> handleIllegalArgumentException(IllegalArgumentException ex){
		return ResponseEntity.ok(new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage()));
	}
}
