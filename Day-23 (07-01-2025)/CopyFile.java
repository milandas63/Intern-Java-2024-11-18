package com.abstrac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public String inputFile;
	public String outputFile;
	public FileInputStream inFile;
	public FileOutputStream outFile;
	
	public CopyFile() {
		try {
			inputFile = "IIG-INFRA.pdf";
			outputFile = "IIG.pdf";
			File f = new File(inputFile);
			double size5pc = f.length() * .05;
			inFile = new FileInputStream(f);
			outFile = new FileOutputStream(outputFile);
			
			int rValue = 0;
			long counter = 0;
			while( (rValue=inFile.read()) != -1 ) {
				outFile.write(rValue);
				counter++;
				if(counter>size5pc) {
					counter = 0;
					System.out.print(".");
				}
			}
			System.out.println("End");
		} catch(FileNotFoundException e) {
			System.err.println(e);
		} catch(IOException e) {
			System.err.println(e);
		} catch(Exception e) {
			System.err.println(e);
		}
		
	}

	public static void main(String[] args) {
		new CopyFile();
	}
}
