/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author dhruv
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","admin@123");
        con.setAutoCommit(false);
        return con;
            }
        catch(ClassNotFoundException | SQLException e){
           throw new RuntimeException("unhandled",e);
        }
    }
    
    }
