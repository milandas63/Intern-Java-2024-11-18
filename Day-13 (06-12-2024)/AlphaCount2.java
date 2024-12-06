
public class AlphaCount2 {

	public static void main(String[] args) {
		String text = "Hello world";
		char c;

		int[] alphaCount = new int[26];
		for(int i=0; i<alphaCount.length; i++) alphaCount[i] = 0;

		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			if(c>=65 && c<=90) {
				alphaCount[c-65]++;
			} else if(c>=97 && c<=122) {
				alphaCount[c-97]++;
			}
		}

		for(int i=0; i<alphaCount.length; i++) {
			if(alphaCount[i]>0)
				System.out.println(((char)(i+65)) + " == " + alphaCount[i] );
		}
	}
}
