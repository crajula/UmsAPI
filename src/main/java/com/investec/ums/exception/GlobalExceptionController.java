package com.investec.ums.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(value = UserNotfoundException.class)
	public ResponseEntity<Object> exception(UserNotfoundException ex) {
		return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = UserPresentExcetption.class)
	public ResponseEntity<Object> exception(UserPresentExcetption ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}