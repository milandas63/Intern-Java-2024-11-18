package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reengineer {
	private String name = "java.lang.String";
	
	public Reengineer() {
		try {
			Class o = Class.forName(name);
			Field[] field = o.getDeclaredFields();
			Constructor[] cons = o.getDeclaredConstructors();
			Method[] meth = o.getDeclaredMethods();
			
			System.out.println(name);
			for(int i=0; i<name.length(); i++) System.out.print("-");
			System.out.println();
			
				if(field.length>0) {
					System.out.println("Fields:");
					for(int i=0; i<field.length; i++) {
						System.out.println((i+1)+": "+field[i]);
					}
				
			}
				if(  cons.length>0) {
					System.out.println(" meth:");
					for(int i=0; i<  cons.length; i++) {
						System.out.println((i+1)+": "+  cons[i]);
					}
				
			}
				if( meth.length>0) {
					System.out.println(" meth:");
					for(int i=0; i< meth.length; i++) {
						System.out.println((i+1)+": "+ meth[i]);
					}
				
			}
		 
		}catch(ClassNotFoundException e){
			System.out.println(name+" Class is not found");
			
			
		}
	}

	public static void  main(String[] args) {
		new Reengineer();	
	}
}


