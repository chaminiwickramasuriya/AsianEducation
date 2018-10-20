/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.LoginDTO;
import com.ijse.sms.dao.custom.LogginDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class LogginDAOImpl implements LogginDAO{

    @Override
    public boolean add(LoginDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(LoginDTO dto) throws Exception {
        String[] split = dto.getUsername().split("-");
        String cuserName = split[0];
        String newUserName = split[1];
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="update Login set password=? userName=? where userName=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getPassword());
        stm.setObject(2, newUserName);
        stm.setObject(3, cuserName);
        int rst = stm.executeUpdate();
        return rst>0;
                
    }

    @Override
    public boolean delete(LoginDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoginDTO search(LoginDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from Login where userName=? ";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getUsername());
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new LoginDTO(rst.getString(1),rst.getString(2));
        }
        return null;
    }

    @Override
    public ArrayList<LoginDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       @Override
    public ArrayList<LoginDTO> getLogUser(String name) throws Exception {
        Connection conn=DBConnection.geBConnection().getConnection();
        String sql="select * from login where userName='"+name+"'";
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<LoginDTO> userList=new ArrayList<>();
        while(rst.next()){
            userList.add(new LoginDTO(rst.getString("userName"), rst.getString("password")));
            return userList;
        }
        return null;
    }
    public boolean getPassword(String name,String pass) throws SQLException {
        Connection conn=DBConnection.geBConnection().getConnection();
        String sql="select * from login where userName='"+name+"' AND password='"+pass+"'";
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if(rst.next()){
            return true;
        }
        return false;
    }
  
    
}
