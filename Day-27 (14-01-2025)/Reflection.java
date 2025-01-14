package reflection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	private StringBuffer buffer;
	private FileOutputStream inFile;
	
	public Reflection(String className, String fileName) {
		try {
			try {
				inFile = new FileOutputStream(fileName);
			} catch(FileNotFoundException e) {
			} catch(NullPointerException e) {
			}
			
			Class o = Class.forName(className);
			Field[] f = o.getDeclaredFields();
			Constructor[] c = o.getDeclaredConstructors();
			Method[] m = o.getDeclaredMethods();
			
			buffer = new StringBuffer();
			buffer.append(className+"\r\n");
			for(int i=0; i<className.length(); i++)
				buffer.append("-");
			buffer.append("\r\n");

			if(f.length>0) {
				buffer.append("FIELDS:\r\n");
				for(int i=0; i<f.length; i++) {
					buffer.append((i+1)+": "+nopackage(f[i].toString())+"\r\n");
				}
			}

			if(c.length>0) {
				buffer.append("CONSTRUCTORS:\r\n");
				for(int i=0; i<c.length; i++) {
					buffer.append((i+1)+": "+nopackage(c[i].toString())+"\r\n");
				}
			}

			if(m.length>0) {
				buffer.append("METHODS:\r\n");
				for(int i=0; i<m.length; i++) {
					buffer.append((i+1)+": "+nopackage(m[i].toString())+"\r\n");
				}
			}

			buffer.append("\r\n\r\n\r\n");

			try {
				inFile.write(buffer.toString().getBytes());
				inFile.close();
			} catch(NullPointerException e) {
				System.out.println(buffer);
			}
		} catch(ClassNotFoundException e) {
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}

	private String nopackage(String line) {
		StringBuffer buf = new StringBuffer();
		char c;
		boolean take = true;
		for(int i=line.length()-1; i>=0; i--) {
			c = line.charAt(i);
			switch(c) {
			case '.': take = false; break;
			case ' ': take = true; break;
			case ',': take = true; break;
			case '[': take = true; break;
			case ']': take = true; break;
			case '(': take = true; break;
			case ')': take = true; break;
			}

			if(take) {
				buf.insert(0, c);
			}
		}
		return buf.toString();
	}

	public static void main(String[] args) {
		try {
			new Reflection(args[0], args[1]);
		} catch(ArrayIndexOutOfBoundsException e) {
			try {
				new Reflection(args[0], null);
			} catch(ArrayIndexOutOfBoundsException e1) {
				System.out.println("Warning:");
				System.out.println("Command line parameters missing");
				System.out.println("Syntax");
				System.out.println("java Reflection className [helpFileName]");
				System.out.println("");
			}
		}
	}
}
