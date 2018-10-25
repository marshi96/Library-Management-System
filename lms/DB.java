/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class DB {
    public static Connection ConnectDB()
    {
        
        Connection conn=null;
        Statement st = null;
        try
        {
            
         Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/lms";
         conn= DriverManager.getConnection(url,"root","");
         //JOptionPane.showMessageDialog(null,"Connected to database!");
         st = conn.createStatement();
         
         return conn;
        
         
         
        }catch(Exception e)
        {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
        //return null;
          
    }
    
}
