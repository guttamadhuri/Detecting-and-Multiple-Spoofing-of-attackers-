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
public class hits1 {
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
PreparedStatement pre = conn.prepareStatement("select * from hits");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> employee = new Vector<String>();
employee.add(rs.getString(1)); //Empid
employee.add(rs.getString(2)); //name

employeeVector.add(employee);
}

/*Close the connection after use (MUST)*/
if(conn!=null)
conn.close();

return employeeVector;

}
public Vector getEmployee1()throws Exception
{
Vector<Vector<String>> employeeVector = new Vector<Vector<String>>();

Connection conn = dbConnection();
PreparedStatement pre = conn.prepareStatement("select * from cluster_1");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> employee = new Vector<String>();
employee.add(rs.getString(1)); //Empid
employee.add(rs.getString(2)); //name
employee.add(rs.getString(3)); //Empid
employee.add(rs.getString(4)); //name
employee.add(rs.getString(5)); //Empid
employee.add(rs.getString(6)); //name
employeeVector.add(employee);
}

/*Close the connection after use (MUST)*/
if(conn!=null)
conn.close();

return employeeVector;

}


public Vector getEmployee2()throws Exception
{
Vector<Vector<String>> employeeVector = new Vector<Vector<String>>();

Connection conn = dbConnection();
PreparedStatement pre = conn.prepareStatement("select * from cluster_2");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> employee = new Vector<String>();
employee.add(rs.getString(1)); //Empid
employee.add(rs.getString(2)); //name
employee.add(rs.getString(3)); //Empid
employee.add(rs.getString(4)); //name
employee.add(rs.getString(5)); //Empid
employee.add(rs.getString(6)); //name
employee.add(rs.getString(7)); //name

employeeVector.add(employee);
}

/*Close the connection after use (MUST)*/
if(conn!=null)
conn.close();

return employeeVector;

}

public Vector getEmployee3()throws Exception
{
Vector<Vector<String>> employeeVector = new Vector<Vector<String>>();

Connection conn = dbConnection();
PreparedStatement pre = conn.prepareStatement("select * from cluster_3");

ResultSet rs = pre.executeQuery();

while(rs.next())
{
Vector<String> employee = new Vector<String>();
employee.add(rs.getString(1)); //Empid
employee.add(rs.getString(2)); //name
employee.add(rs.getString(3)); //Empid
employee.add(rs.getString(4)); //name
employee.add(rs.getString(5)); //Empid
employee.add(rs.getString(6)); //name
//employee.add(rs.getString(7)); //name

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
