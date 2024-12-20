package com.exception2;

public class EmptyUsernameException extends UsernameException {
	public EmptyUsernameException() {
		super();
	}
	public EmptyUsernameException(String mess) {
		super(mess);
	}
}
