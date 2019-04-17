package Email;
import Admin.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;

public class Gmail extends Dbconn {

public Gmail(){  
  try{
            String sql= "select NAME,EMAIL_ID,D_O_B from branch1";
  	    PreparedStatement s1= con.prepareStatement(sql);
            ResultSet r=s1.executeQuery(sql);
            while(r.next()){
                Date d= new Date();
                SimpleDateFormat f= new SimpleDateFormat("dd.MM");
                String s= f.format(d);
                
                String z1 =r.getString("NAME");
                String z2 =r.getString("EMAIL_ID");
                String z3 =r.getString("D_O_B");
                
                if(s.equals(z3))
                {
                   
                
      
 String to=z2;//change accordingly  
  
  //Get the session object  
  Properties props = new Properties();  
  props.put("mail.smtp.host", "smtp.gmail.com");  
  props.put("mail.smtp.socketFactory.port", "465");  
  props.put("mail.smtp.socketFactory.class",  
            "javax.net.ssl.SSLSocketFactory");  
  props.put("mail.smtp.auth", "true");  
  props.put("mail.smtp.port", "465");  
   
  Session session = Session.getDefaultInstance(props,  
   new javax.mail.Authenticator() {  
   @Override
   protected PasswordAuthentication getPasswordAuthentication() {  
   return new PasswordAuthentication("SENDERS MAIL","pASSWORD");//change accordingly  
   }  
  });  
   
  //compose message  
  try {  
   MimeMessage message = new MimeMessage(session);  
   message.setFrom(new InternetAddress("SENDERS"));//change accordingly  
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
   message.setSubject("HAPPY BIRTHDAY");  
   message.setText("HAPPY BIRTHDAY"+z1);  
     
   //send message  
   Transport.send(message);  
  
   System.out.println("message sent successfully");  
   
  } catch (MessagingException e) {throw new RuntimeException(e);}  
  }}}
  catch(Exception e){
      System.out.println(e);
  }
 }  
   /** public static void main(String[] args) {
       new Gmail(); // TODO code application logic here
    }**/
    
}