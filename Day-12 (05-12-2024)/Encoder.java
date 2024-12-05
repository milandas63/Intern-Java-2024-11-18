public class Encoder {
	public static void main(String[] args) {
		String text = "Attack white house";
		String[] words = text.split(" ");
		char c;

		for(int h=0; h<words.length; h++) {
			for(int i=0; i<words[h].length(); i++) {
				c = words[h].charAt(i);
				if(c>=65 && c<=90)  c = (char)(c+32);
				if(c>=97 && c<=122) c = (char)(c+i);
				System.out.print(c);
			}
			System.out.print(" ");
		}
	}
}
