/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author dhruv
 */
public class DbOperations {
    public static void setDataorDelete(String Query,String msg){
        try{
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
//        st.execute(Query);
        st.executeUpdate(Query);
        con.commit();
        if(!msg.equals(""))
            JOptionPane.showMessageDialog(null,msg);
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e, "Message",JOptionPane.ERROR_MESSAGE);
        }
    }
     public static void Update(String Query,String msg){
        try{
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        st.execute(Query);
        st.executeUpdate(Query);
        Boolean ret = st.execute(Query);
        System.out.println("txt value: " + Query);
        System.out.println("execute : " + ret );
        int rows = st.executeUpdate(Query);
        System.out.println("Rows impacted : " + rows );
        if(!msg.equals(""))
            JOptionPane.showMessageDialog(null,msg);
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e, "Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static ResultSet getData(String query){
        try{
             Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }
        catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e, "Message",JOptionPane.ERROR_MESSAGE);
        }
        return null ;
    }

}
