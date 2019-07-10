/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author raje
 */
public class spoof1 {
  public Connection dbConnection()throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spoofing", "root", "");
                   System.out.println("database connected");
return conn;
}
 
/**
* This method will load vector of vector of string and load all the data in
* the vector
* @return vector of vector of string
* @throws java.lang.Exception
*/
public Vector getEmployee()throws Exception
{
Vector<Vector<String>> employeeVector = new Vector<Vector<String>>();

Connection conn = dbConnection();
PreparedStatement pre = conn.prepareStatement("select * from spoof");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> employee = new Vector<String>();
employee.add(rs.getString(1)); //Empid
employee.add(rs.getString(2)); //name
employee.add(rs.getString(3)); //name
employee.add(rs.getString(4)); //name
employeeVector.add(employee);
}

/*Close the connection after use (MUST)*/
if(conn!=null)
conn.close();

return employeeVector;

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
