
public class SumAsc {
	public static void main(String[] args) {
		String name = "Sonali Das";
		char each;
		int sum = 0;
		
		for(int i=0; i<name.length(); i++) {
			each = name.charAt(i);
			sum = sum + ((int)each);
		}
		System.out.println(sum);
	}
}
