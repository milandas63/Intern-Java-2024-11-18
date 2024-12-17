package startup;

public class ReverseWord {

	public static void main(String[] args) {
		String text = "America is an advanced country";
		//" country advanced an is America""
		for(int i=text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
		}
	}

	}


