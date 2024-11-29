
public class WordFrame {

	public static void main(String[] args) {
		String text = "An excellent evening to dance and enjoy";
		String[] words = text.split(" ");

		int big = 0;
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>big) {
				big = words[i].length();
			}
		}
		
		System.out.println(replicate("*",big+4));
		for(int i=0; i<words.length; i++) {
			System.out.println("* "+padRight(words[i], big)+" *");
		}
		System.out.println(replicate("*",big+4));
	}

	public static String replicate(String text, int width) {
		String retval = "";
		for(int i=0; i<width; i++) retval = retval+"*";
		return retval;
	}
	
	public static String padRight(String text, int width) {
		String retval = text;
		for(int i=retval.length(); i<width; i++) {
			retval = retval + " ";
		}
		return retval;
	}
}
