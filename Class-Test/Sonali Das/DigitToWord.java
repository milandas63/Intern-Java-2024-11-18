package startup;

public class DigitToWord {

	public static void main(String[] args) {
		String[] words = {"zero","one","two","three", "four","five","six","seven","eight","nine"};
		String[] nums = {"12345","03786","72913",};
		 char c;
		String s;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length();j++) {
				c = nums[i].charAt(j);
				s = String.valueOf(c);
				
				 System.out.print(words+" ");
			}
			 
		}
	}
		
	



	}


