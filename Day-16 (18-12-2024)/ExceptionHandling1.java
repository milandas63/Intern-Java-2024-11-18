package com.exception;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		int n = 352;
		int j = 0;

		String name = "James Gosling";
		int index = 35;

		char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
		int position = 12;

		for(int i=0; i<1; i++) {
			try {
				double r = n / j;
				System.out.println(r);
				
				System.out.println(name.charAt(index));
				
				System.out.println(vowels[position]);
				
			
	        } catch(ClassCastException e) {
	        	System.out.println("It is a ClassCastException");
	        } catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println("It is an ArrayIndexOutOfBoundsException");
	        	position = 4; i--;
	        } catch(ArithmeticException e) {
	            System.out.println("This is an exception:");
	            j=2; i--;
	        } catch(StringIndexOutOfBoundsException e) {
	        	System.out.println("This is StringIndex");
	        	index = 3; i--;
	        } catch(MyException e) {
	        	
	        }
		}
	}
}


class MyException extends RuntimeException {
	
}


class ImportantException extends ArithmeticException {
	
}
