/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.core.dto.TeacherDetailDTO;
import com.ijse.sms.dao.custom.TeacherDetailDAO;
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
public class TeacherDetailDAOImpl implements TeacherDetailDAO{

    @Override
    public boolean add(TeacherDetailDTO dto) throws Exception {
       Connection connection=DBConnection.geBConnection().getConnection();
       String SQL="insert into TeacherDetail values(?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getTeId());
        stm.setObject(2, dto.getGrade());
        stm.setObject(3, dto.getDayOfMonth());
        stm.setObject(4, dto.getTime());
        int rst = stm.executeUpdate();
        return rst>0;
               
    }

    @Override
    public boolean update(TeacherDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(TeacherDetailDTO dto) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "Delete from TeacherDetail where Te_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getTeId());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public TeacherDetailDTO search(TeacherDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TeacherDetailDTO> getAll() throws Exception {
         Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select * from TeacherDetail";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<TeacherDetailDTO> all = new ArrayList<>();
        while (rst.next()) {
            all.add(new TeacherDetailDTO(rst.getString(2),rst.getString(3),rst.getString(4)));
        }
        return all;
    }
    @Override
    public ArrayList<TeacherDetailDTO> eachSubject(String id) throws Exception {
        String sql = "select td.Te_Id,td.Day_Of_Month,td.Grade,td.Time from TeacherDetail td,Teacher t where t.Te_Id=td.Te_Id and t.Te_Id='"+id+"'";
        Connection connection = DBConnection.geBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<TeacherDetailDTO> all1 = new ArrayList<>();
        while (rst.next()) {
            TeacherDetailDTO subTO = new TeacherDetailDTO();
            subTO.setTeId(rst.getString(1));
            subTO.setDayOfMonth(rst.getString(2));
            subTO.setGrade(rst.getString(3));
            subTO.setTime(rst.getString(4));
            all1.add(subTO);
//            return all1;
        }
       return all1;
    }

    

   
}
