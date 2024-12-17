package iig.accounts;

public class StaticField {
    public static String animal = "GODZILLA";
    public String child = "TOADLING";
	
	public static void main(String[] args) {
		StaticField s1 = new StaticField();
		StaticField s2 = new StaticField();
		StaticField s3 = new StaticField();
		
		System.out.println(StaticField.animal+ " / " + s1.child);
		System.out.println(StaticField.animal+ " / " + s2.child);
		System.out.println(StaticField.animal+ " / " + s3.child);
		System.out.println();
		
		StaticField.animal = "CROCODILE";
		s3.child = "CROCCHILD";

		System.out.println(StaticField.animal+ " / " + s1.child);
		System.out.println(StaticField.animal+ " / " + s2.child);
		System.out.println(StaticField.animal+ " / " + s3.child);
	}
}
