package startup;

public class DiamondB {

	public static void main(String[] args) {
		int space = 30;
		String Char= "*";
		int  Stars = 10;
		for(int i = Stars; i>=1; i--) {
			System.out.println(String.format)(String.repeat(i-1), Char.repeat((Stars-i)*2+1)));
			}
		for(int i = 1; i<Stars; i++) {
			System.out.println(String.format)(String.repeat(i), Char.repeat((Stars-i)*2-1)));
			
		}
	}

}

