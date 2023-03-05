package com.investec.ums.exception;

public class UserNotfoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private String message;

	public UserNotfoundException() {
	}

	public UserNotfoundException(String msg) {
		super(msg);
		this.message = msg;
	}
}