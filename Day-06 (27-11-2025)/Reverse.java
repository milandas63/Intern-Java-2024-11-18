
public class Reverse {

	public static void main(String[] args) {
		String text = "I am a proud Indian";
		//	"naidnI duorp a ma I"
		for(int i=text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
		}
	}

}
