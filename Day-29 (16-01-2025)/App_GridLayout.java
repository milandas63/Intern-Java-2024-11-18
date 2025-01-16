package com.gui.awt;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App_GridLayout extends JFrame {
	private GridLayout gl;
	
	public App_GridLayout() {
		gl = new GridLayout(10,2);
		this.setLayout(gl);

		JLabel color;
		JButton month;
		
		String[][] colorMonth = {{"Red","January"},{"Green","February"},{"Blue","March"},{"White","April"},{"Black","May"},{"Pink","June"},{"Cyan","July"},{"Magenta","August"},{"Violet","September"},{"Gray","October"}};
		for(int i=0; i<colorMonth.length; i++) {
			color = new JLabel(colorMonth[i][0]);
			month = new JButton(colorMonth[i][1]);
			this.add(color);
			this.add(month);
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(250,200,500,400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new App_GridLayout();
	}
}
