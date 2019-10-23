package org.iuea.oop.views;

import javax.swing.JPanel;

import java.awt.Color;

/*        GROUP MEMBERS
 * MAFABI PIUS KEVIN  18/UG/039/BSSE-S
 * TARTIZIO ZACHARIA ANTHONY  18/205/BIT
 * MASAGAZI DOUGLAS  18/UG/154/BSC-S
 * KIGONGO HARIS KALYANGO  18/UG/485/BSSE-S
 * WAKIDA TREVOR  18/UG/459/BSC-S
 * */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JPanel;

public class LoginView extends JPanel {
	public LoginView() {
		
		
		//Main Login Window
		JFrame f = new JFrame();			
			f.setTitle("Login Page");
			f.setBackground(Color.gray);
			f.setLayout(null);
			f.setSize(500,400);
			f.setLocationRelativeTo(null);	
		
		// Login Window Labels
			//User Name label 
		JLabel b= new JLabel();
			b.setText("User Name :"); 
			b.setBounds(100	, 30, 300, 200);
			f.add(b);
		
		 //Password label
		JLabel bb= new JLabel();
			bb.setText("Password :");
			bb.setBounds(100, 70, 300, 200);
			f.add(bb);		
		
		//Login Window Text field
		 //user name	Text field
		JTextField p = new JTextField();
			p.setBounds(190	, 120, 150, 25);
			f.add(p);
	
		//password	 field
		JPasswordField pp = new JPasswordField();	 //Password Library
			pp.setBounds(190, 160, 150, 25);
			f.add(pp);
		
		//Login Window Buttons		
		//Login button
		JButton mm = new JButton("Login"); 
			mm.setBounds(100, 220, 120, 20);
			f.add(mm);

		// Login action listener
		mm.addActionListener(new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {

			//Label for login confirmation			
			String Name = "pius";		// chosen User Name	
			String Pwd = "pius";    //User password
			String UserInput = p.getText();		//getting the user input	
			String PwdInput = pp.getText();	 //getting the user password			
					
			Pattern pat = Pattern.compile(Name );  //RegExp compiling User Name
			Matcher mat = pat.matcher(UserInput );  //RegExp matching User Name
						
			boolean confirm = mat.matches();  
			//System.out.println(confirm); 
						
			Pattern ptt = Pattern.compile(Pwd );  //RegExp compiling the password
			Matcher mtt = ptt.matcher(PwdInput );  //RegExp matching the password
					
			boolean access = mtt.matches();  
			//System.out.println(access); 
			
			
			
			//if user information is right 
			if(confirm && access ) {
				JOptionPane.showMessageDialog(null,"User Logged in Successfully !!!");				
				
				new  LandingPage();
				f.setVisible(false);
			}
			//if user information is wrong			
			else {JOptionPane.showMessageDialog(null,"UserName & Password doesn't match as expected !!!");

		
			
			}
			

		}          
		});
		
			//Login Window Cancel Button
		JButton m = new JButton("Cancel"); 
			m.setBounds(300	, 220, 120, 20);
			f.add(m);		
		// cancel action listener
			m.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {

			f.setVisible(false); //cancels the main window
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		}          
		});
	
		
			f.setVisible(true); //makes the main window visible
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

				
				
		
	}

}

