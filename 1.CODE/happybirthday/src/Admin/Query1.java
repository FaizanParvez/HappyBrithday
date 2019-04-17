/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;



public class Query1 extends JFrame
{   
    
    public Connection con;
    public Query1(String S)
    {   
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();
        
        try{
		
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happybirthday","root","");
		System.out.println("connectoin created");
		
	}
    catch(ClassNotFoundException | SQLException e){
    	System.out.println(e.getMessage());
    }
        
        try {
            String sql= "select* from branch1";
	    PreparedStatement s= con.prepareStatement(sql);
	    ResultSet r=s.executeQuery(sql);
            
            while(r.next()){
            String z1 =r.getString("S.NO");
            ResultSetMetaData md = r.getMetaData();
            int columns = md.getColumnCount();
            
            
            //  Get column names
            if(S.equals("1")&&z1.equals("1")){
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
            //while (r.next())
            //{   
                ArrayList row = new ArrayList(columns);
               
                for (int i = 1; i <= columns; i++)
                {   if (z1.equals("1")&&S.equals("1")){
                    row.add( r.getObject(i) );
                }}

                data.add( row );
               
            //}
            }
            else if(S.equals("2")&&z1.equals("2")){
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
            
            //while (r.next())
            //{
                ArrayList row = new ArrayList(columns);
                
                for (int i = 1; i <= columns; i++)
                {   if (z1.equals("2")&&S.equals("2")){
                    row.add( r.getObject(i) );
                
                }}//}

                data.add( row );
            
            }
            else if(S.equals("3")&&z1.equals("3")){
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
            //while (r.next())
            //{
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    if(z1.equals("3")&&S.equals("3")){
                    row.add( r.getObject(i) );
                    }
                    }

                data.add( row );
            //}
            }
            else if(S.equals("4")&&z1.equals("4")){
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
            //while (r.next())
            //{
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    if(z1.equals("4")&&S.equals("4")){
                    row.add( r.getObject(i) );
                    }
                    }

                data.add( row );
            //}
            }
            
        }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }

        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep 
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class
        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

        //  Create table with database data    
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );

        JPanel buttonPanel = new JPanel();
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
    
    
        
    
        
    
    setVisible(true);
    //getContentPane().add(scrollPane);
    //getContentPane().add(buttonPanel);
    pack();
   
    
    setSize(600,600);    
    
    }

}

