/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chamini
 */
public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;
    
    private DBConnection(){
        
        try {
            Properties properties=new Properties();
            File file=new File("settings/dbProperties.properties");
            FileReader filereader = new FileReader(file);
            properties.load(filereader);
            
            String ip = properties.getProperty("ip");
            String database = properties.getProperty("database");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://"+ ip + "/" + database;
            
            connection=DriverManager.getConnection(url,username,password);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public static DBConnection geBConnection(){//
        if(dbConnection==null){
            dbConnection=new DBConnection();
        }
         return dbConnection;       
    }
    
    public Connection getConnection(){
                return connection;
            }
    
}
