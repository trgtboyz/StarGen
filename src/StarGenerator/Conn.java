/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StarGenerator;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class Conn {
    
    public static Connection connect(){
        Connection DBCon = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Succesful");
        }
        catch(ClassNotFoundException cf){
            System.out.println("Connection Not Succesful"+cf);
        }
        String url = "jdbc:mysql://localhost:3306/star";
        try{
            DBCon = (Connection)DriverManager.getConnection(url,"root","");
            System.out.println("Database Connected");
        }
        catch(SQLException se){
            System.out.println("Database Not Connected");
        }
        return DBCon;
    }
}
    

