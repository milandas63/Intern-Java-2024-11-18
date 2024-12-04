public class Series3 {
	public static void main(String[] args) {
		int seed = 1;
		for(int i=2; i<=11; i++) {
			System.out.print(seed+" ");
			seed = seed * i;
		}
	}
}
