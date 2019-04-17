/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {
	
	public Connection con;
    public Dbconn(){	
	try{
		
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happybirthday","root","");
		System.out.println("connection created");
		
	}
    catch(ClassNotFoundException | SQLException e){
    	System.out.println(e.getMessage());
    }
}
}