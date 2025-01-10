package reflection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reengineer {
	private String name = "java.lang.String";
	private String outFile = "String.txt";
	private StringBuffer buffer;
	private FileOutputStream ioFile;

	public Reengineer() {
		buffer = new StringBuffer();

		try {
			ioFile = new FileOutputStream(outFile);
			Class obj = Class.forName(name);
			Field[] f = obj.getDeclaredFields();
			Constructor[] c = obj.getDeclaredConstructors();
			Method[] m = obj.getDeclaredMethods();

			buffer.append(name+"\r\n");
			for(int i=0; i<name.length(); i++)
				buffer.append("-");
			buffer.append("\r\n");

			if(f.length>0) {
				buffer.append("FIELDS:\r\n");
				for(int i=0; i<f.length; i++) {
					//System.out.println((i+1)+": "+nopackage(f[i].toString()));
					buffer.append((i+1)+": "+nopackage(f[i].toString())+"\r\n");
				}
			}

			if(c.length>0) {
				buffer.append("CONSTRUCTORS:\r\n");
				for(int i=0; i<c.length; i++) {
					//System.out.println((i+1)+": "+nopackage(c[i].toString()));
					buffer.append((i+1)+": "+nopackage(c[i].toString())+"\r\n");
				}
			}

			if(m.length>0) {
				buffer.append("METHODS:\r\n");
				for(int i=0; i<m.length; i++) {
					//System.out.println((i+1)+": "+nopackage(m[i].toString()));
					buffer.append((i+1)+": "+nopackage(m[i].toString())+"\r\n");
				}
			}
			System.out.println(buffer);
			ioFile.write(buffer.toString().getBytes());
			ioFile.close();
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
		new Reengineer();
	}

}
