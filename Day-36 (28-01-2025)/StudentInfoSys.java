package com.jdbc;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.GridLayout;
	import java.awt.Insets;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

	import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;

	public class StudentInfoSys extends JFrame {
		private Connection conn;
		private PreparedStatement pStmt;
		private ResultSet rs;

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
			try {
				Class.forName("org.gjt.mm.mysql.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance18", "root", "root");
				pStmt = conn.prepareStatement("SELECT * FROM student2", ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				rs = pStmt.executeQuery();
				 
			} catch(ClassNotFoundException e) {
			} catch(SQLException e) {
			}
			
			JMenuBar menubar = new JMenuBar();
			this.setJMenuBar(menubar);
			JMenu mnuAction = new JMenu("Action");
			menubar.add(mnuAction);
				JMenuItem itmAdd = new JMenuItem("Add");
				JMenuItem itmEdit = new JMenuItem("Edit");
				JMenuItem itmDele = new JMenuItem("Delete");
				mnuAction.add(itmAdd);
				mnuAction.add(itmEdit);
				mnuAction.add(itmDele);

			JMenu mnuExit = new JMenu("Exit");
			menubar.add(mnuExit);
				JMenuItem itmExit = new JMenuItem("Exit");
				JMenuItem itmClear = new JMenuItem("Clear");
				mnuExit.add(itmExit);
				mnuExit.add(itmClear);

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
					rbMale.setActionCommand("M");
					rbFemale.setActionCommand("F");
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
						String dob = tfDob.getText();
						String location = cbLocation.getSelectedItem().toString();
						String qualif = cbQualif.getSelectedItem().toString();
						 try {
							 rs.moveToInsertRow();
							 rs.updateString(1, rollno);
							 rs.updateString(2, name);
							 rs.updateString(3, father);
							 rs.updateString(4, gender); 
							 rs.updateString(5, dob );
							 rs.updateString(6, location);
							 rs.updateString(7, qualif);
							 rs.insertRow();
							 rs.moveToCurrentRow();
						} catch(SQLException e) {
							System.out.println(e);
						}
					}
				});
				btnExit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						try {
							rs.close();
							pStmt.close();
							conn.close();
						} catch(SQLException e) {
						}
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