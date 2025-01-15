package com.gui.awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Startup {
	private JTextField tfRollno;
	private JTextField tfName;
	
	public Startup() {
//		Frame frm = new Frame("My First Program");
//		frm.setBounds(250,200,600,400);
//		frm.setVisible(true);

		JFrame f = new JFrame("Swing Frame");
		f.setLayout(null);
		JLabel lblTitle = new JLabel("STUDENT INFORMATION SYSTEM",JLabel.CENTER);
		lblTitle.setBounds(2,20,556,35);
		lblTitle.setFont(new Font("Arial",Font.BOLD,20));
		lblTitle.setForeground(Color.blue);
		f.add(lblTitle);

		JLabel lblRollno = new JLabel("1. Roll No.:");
		lblRollno.setBounds(50,100,200,30);
		lblRollno.setFont(new Font("Arial",Font.PLAIN,15));
		f.add(lblRollno);
		
		tfRollno = new JTextField();
		tfRollno.setBounds(251,100,100,30);
		tfRollno.setFont(new Font("Arial",Font.PLAIN,15));
		f.add(tfRollno);

		JLabel lblName = new JLabel("2. Candidate's Name:");
		lblName.setBounds(50,135,200,30);
		lblName.setFont(new Font("Arial",Font.PLAIN,15));
		f.add(lblName);
		
		tfName = new JTextField();
		tfName.setBounds(251,135,250,30);
		tfName.setFont(new Font("Arial",Font.PLAIN,15));
		f.add(tfName);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(250,200,600,400);
		f.setVisible(true);
	
	}
	public static void main(String[] args) {
		new Startup();
	}
}
