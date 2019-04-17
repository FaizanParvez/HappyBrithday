/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Admin.*;



public class Registrationframe extends Dbconn {
	
	public int r;
	@SuppressWarnings("deprecation")
	public Registrationframe(){	
		
	JFrame f = new JFrame("MAIN PAGE");
	JPanel p= new JPanel(new GridLayout(0,1));
	
	//LABELS
	JLabel L1=new JLabel("NAME");
	JLabel L2=new JLabel("MOBILE NUMBER");
	JLabel L3=new JLabel("DATE OF BIRTH"+"FORMAT:DATE(DD) MONTH(MM)");
	JLabel L6=new JLabel("YEAR(YYYY)");
        JLabel L4=new JLabel("EMAIL ID");
	JLabel L8=new JLabel("S.NO");
	//BUTTONS
	JButton b1=new JButton("REGISTER");
	
	//TEXT-FIELD
	final JTextField t1=new JTextField(20);
	final JTextField t2=new JTextField(20);
	final JTextField t3=new JTextField(20);
	final JTextField t4=new JTextField(20);
	final JTextField t5=new JTextField(20);
        final JTextField t6=new JTextField(20);
        final JTextField t7=new JTextField(20);
        //ADDING
    p.add(L8);
    p.add(t1);
    p.add(L1);
    p.add(t2);
    p.add(L2);
    p.add(t3);
    p.add(L4);
    p.add(t4);
    p.add(L3);
    p.add(t5);
    p.add(L6);
    p.add(t7);
    
    
    
    Random r1= new Random();
    Integer i= r1.nextInt();
    String z= i.toString();
        
    final JLabel a= new JLabel(z);
    p.add(a);
    p.add(t6);   
    p.add(b1);
    //ACTION LISTNER 
    

	b1.addActionListener(new ActionListener(){	   
		
		public void actionPerformed(ActionEvent ae) {
		
			   String T1=t1.getText();
			   String T2=t2.getText();
			   String T3=t3.getText();
			   String T4=t4.getText();
			   String T5=t5.getText();
			   String T6=t7.getText();
			try{
			
			String sql= "INSERT INTO branch1(S.NO,NAME,PHONE,EMAIL_ID,D_O_B,YEAR)"+"values('"+T1+"','"+T2+"','"+T3+"','"+T4+"','"+T5+"','"+T6+"')";
			
				PreparedStatement s= con.prepareStatement(sql);
			r=s.executeUpdate(sql);
			JOptionPane.showMessageDialog(null,"UPDATED");
		}
			
		
			catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	});
   
	f.getContentPane().add(p);
    f.setVisible(true);
    f.pack();
    

    f.setSize(600,600);
    }
	
	
}
