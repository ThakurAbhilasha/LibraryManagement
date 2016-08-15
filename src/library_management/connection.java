/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package library_management;

/**
 *
 * @author abhilasha
 */import java.sql.*;
public class connection {
  Connection conn;
  Statement stmt;


    public connection()
    {




     try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn=DriverManager.getConnection("jdbc:odbc:library_management");
           System.out.println("connected");
           stmt=conn.createStatement();


}

     catch(SQLException se)
     {
System.out.println(se);
     }

     catch(ClassNotFoundException ce)
     {
System.out.println(ce);
     }
    }
    public static void main(String args[])
    {
        new connection();
    }
    }