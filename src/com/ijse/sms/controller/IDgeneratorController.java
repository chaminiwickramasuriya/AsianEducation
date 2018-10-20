/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;



import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author chamini
 */
public class IDgeneratorController {
   public static String getLastID(String tableName, String colName) throws SQLException, ClassNotFoundException {
        String sql = "select " + colName + " from " + tableName + " order by 1 desc limit 1";
        Connection conn = DBConnection.geBConnection().getConnection();

        Statement stm = conn.createStatement();   
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return  rst.getString(1);
        }
        return null;  
    }
   
   
    public static String getLastID(String tableName, String colName,String filt1,String filt2) throws SQLException, ClassNotFoundException {
        String sql = "select " + colName + " from " + tableName + " WHERE Sub_id='"+filt1+"' and Grade='"+filt2+"' order by 1 desc limit 1";
        Connection conn = DBConnection.geBConnection().getConnection();

        Statement stm = conn.createStatement();   
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return  rst.getString(1);
        }
        return null;  
    }
 
}
