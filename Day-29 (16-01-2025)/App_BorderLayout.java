package com.gui.awt;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class App_BorderLayout extends JFrame {
	public App_BorderLayout() {
		this.setLayout(new BorderLayout());

		JLabel lblNorth = new JLabel("NORTH", JLabel.CENTER);
		JLabel lblWest = new JLabel("WEST", JLabel.CENTER);
		JLabel lblCenter = new JLabel("CENTER", JLabel.CENTER);
		JLabel lblEast = new JLabel("East", JLabel.CENTER);
		JLabel lblSouth = new JLabel("SOUTH", JLabel.CENTER);

		lblNorth.setBackground(Color.blue);
		lblWest.setBackground(Color.green);
		lblCenter.setBackground(Color.red);
		lblEast.setBackground(Color.yellow);
		lblSouth.setBackground(Color.pink);

		lblNorth.setForeground(Color.white);
		lblWest.setForeground(Color.white);
		lblCenter.setForeground(Color.white);
		lblEast.setForeground(Color.white);
		lblSouth.setForeground(Color.white);

		lblNorth.setOpaque(true);
		lblWest.setOpaque(true);
		lblCenter.setOpaque(true);
		lblEast.setOpaque(true);
		lblSouth.setOpaque(true);

		this.add(lblNorth, BorderLayout.NORTH);
		this.add(lblWest, BorderLayout.WEST);
		this.add(lblCenter, BorderLayout.CENTER);
		this.add(lblEast, BorderLayout.EAST);
		this.add(lblSouth, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(250,200,500,400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new App_BorderLayout();
	}

}
