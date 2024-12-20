package com.exception2;

public class NoUppercaseCharacterInUsernameException extends UsernameException {
	public NoUppercaseCharacterInUsernameException() {
		super();
	}
	public NoUppercaseCharacterInUsernameException(String mess) {
		super(mess);
	}
}
