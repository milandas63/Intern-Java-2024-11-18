
public class Decoder {

	public static void main(String[] args) {
		String text = "auvdgp wikwi hpwvi";
		String[] words = text.split(" ");
		char c;

		for(int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length(); j++) {
				c = words[i].charAt(i);
				c = (char)(c-j);
				System.out.print(c);
			}
			System.out.print(" ");
		}

	}

}
