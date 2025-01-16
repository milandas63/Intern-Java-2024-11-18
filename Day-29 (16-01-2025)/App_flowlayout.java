package com.gui.awt;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App_flowlayout extends JFrame {
	public App_flowlayout() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
		this.setTitle("FlowLayout Demo");
		
		JButton btnDummy;
		String[] colors = {"Red","Green","Blue","White","Black","Cyan","Yellow","Pink","Brown","Magenta","Silver","Golden","Orange"};
		for(int i=0; i<colors.length; i++) {
			btnDummy = new JButton(colors[i]);
			this.add(btnDummy);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(250,200,500,400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new App_flowlayout();
	}

}
