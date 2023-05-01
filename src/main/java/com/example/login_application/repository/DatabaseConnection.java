package com.example.login_application.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    static Connection con;

    //return connection to mySQL database
    public static Connection createConnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String pass="Aloywashere0";
            String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
            con = DriverManager.getConnection(url,user,pass);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
}
