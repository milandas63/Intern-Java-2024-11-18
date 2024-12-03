package startup1;

public class AsciiSum {

	public static void main(String[] args) {
      String name = "Suraj Samal";
      char each;
      int sum = 0;
      
      for(int i =0; i<name.length(); i++)
      {
    	  each = name.charAt(i);
    	  sum = sum + ((int)each);
      }
      System.out.println(sum);
	}

}
