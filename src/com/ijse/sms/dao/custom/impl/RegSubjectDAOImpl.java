/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.RegSubjectDTO;
import com.ijse.sms.core.dto.SubjectDTO;
import com.ijse.sms.dao.custom.RegSubjectDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class RegSubjectDAOImpl implements RegSubjectDAO{

    @Override
    public ArrayList<SubjectDTO> eachSubject(String id) throws Exception {
        String sql = "select s.Sub_Id,s.Sub_Name from Subject s,RegSubject r where s.Sub_Id = r.Sub_Id and r.Reg_Id='" + id + "'";
        Connection connection = DBConnection.geBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<SubjectDTO> all1 = new ArrayList<>();
        while (rst.next()) {
            SubjectDTO subTO = new SubjectDTO();
            subTO.setSubId(rst.getString(1));
            subTO.setSubName(rst.getString(2));
            all1.add(subTO);
//            return all1;
        }
       return all1;
    }
    

    @Override
    public boolean add(RegSubjectDTO dto) throws Exception {
        String SQL = "insert into RegSubject values(?,?,?,?)";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getRSid());
        stm.setObject(2, dto.getSubid());
        stm.setObject(3, dto.getRSLevel());
        stm.setObject(4, dto.getMedium());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public boolean update(RegSubjectDTO dto) throws Exception {
        String SQL = "update RegSubject set RS_Level=? , Medium=? where Reg_Id=?";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getRSLevel());
        stm.setObject(2, dto.getMedium());
        stm.setObject(3, dto.getRSid());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public boolean delete(RegSubjectDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegSubjectDTO search(RegSubjectDTO dto) throws Exception {
        String SQL = "select * from RegSubject where Reg_Id=?";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getRSid());
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            RegSubjectDTO all = new RegSubjectDTO();
            all.setRSid(rst.getString(1));
            all.setSubid(rst.getString(2));
            all.setRSLevel(rst.getString(3));
            all.setMedium(rst.getString(4));
            return all;

        }
        return null;
    }

    @Override
    public ArrayList<RegSubjectDTO> getAll() throws Exception {
         String SQL = "select * from RegSubject";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();

        ArrayList<RegSubjectDTO> regSubject = null;
        while (rst.next()) {
            if (regSubject == null) {
                regSubject = new ArrayList<>();
            }
            regSubject.add(new RegSubjectDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            ));
        }
        return regSubject;
    }
    
}
