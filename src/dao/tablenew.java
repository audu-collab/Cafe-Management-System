/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
/**
 *
 * @author dhruv
 */
public class tablenew {
    public static void main(String[] args)throws Exception{
        try{
            String userTable = "update user()";
            DbOperations.setDataorDelete(userTable, "User Table created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}   