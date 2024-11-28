
public class Reverse2 {

	public static void main(String[] args) {
		String result = "";
		String text = "Kingdom of God";
		for(int i=text.length()-1; i>=0; i--) {
			result = result+text.charAt(i);
		}
		System.out.println("Original: "+text);
		System.out.println("Reverse:  "+result);
	}

}
