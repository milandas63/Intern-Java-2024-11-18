package com.exception2;

public class ValidateLogin {
	String username;
	String password;
	
	public ValidateLogin(String username, String password) {
		this.username = username;
		this.password = password;

		try {
			checkUserName();
			checkPassword();
		} catch(EmptyUsernameException e) {
		} catch(MinLengthUsernameException e) {
		} catch(MaxLengthUsernameException e) {
		} catch(NoAlphabeticCharacterInUsernameException e) {
		} catch(NoDigitCharacterInUsernameException e) {
		} catch(NoUppercaseCharacterInUsernameException e) {
		}
	}

	public static void main(String[] args) {
		new ValidateLogin("M","Password");
	}

	void checkUserName() throws EmptyUsernameException,
								MinLengthUsernameException,
								MaxLengthUsernameException,
								NoAlphabeticCharacterInUsernameException,
								NoDigitCharacterInUsernameException,
								NoUppercaseCharacterInUsernameException	
	{
		if(username.trim().length()==0) throw new EmptyUsernameException();
		if(username.trim().length()<3) throw new MinLengthUsernameException();
		if(username.trim().length()>=16) throw new MaxLengthUsernameException();

		char c;
		boolean yn = true;
		for(int i=0; i<username.length(); i++) {
			c = username.charAt(i);
			if( !(c>=65 && c<=90) || !(c>=97 && c<=122) ) {
				yn = false;
				break;
			}
		}
		if(!yn) throw new NoAlphabeticCharacterInUsernameException();

		
	}
	void checkPassword() {
		
	}
}
