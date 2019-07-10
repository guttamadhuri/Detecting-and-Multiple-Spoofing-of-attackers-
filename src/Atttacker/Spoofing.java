
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Atttacker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raje
 */
public class Spoofing {
 public static Connection getConnection(){
            Connection con =null;
    {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spoofing", "root", "");
                   System.out.println("database connected..!");
                   
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Spoofing.class.getName()).log(Level.SEVERE, null, ex);
            }   catch (SQLException ex) {
                    Logger.getLogger(Spoofing.class.getName()).log(Level.SEVERE, null, ex);
                }
       return con;    
    }
    
    }
}
