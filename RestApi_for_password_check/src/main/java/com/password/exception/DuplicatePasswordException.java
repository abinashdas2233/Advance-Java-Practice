package com.password.exception;

public class DuplicatePasswordException extends RuntimeException {
	public DuplicatePasswordException(String msg) {
		super(msg);
	}

}
