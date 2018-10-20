/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.TeacherTeacherDetailDTO;
import com.ijse.sms.dao.custom.TeacherTeacherDetailDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class TeacherTeacherDetailDAOImpl implements TeacherTeacherDetailDAO{
     @Override
    public ArrayList<TeacherTeacherDetailDTO> getAllTeacherDetails(String tId) throws Exception {
         Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select t.Te_Id,t.Te_Name,t.Sub_Name,t.Te_Mobile,td.Grade,td.Day_of_Month,td.Time from Teacher t,TeacherDetail td where t.Te_Id=td.Te_Id;";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<TeacherTeacherDetailDTO> all = new ArrayList<>();
        while (rst.next()) {
            all.add(new TeacherTeacherDetailDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getString(6),rst.getString(7),rst.getString(8)));
        }
        return all;
    }

    @Override
    public boolean add(TeacherTeacherDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TeacherTeacherDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(TeacherTeacherDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TeacherTeacherDetailDTO search(TeacherTeacherDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TeacherTeacherDetailDTO> getAllTeacher() throws Exception {
         Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select t.Te_Id,t.Te_Name,t.Sub_Id,t.Sub_Name,t.Te_Mobile,td.Grade,td.Day_of_Month,td.Time from Teacher t,TeacherDetail td "
                + "where t.Te_Id=td.Te_Id;";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<TeacherTeacherDetailDTO> all = new ArrayList<>();
        while (rst.next()) {//String teId, String teName, String sub_Id, String sub_Name, int teMobile, String grade, String dayOfMonth, String time
            all.add(new TeacherTeacherDetailDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getString(6),rst.getString(7),rst.getString(8)));
        }
        return all;
    }

    @Override
    public ArrayList<TeacherTeacherDetailDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
