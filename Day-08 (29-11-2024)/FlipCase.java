
public class FlipCase {

	public static void main(String[] args) {
		String text = "Quick Brown Fox Jumps Over The Lazy Dog";
		String result = "";
		char each;
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			if(each>=65 && each<=90) {
				each = (char)(((int)each)+32);
			} else if(each>=97 && each<=122) {
				each = (char)(((int)each)-32);
			}
			result = result + each;
		}
		System.out.println("Original: " + text);
		System.out.println("FlipCase: " + result);
	}

}
