package com.exception2;

public class NoAlphabeticCharacterInUsernameException extends UsernameException {
	public NoAlphabeticCharacterInUsernameException() {
		super();
	}
	public NoAlphabeticCharacterInUsernameException(String mess) {
		super(mess);
	}
}
