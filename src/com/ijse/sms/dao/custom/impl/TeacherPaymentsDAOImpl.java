/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.TeacherPaymentDTO;
import com.ijse.sms.dao.custom.TeacherPaymentsDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class TeacherPaymentsDAOImpl implements TeacherPaymentsDAO{

    @Override
    public boolean add(TeacherPaymentDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="insert into TeacherPayments values(?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.gettPayNo());
        stm.setObject(2, dto.getTeId());
        stm.setObject(3, dto.getNoOfStudent());
        stm.setObject(4, dto.getDayfullAmount());
        stm.setObject(5, dto.getDate());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean update(TeacherPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(TeacherPaymentDTO dto) throws Exception {
          Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "delete from TeacherPayments where TPay_No=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.gettPayNo());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public TeacherPaymentDTO search(TeacherPaymentDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from TeacherPayments where Te_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getTeId());
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new TeacherPaymentDTO(rst.getString(1), rst.getString("Te_Id"),rst.getInt(3),rst.getInt(4),rst.getString(5));
        }
        return null;
    }

    @Override
    public ArrayList<TeacherPaymentDTO> getAll() throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from TeacherPayments";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<TeacherPaymentDTO>all=new ArrayList<>();
         while(rst.next()){
            TeacherPaymentDTO tech=new TeacherPaymentDTO(rst.getString(1),rst.getString(2),rst.getInt(3),rst.getInt(4),rst.getString(5));
            all.add(tech);
            return all;
        }
        return null;
    }
    
    @Override
    public ArrayList<TeacherPaymentDTO> getEachPayments(String teId) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from TeacherPayments where Te_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, teId);
        ResultSet rst = stm.executeQuery();
        ArrayList<TeacherPaymentDTO>all=new ArrayList<>();
        while(rst.next()){
            TeacherPaymentDTO tech=new TeacherPaymentDTO(rst.getString(1), rst.getString(2),rst.getInt(3),rst.getInt(4),rst.getString(5));
            all.add(tech);
            return all;
        }
        return null;
    }
    
}
