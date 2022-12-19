/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldatphongks;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Connection {
     public static java.sql.Connection getConnection(){
        java.sql.Connection connection= null;
        try {    
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user="sa";
            String pass="123456";
            String port="1433";
            String dbName="QLDATPHONGKS";
            String url="jdbc:sqlserver://localhost:"+port+";database="+dbName+";";
            connection= DriverManager.getConnection(url, user, pass);
            
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return connection;   
    }
    public static void closeConnection(java.sql.Connection conn){
        if(conn !=null){
            try{
                conn.close();
                }catch(SQLException ex){
                }
            }
    }
    public static void main(String[] args ){
        System.out.println(getConnection());
    }
    
}
