/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.core.dto.TeacherTeacherDetailDTO;
import com.ijse.sms.dao.SuperDAO;
import com.ijse.sms.dao.custom.TeacherDAO;
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
public class TeacherDAOImpl implements TeacherDAO {

    @Override
    public boolean add(TeacherDTO dto) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "insert into Teacher values(?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getTeId());
        stm.setObject(2, dto.getSub_Id());
        stm.setObject(3, dto.getSub_Name());
        stm.setObject(4, dto.getTeName());
        stm.setObject(5, dto.getTeMobile());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public boolean update(TeacherDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(TeacherDTO dto) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "Delete from Teacher where Te_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getTeId());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public TeacherDTO search(TeacherDTO dto) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select Te_Name from Teacher where Te_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getTeId());
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            TeacherDTO teach = new TeacherDTO();
            teach.setTeName(rst.getString("Te_Name"));
            return teach;
        }
        return null;
    }

    
    

    @Override
    public ArrayList<TeacherDTO> getEachTeacher(String tid) throws SQLException {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select * from Teacher where Te_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<TeacherDTO> all = new ArrayList<>();
        while (rst.next()) {
            TeacherDTO teacher = new TeacherDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));
            all.add(teacher);
            return all;
        }
        return null;
    }
    public String searchId(String dto) throws SQLException{
          Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select i.id from Image i,Teacher t where t.Te_Id=i.Te_Id and t.Te_Name=? group by i.id";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    } 
    public TeacherDTO searchAllTeacher(TeacherDTO dto) throws SQLException{
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from Teacher where Te_Name=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getTeName());
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            TeacherDTO all=new TeacherDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5));
            return all;
        }
        return null;
    }
//    public ArrayList<TeacherDTO> eachSubjectTeacher(String id) throws Exception {
//        String sql = "select Te_Id from Teacher where Te_Name='"+id+"'";
//        Connection connection = DBConnection.geBConnection().getConnection();
//        Statement stm = connection.createStatement();
//        ResultSet rst = stm.executeQuery(sql);
//        ArrayList<TeacherDTO> all1 = new ArrayList<>();
//        while (rst.next()) {
//            TeacherDTO subTO = new TeacherDTO();
//            subTO.setTeId(rst.getString(1));
//            all1.add(subTO);
////            return all1;
//        }
//       return all1;
//    }

    @Override
    public ArrayList<TeacherDTO> getAll() throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        String SQL = "select * from Teacher";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<TeacherDTO> all = new ArrayList<>();
        while (rst.next()) {
            all.add(new TeacherDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5)));
        }
        return all;
    }

    

    
}
