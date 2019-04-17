/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aaain;
import Admin.*;
import Employee.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.sql.*;


public class Login extends Dbconn {
	        
		public Login(){
	        JLabel l1 =new JLabel("BRANCH ID");
		//FRAME AND PANEL	
		final JFrame f=new JFrame("Login Frame");
		JPanel p=new JPanel(new GridLayout(0,1));
		 
		//TEXT FIELD
		final JTextComponent t1=new JTextField();
		final JTextComponent t=new JTextField();
                t1.setBounds(20,150,20,40);
		
		//PASSWORD FIELD
		final JPasswordField ps1=new JPasswordField();
		
		ps1.setEchoChar('*');
	    
		//BUTTON	    
		JButton b1=new JButton("CONTACT US");
		b1.setBounds(20,130,80,80);
		JButton b2=new JButton("ABOUT US");
		b1.setBounds(50,130,80,80);
		JButton b3=new JButton("LOGIN");                
		b3.setBounds(20,30,80,80);
		//LABELS
		JLabel L1=new JLabel("USERNAME");
		L1.setBounds(20,50,80,80);
		JLabel L2=new JLabel("PASSWORD");
		L1.setBounds(20,30,80,80);    
        //Contact and About button
	    p.add(b1);
	    p.add(b2);
	    p.add(l1);
            p.add(t);
	    //Labels
	    p.add(L1);
	    p.add(t1);//username 
	
	    p.add(L2);	
	    p.add(ps1);//password
		     
	  	//ACTION-LISTNER
		
		b3.addActionListener(new ActionListener(){
                         @Override
			 public void actionPerformed(ActionEvent ae) {
			    final String z1=t.getText();	
		            final String Um= t1.getText();
	    		    @SuppressWarnings("deprecation")
	    		    final String ps= ps1.getText();	
	    		    
			    			  
			    			  try{   				    	    					
			    					String sql= "select SNO,USERNAME,PASSWORD from login";
			    					PreparedStatement s= con.prepareStatement(sql);
			    					ResultSet r=s.executeQuery(sql);
			    					
			    					
			    					while(r.next()){
			    					String z= r.getString("SNO");          
			    					String u= r.getString("USERNAME");
			    					String p=r.getString("PASSWORD");
			    					
			    						if (z1.equals("1")&&Um.equals(u)&&ps.equals(p)) 
                                                                        {
			    						  f.dispose();
			    						  JOptionPane.showMessageDialog(null,"Username and Password exist");	
			    			                          new xdminframe().setVisible(true);
                                                                          break;
			    			                        }
			    					
                                                                        else if (z1.equals("2")&&Um.equals(u)&&ps.equals(p)) 
                                                                        {
			    						  f.dispose();
                                                                          JOptionPane.showMessageDialog(null,"Username and Password exist");	
			    			                          new Manager().setVisible(true);
                                                                          break;  
                                                                        }
                                                                        else if (z1.equals("3")&&Um.equals(u)&&ps.equals(p)) 
                                                                        {
			    						  f.dispose();
                                                                          JOptionPane.showMessageDialog(null,"Username and Password exist");	
			    			                          new Manager2().setVisible(true);
                                                                          break;
			    			                        }
                                                                        else if (z1.equals("4")&&Um.equals(u)&&ps.equals(p)) 
                                                                        {
			    						  f.dispose();
                                                                          
			    						  JOptionPane.showMessageDialog(null,"Username and Password exist");	
			    			                          
                                                                          new Manager3().setVisible(true);
                                                                          break;
			    			                        }
                                                                        else if (z1.equals("5")&&Um.equals(u)&&ps.equals(p)) 
                                                                        {
			    						  f.dispose();                                                                       
			    						  JOptionPane.showMessageDialog(null,"Username and Password exist");	    			                          
                                                                          new Manager4().setVisible(true);
                                                                          break;
			    			                        }
                                                                
                                                                
                                                                
			    						
			    								
			    								
			    							}}
			    								
			    						
			    					
			    			  catch(SQLException | HeadlessException e)
			    				{
			    					System.out.println(e);
			    				}}});
			      p.add(b3);		
			      Insets insets = p.getInsets();
			        Dimension size = b1.getPreferredSize();
			        b1.setBounds(25 + insets.left, 5 + insets.top,size.width, size.height);
			        size = b2.getPreferredSize();
			        b2.setBounds(55 + insets.left, 40 + insets.top,size.width, size.height);
			        size = b3.getPreferredSize();
			        b3.setBounds(150 + insets.left, 15 + insets.top,size.width + 50, size.height + 20);	      
        f.getContentPane().add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,300);
        f.setVisible(true);    
	    }
/** 
public static void main(String[]args){
	new Login();
        System.out.println("abc");
}
**/
}