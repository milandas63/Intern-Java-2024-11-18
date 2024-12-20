package com.exception2;

public class MaxLengthUsernameException extends UsernameException {
	public MaxLengthUsernameException() {
		super();
	}
	public MaxLengthUsernameException(String mess) {
		super(mess);
	}
}
