/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.StudentPaymentsDTO;
import com.ijse.sms.dao.custom.StudentPaymentsDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class StudentPaymentsDAOImpl implements StudentPaymentsDAO {

    @Override
    public ArrayList<StudentPaymentsDTO> getEachPayments(String id) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select * from StudentPayments where Reg_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        ArrayList<StudentPaymentsDTO> payment = new ArrayList<>();
        while (rst.next()) {

            StudentPaymentsDTO all = new StudentPaymentsDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), Integer.parseInt(rst.getString(6)));
            payment.add(all);
        }
        return payment;
    }

    @Override
    public boolean add(StudentPaymentsDTO dto) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "insert into StudentPayments values(?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getPayNo());
        stm.setObject(2, dto.getReg_Id());
        stm.setObject(3, dto.getSubId());
        stm.setObject(4, dto.getDate());
        stm.setObject(5, dto.getMonth());
        stm.setObject(6, dto.getFee());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public boolean update(StudentPaymentsDTO dto) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "update StudentPayments set Pay_Amount=? where  Pay_No=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getFee());
        stm.setObject(2, dto.getPayNo());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public boolean delete(StudentPaymentsDTO dto) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "delete from StudentPayments where Reg_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getReg_Id());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public StudentPaymentsDTO search(StudentPaymentsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<StudentPaymentsDTO> getAll() throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select * from StudentPayments";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<StudentPaymentsDTO> allPayments = new ArrayList<>();
        while (rst.next()) {

            allPayments.add(new StudentPaymentsDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), Integer.parseInt(rst.getString(6))));
        }
        return allPayments;
    }

    @Override
    public String searchSubPayments(String date, String subId) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select count(SPay_No) from StudentPayments sp where sp.SPay_Date=? and sp.Sub_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, date);
        stm.setObject(2, subId);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

}
