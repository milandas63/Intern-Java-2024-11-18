public class Reverse3 {
	public static void main(String[] args) {
		String text = "Quick Brown Fox Jumps Over The Lazy Dog";
		String[] words = text.split(" ");
		StringBuffer buffer;

		for(int i=0; i<words.length; i++) {
			buffer = new StringBuffer(words[i]);
			System.out.print(buffer.reverse()+" ");
		}
		System.out.println();
	}
}
