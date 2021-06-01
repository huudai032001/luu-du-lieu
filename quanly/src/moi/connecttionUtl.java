/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class connecttionUtl {
   private static final String hostname= "localhost";
    private static final String username="root";
    private static final String password= "";
    private static final String dbname="quanlysach";
    private static final String connectionUrl="jdbc:mysql://"+hostname+":3306/"+dbname;
    public static java.sql.Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            java.sql.Connection conn= DriverManager.getConnection(connectionUrl, username, password);
                    
             System.out.println("ket moi thanh cong!");
             return conn;
        }catch(Exception e){
            System.out.print("loi ket noi " +e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
       Connection conn= connecttionUtl.getConnection();
       String sql= "select * from quanly";
       try{
           Statement stm= conn.createStatement();
           ResultSet rs= stm.executeQuery(sql);
           
           while(rs.next()){
               int id=rs.getInt("id");
               String title= rs.getString("title");
               int price = rs.getInt("price");
               String athor= rs.getString("athor");
               
               System.out.println("id= "+id+ ", title= "+title+  ", price= "+price+", author="+athor);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
}
}
