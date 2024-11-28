
public class ReverseWord {

	public static void main(String[] args) {
        String[] words = {"Quick","Brown","Fox","Jumps","Over","The","Lazy","Dog"};
        for(int i=0; i<words.length; i++) {
        	for(int j=words[i].length()-1; j>=0; j--) {
        		System.out.print(words[i].charAt(j));
        	}
        	System.out.print(" ");
        }
        System.out.println();
        System.out.println("/////////////////////////////////////////");
        
        String text = "Quick Brown Fox Jumps Over The Lazy Dog";
        words = text.split(" ");
        for(int i=0; i<words.length; i++) {
        	for(int j=words[i].length()-1; j>=0; j--) {
        		System.out.print(words[i].charAt(j));
        	}
        	System.out.print(" ");
        }
        System.out.println();
        System.out.println("/////////////////////////////////////////");
        
	}

}
