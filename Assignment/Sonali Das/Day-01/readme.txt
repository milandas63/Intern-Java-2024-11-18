package startup;

public class SecPrimeNo {

	public static void main(String[] args) {
		int start = 50000;
		int end = 100000;
		int count = 0;
		for(int i=start; i<end; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
                              System.out.print(i+" ");
			         count++;
				if(count>=10) {
				System.out.println();
				count = 0;
         
					
				}
		}
		 
		

	}


	}
}

