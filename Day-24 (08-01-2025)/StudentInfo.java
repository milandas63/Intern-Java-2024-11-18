package com.abstrac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentInfo {
	private String outputFileName = "students.csv";
	private BufferedReader keyboard;
	private FileOutputStream ioOutput;

	public StudentInfo() {
		String slno;
		String name;
		String father;
		String gender;
		String dob;
		String qualif;
		String desig;
		String outLine;

		try {
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			ioOutput = new FileOutputStream(outputFileName);

			boolean more = true;

			while(more) {
				for(int i=0; i<25; i++) System.out.println();
				System.out.println("STUDENT INFORMATION SYSTEM");
				System.out.println("--------------------------");
				System.out.println();
				System.out.println();
				System.out.println();
				
				System.out.print("Serial Number:    ");
				slno = keyboard.readLine();
	
				System.out.print("Candidate's Name: ");
				name = keyboard.readLine();
	
				System.out.print("Father's Name:    ");
				father = keyboard.readLine();
	
				System.out.print("Gender:           ");
				gender = keyboard.readLine();
	
				System.out.print("Date of Birth:    ");
				dob = keyboard.readLine();
	
				System.out.print("Qualification:    ");
				qualif = keyboard.readLine();
	
				System.out.print("Designation:      ");
				desig = keyboard.readLine();
	
				outLine = slno+","+name+","+father+","+gender+","+dob+","+qualif+","+desig+"\r\n";
				ioOutput.write(outLine.getBytes());
				
				System.out.println();
				System.out.println();
				System.out.print("More [y/n] :");
				more = keyboard.readLine().toUpperCase().startsWith("Y");
			}
			
			keyboard.close();
			ioOutput.close();
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		}
	}
	
	public static void main(String[] args) {
		new StudentInfo();
	}
}
