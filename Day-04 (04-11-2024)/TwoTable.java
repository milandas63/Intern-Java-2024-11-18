
public class TwoTable {
	public static void main(String[] args) {
		int n = 2;
		for(int i=1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + (i*n));
		}
		System.out.println();
		///////////////////////////////////////////////////////
		
		int start = 2;
		int end = 25;
		for(int i=start; i<=end; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}

		System.out.println();
		///////////////////////////////////////////////////////

		for(int h=start; h<=end; h+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=h; j<=h+4; j++) {
					System.out.print(padLeft(j,2) + " x " + padLeft(i,2) + " = " + padLeft((i*j),3) + "  ");
					if(j>=end) break;
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}
	
	static String padLeft(int n, int w) {
		String r = ""+n;
		for(int i=r.length(); i<w; i++) {
			r = " "+r;
		}
		return r;
	}
}
