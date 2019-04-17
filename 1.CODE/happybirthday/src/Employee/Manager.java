/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author sony
 */


import Aaain.Login;
import Admin.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Manager extends JFrame {
	 JButton b1;
	 JButton b2;
	 JButton b3;
	 
	public Manager(){
		 
	
	 
	    setVisible(true);
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        Button b1= new Button("CHECK DATABASE");
        Button b2= new Button("ADD NEW STUDENT");
        Button b3= new Button("LOGOUT");
        
        b2.addActionListener(new ActionListener(){
        	
        	public void actionPerformed(ActionEvent e){
        		
                        new Registrationframe();
        			
        		
        	}
                
                
        	
        	
        	
        });
        b1.addActionListener(new ActionListener(){
        	
        	public void actionPerformed(ActionEvent e){
        	    	
                    new Query1("1");//check database
        			
        	}
                
                
        	
        	
        	
        });
        b3.addActionListener(new ActionListener(){
        	
        	public void actionPerformed(ActionEvent e){
        		
        		
        		dispose();        			
        		new Login();//logout
        			
        		
        	}
                
                
        	
        	
        	
        });
        
        b1.setBounds(100, 70, 150, 30);
        b2.setBounds(100, 110, 150, 30);
        b3.setBounds(100, 150, 150, 30);
        
        add(b1);
        add(b2);
        add(b3);
        
        
        
	 }
	 	
	
	 
	
}