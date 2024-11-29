
public class ToUpperCase {

	public static void main(String[] args) {
		String original = "google meet";
		char each;
		for(int i=0; i<original.length(); i++) {
			each = original.charAt(i);
			each = (char) (((int)each)-32);
			System.out.print(each);
		}
	}
}
