package com.exception2;

public class NoDigitCharacterInUsernameException extends UsernameException {
	public NoDigitCharacterInUsernameException() {
		super();
	}
	public NoDigitCharacterInUsernameException(String mess) {
		super(mess);
	}
}
