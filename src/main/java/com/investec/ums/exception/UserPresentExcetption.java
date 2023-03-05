package com.investec.ums.exception;

public class UserPresentExcetption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private String message;

	public UserPresentExcetption() {
	}

	public UserPresentExcetption(String msg) {
		super(msg);
		this.message = msg;
	}
}