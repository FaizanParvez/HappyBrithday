package Aaain;

import java.text.SimpleDateFormat;
import java.util.Date;
import Email.*;
public class Testd {

public static void main(String[]args){

    Date d = new Date();
    SimpleDateFormat f= new SimpleDateFormat("hh:mm:ss a zzz");
    System.out.println(f.format(d));
    String z= f.format(d);
    if(z.equals("09:00:00 AM IST"))
    {
        new Gmail();
       
    }
    else{
        new Login();
       
    }
}
    
}
