/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
/**
 *
 * @author dhruv
 */
public class UserDao {
    
    public static void save(User user){
        String query ="insert into user(name, email, mobileNumber, address, password, securityQuestion, answer) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileNumber()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"')";
        DbOperations.setDataorDelete(query,"Registered Successfully! wait for Admin Approval");
    }
    
    public static User login(String email,String password){
        User user = null;
        try{
            ResultSet rs = DbOperations.getData("select * from user where email= '"+email+"'and password ='"+password+"'");
            while(rs.next()){
               user = new User();
               // user.setStatus(rs.getString("status"));
            }
        }
        catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return user;
    }
}
