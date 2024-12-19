package com.exception;

public class VoterIDCard {

	public static void main(String[] args) {
		int[] ages = {25,33,-55,66,51,0,99,73,77,12,45,15,81,76,18,-11,56,0,33};
		
		for(int i=0; i<ages.length; i++) {
			try {
				checkAge(ages[i]);
				System.out.println(ages[i]+" is a valid age");
			} catch(NegativeAgeException e) {
				System.out.println(ages[i]+" is negative age");
			} catch(ZeroAgeException e) {
				System.out.println(ages[i]+" is zero age");
			} catch(TooYoungAgeException e) {
				System.out.println(ages[i]+" is too young age");
			} catch(TooOldAgeException e) {
				System.out.println(ages[i]+" is too old age");
			}
		}
	}

	static void checkAge(int age) throws NegativeAgeException,
 										 ZeroAgeException,
										 TooYoungAgeException,
										 TooOldAgeException
	{
		if(age<0) throw new NegativeAgeException();
		else if(age==0) throw new ZeroAgeException();
		else if(age<18) throw new TooYoungAgeException();
		else if(age>90) throw new TooOldAgeException();
	}
}
