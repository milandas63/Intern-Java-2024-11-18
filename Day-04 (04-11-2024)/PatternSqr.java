
public class PatternSqr {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=0; j<20; j++) System.out.print(" ");
			if(i==1 || i==3) {
				for(int j=1; j<=9; j++) System.out.print(j);
			} else {
				for(int j=9; j>=1; j--) System.out.print(j);
			}
			System.out.println();
		}
	}

}
