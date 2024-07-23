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
public class tables {
    public static void main(String[] args)throws Exception{
        try{
           // String userTable = "create table user(name varchar(100),email varchar(20),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200), answer varchar(200),UNIQUE(email))";
         //String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer) values('Admin','admin@gmail.com','1234567890','India','admin','Pet dog Name','Vicky')";
         //DbOperations.setDataorDelete(adminDetails, "Admin detail added Successfully");
        //    DbOperations.setDataorDelete(userTable, "User Table created Successfully");
           //String product = "Drop table product";
          // DbOperations.setDataorDelete(product, "product drop Successfully");
          //
          String billTable = "create table bill(id int primary key,name varchar(200),mobileNumber varchar(10),email varchar(200),date varchar(50),total varchar(200),createdBy varchar(200))";
          DbOperations.setDataorDelete(billTable, "bill table added Successfully");
       // DbOperations.setDataorDelete(categoryTable, "Category table added Successfully");
        //String productTable = "create table product(name varchar(30),category varchar(30),price varchar(30))";
        //DbOperations.setDataorDelete(productTable, "Product table added Successfully");
        //String categoryTable = "drop table product";
        //DbOperations.setDataorDelete(categoryTable, "Admin detail added Successfully");
        //String product = "alter table product add id int AUTO_INCREMENT primary key";
        //DbOperations.setDataorDelete(product, "column added Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}   