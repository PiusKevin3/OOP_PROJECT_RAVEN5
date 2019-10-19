package org.iuea.oop.views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.toedter.calendar.JDateChooser;


public class LandingPage extends JPanel {
	
	public  LandingPage() {
		
		//MAIN FRAME
		JFrame Lpage = new JFrame();
		 Lpage.setTitle("Student Information");
		 Lpage.setSize(700,400);
		 Lpage.setLocationRelativeTo(null);
		
		 //MENU BAR SECTION
		 JMenuBar mb = new  JMenuBar();
		 Lpage.setJMenuBar(mb);
		 //MENU INFORMATION
		 JMenu m = new JMenu("            Action          ");
		 mb.add(m);		 
		 JMenu k = new JMenu("            Help          ");
		 mb.add(k);
		 //LOGOUT MENU ITEM
		 JMenuItem Lg = new JMenuItem("         Log Out       ");		
		 m.add(Lg);
		 
		 JPanel Main,FPanel,SPanel,BPanel,TPanel,AddSec,dd;
		 //MAIN PANEL OF THE WINDOW
		 Main = new JPanel();
		 Main.setBackground(Color.gray);
		 Main.setLayout(new BorderLayout());
		 Lpage.getContentPane().add(Main);
		 
		 //LOG OUT ACTION LISTENER
		 Lg.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {													
					Lpage.setVisible(false);
					 new LoginView();
				}       
		 });
		 
		 //FOOTER SECTION
		 FPanel = new JPanel();		 
		 JLabel leb = new JLabel("Copy right ravens5 2019");
		 FPanel.setBorder( BorderFactory.createMatteBorder(1,0,0,0,Color.BLACK));
		 FPanel.add(leb);
		 Main.add(FPanel,BorderLayout.SOUTH);
		 
		 //SIDE PANEL
		 SPanel = new JPanel();
		 SPanel.setBackground(Color.WHITE);
		 SPanel.setBorder( BorderFactory.createMatteBorder(0,0,0,1,Color.BLACK));	
		 SPanel.setVisible(true);
		 Main.add(SPanel,BorderLayout.WEST);
		 
		 //BTN SECTION
		 BPanel = new JPanel();
		// BPanel.setBackground(Color.RED);
		 BPanel.setLayout(new GridLayout(0,1));
		 SPanel.setVisible(true);
		 SPanel.add(BPanel);
		 //SIDE BAR CONTENT
		 JButton student,b2,b3,b4;
		 student = new JButton("Students");	
		// b1.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(student);
		 b2 = new JButton("Course");
		// b2.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(b2);
		 b3 = new JButton("Course Units");
		// b3.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(b3);
		 b4 = new JButton("Lecturers");	
		// b4.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		 BPanel.add(b4);		 
//
//			//The Student page	****TAZAN*****		
	

//			//THE TABLE SECTION   ****TAZAN*****
		 
					
			
					//ADD RECORD SECTION ****DOUGLAS****
//					
//					
//					//ADDING DATA TO THE TABLE ACTION LISTENER AREA ****TAZAN****
//					//EDIT SECTION OF THE TABLE    ****TREVOR****
//					//DELETE SECTION OF THE TABLE ****HARRIS****
		 
		 Lpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Lpage.setVisible(true); //setting the LandPage visible		 
	}
}
