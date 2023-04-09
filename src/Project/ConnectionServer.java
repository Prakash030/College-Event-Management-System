/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author praka
 */
public class ConnectionServer {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/citclubs","root","Prakash2103@");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
}
}