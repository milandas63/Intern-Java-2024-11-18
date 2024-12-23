/*
 * 				*
				***            
				*****          
				*******        
				*********      
				***********    
				*************  
				***************
				*************  
				***********    
				*********      
				*******        
				*****          
				***            
				*              

 */
public class RightArrow {

	public static void main(String[] args) {
		int stars = 1;
		for(int j=0; j<=19; j++) {
			for(int i=0; i<30; i++) System.out.print(" ");
			for(int i=0; i<stars; i++) System.out.print("*");
			System.out.println();
			if(j<9) {
				stars = stars+2;
			} else {
				stars = stars-2;
			}
		}
	}
}
