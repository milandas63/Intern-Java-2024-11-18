
public class Series4 {
	public static void main(String[] args) {
		int seed = 1;
		for(int i=1; i<=10; i++) {
			System.out.print(seed+" ");
			if(i%2==0) {
				seed = seed * 2;
			} else {
				seed = seed * 3;
			}
		}
	}
}
