package com.gui.awt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StudentInfoSys extends JFrame {
	private FileOutputStream outFile; 
	
	private JTextField tfRollno;
	private JTextField tfName;
	private JTextField tfFather;
	private JRadioButton rbMale;
	private JRadioButton rbFemale;
	private JTextField tfDob;
	private JComboBox cbLocation;
	private JComboBox cbQualif;
	private JButton btnSave;
	private JButton btnExit;
	
	public StudentInfoSys() {
		this.setLayout(new BorderLayout());
		
		JLabel lblTitle = new JLabel("STUDENT INFORMATION SYSTEM", JLabel.CENTER);
		lblTitle.setForeground(Color.blue);
		lblTitle.setFont(new Font("Arial",Font.BOLD,20));
		this.add(lblTitle, BorderLayout.NORTH);

		JPanel pnlLabel = new JPanel(new GridLayout(11,1));
		this.add(pnlLabel, BorderLayout.WEST);
			JLabel lblRollno 	= new JLabel("1. Roll No.: ");
			JLabel lblName 		= new JLabel("2. Candidate's Name: ");
			JLabel lblFather 	= new JLabel("3. Father's Name: ");
			JLabel lblGender 	= new JLabel("4. Gender: ");
			JLabel lblDob 		= new JLabel("5. Date of Birth: ");
			JLabel lblLocation 	= new JLabel("6. Location: ");
			JLabel lblQualif 	= new JLabel("7. Qualification: ");
			pnlLabel.add(new JLabel(""));
			pnlLabel.add(new JLabel(""));
			pnlLabel.add(lblRollno);
			pnlLabel.add(lblName);
			pnlLabel.add(lblFather);
			pnlLabel.add(lblGender);
			pnlLabel.add(lblDob);
			pnlLabel.add(lblLocation);
			pnlLabel.add(lblQualif);
			pnlLabel.add(new JLabel(""));
			pnlLabel.add(new JLabel(""));

		JPanel pnlField = new JPanel(new GridLayout(11,1));
		this.add(pnlField, BorderLayout.CENTER);
			tfRollno = new JTextField();
			tfName = new JTextField();
			tfFather = new JTextField();
			JPanel pnlGender = new JPanel(new GridLayout(1,2));
				ButtonGroup bGroup = new ButtonGroup();
				rbMale = new JRadioButton("Male");
				rbFemale = new JRadioButton("Female");
				bGroup.add(rbMale);
				bGroup.add(rbFemale);
				rbMale.setActionCommand("Male");
				rbFemale.setActionCommand("Female");
				pnlGender.add(rbMale);
				pnlGender.add(rbFemale);
			tfDob = new JTextField();
			Vector<String> vLocation = new Vector<String>();
				vLocation.add("Bhubaneswar");
				vLocation.add("Bangalore");
				vLocation.add("Pune");
				vLocation.add("Hyderabad");
				vLocation.add("Kolkata");
				vLocation.add("Mumbai");
			cbLocation = new JComboBox(vLocation);
			Vector<String> vQualif = new Vector<String>();
				vQualif.add("B.Tech");
				vQualif.add("M.Tech");
				vQualif.add("B.Sc");
				vQualif.add("M.Sc");
				vQualif.add("B.Com");
				vQualif.add("M.Com");
			cbQualif = new JComboBox(vQualif);
		pnlField.add(new JLabel(""));
		pnlField.add(new JLabel(""));
		pnlField.add(tfRollno);
		pnlField.add(tfName);
		pnlField.add(tfFather);
		pnlField.add(pnlGender);
		pnlField.add(tfDob);
		pnlField.add(cbLocation);
		pnlField.add(cbQualif);
		pnlField.add(new JLabel(""));
		pnlField.add(new JLabel(""));

		JPanel pnlButton = new JPanel(new GridLayout(1,4));
		this.add(pnlButton, BorderLayout.SOUTH);
			btnSave = new JButton("Save");
			btnExit = new JButton("Exit");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					String rollno = tfRollno.getText();
					String name = tfName.getText();
					String father = tfFather.getText();
					String gender = bGroup.getSelection().getActionCommand();
					String location = cbLocation.getSelectedItem().toString();
					String qualif = cbQualif.getSelectedItem().toString();
					StringBuffer line = new StringBuffer();
					line.append(rollno);
					line.append(",");
					line.append(name);
					line.append(",");
					line.append(father);
					line.append(",");
					line.append(gender);
					line.append(",");
					line.append(location);
					line.append(",");
					line.append(qualif);
					line.append("\r\n");
					System.out.println(line.toString());
				}
			});
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					System.exit(0);
				}
			});
			pnlButton.add(new JLabel(""));
			pnlButton.add(btnSave);
			pnlButton.add(btnExit);
			pnlButton.add(new JLabel(""));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(250,200,500,400);
		this.setVisible(true);
	}

	public Insets getInsets() {
		return new Insets(50,50,20,50);
	}
	
	public static void main(String[] args) {
		new StudentInfoSys();
	}

}
