package com.exception2;

public class UsernameException extends LoginException {
	public UsernameException() {
		super();
	}
	public UsernameException(String mess) {
		super(mess);
	}
}
