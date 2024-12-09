package startup;

public class Invert {

	public static void main(String[] args) {
		String text = "Quick Brown Fox Jumps Over The Lazy Dog";
		char each;
		for (int i = 0; i < text.length(); i++) {
			each = text.charAt(i);
			if (each >= 65 && each <= 90) {
				each = (char) (((int) each) + 32);
			} else if (each >= 97 && each <= 122) {
			}
			System.out.print(each);
		}
	}
}
