package com.exception2;

public class MinLengthUsernameException extends UsernameException {
	public MinLengthUsernameException() {
		super();
	}
	public MinLengthUsernameException(String mess) {
		super(mess);
	}
}
