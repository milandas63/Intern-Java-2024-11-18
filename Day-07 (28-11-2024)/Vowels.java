
public class Vowels {

	public static void main(String[] args) {
		String text = "Python programmers must know every possible way to run the Python scripts or code.";
		int count = 0;
		char each;
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			if(each=='A' || each=='a') {
				count = count+1;
			} else if(each=='E' || each=='e') {
				count = count+1;
			} else if(each=='I' || each=='i') {
				count = count+1;
			} else if(each=='O' || each=='o') {
				count = count+1;
			} else if(each=='U' || each=='u') {
				count = count+1;
			}
		}
		System.out.println("Total: "+count);

	
		String vowels = "AEIOUaeiou";
		count = 0;
		for(int i=0; i<text.length(); i++) {
			each = text.charAt(i);
			for(int j=0; j<vowels.length(); j++) {
				if(each == vowels.charAt(j)) {
					count = count+1;
					break;
				}
			}
		}
		System.out.println("Total-2: "+count);
	}

}
