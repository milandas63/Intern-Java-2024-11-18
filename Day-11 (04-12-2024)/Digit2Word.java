public class Digit2Word {
	public static void main(String[] args) {
		String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] nums = {"12345","03786","72913","7978168568"};
		
		int n;
		char c;
		String s;
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+": ");
			for(int j=0; j<nums[i].length(); j++) {
				c = nums[i].charAt(j);
				//s = String.valueOf(c);
				//n = Integer.parseInt(s);
				
				n = ((int)c) - 48;
				System.out.print(words[n]+" ");
			}
			System.out.println();
		}
	}
}

