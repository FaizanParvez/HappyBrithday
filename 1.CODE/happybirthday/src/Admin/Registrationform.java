package Admin;

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




public class Registrationform extends Dbconn {
	
	public int r;
	@SuppressWarnings("deprecation")
	public Registrationform(){	
		
	JFrame f = new JFrame("MAIN PAGE");
	JPanel p= new JPanel(new GridLayout(0,1));
	
	//LABELS
	JLabel L1=new JLabel("NAME");
	JLabel L2=new JLabel("MOBILE NUMBER");
	JLabel L3=new JLabel("DATE OF BIRTH");
	JLabel L4=new JLabel("EMAIL ID");
	JLabel L5=new JLabel("USERNAME");
	JLabel L6=new JLabel("PASSWORD");
	JLabel L7=new JLabel("CONFIRM PASSWORD");
	
	//BUTTONS
	JButton b1=new JButton("REGISTER");
	
	//TEXT-FIELD
	final JTextField t1=new JTextField(20);
	final JTextField t2=new JTextField(20);
	final JTextField t3=new JTextField(20);
	final JTextField t4=new JTextField(20);
	final JTextField t5=new JTextField(20);
	final JTextField t6=new JTextField(20);
	
	//PASSWORD
	final JPasswordField p6=new JPasswordField(20);
	final JPasswordField p7=new JPasswordField(20);
    p6.setEchoChar('*');
    p7.setEchoChar('*');
	
	//ADDING
    p.add(L1);
    p.add(t1);
    p.add(L2);
    p.add(t2);
    p.add(L3);
    p.add(t3);
    p.add(L4);
    p.add(t4);
    p.add(L5);
    p.add(t5);
    p.add(L6);
    p.add(p6);
    p.add(L7);
    p.add(p7);
    
    
    
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
			   String k=p6.getText();
			   String p2=p7.getText();
			   String p3=a.getText();
			   String p4=t6.getText();
			try{
			if(k.equals(p2)&&p3.equals(p4)){
			String sql= "INSERT INTO addm(NAME,PHONE,EMAIL_ID,D_O_B,USERNAME,PASSWORD)"+"values('"+T1+"','"+T2+"','"+T3+"','"+T4+"','"+T5+"','"+k+"')";
			
			PreparedStatement s= con.prepareStatement(sql);
			r=s.executeUpdate(sql);
			JOptionPane.showMessageDialog(null,"UPDATED");
		}
			else{
			JOptionPane.showMessageDialog(null,"PASSWORD NOT SAME");
		}
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
