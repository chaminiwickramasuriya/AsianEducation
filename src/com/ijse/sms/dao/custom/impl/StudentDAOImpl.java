/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.StudentDTO;
import com.ijse.sms.dao.custom.StudentDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class StudentDAOImpl implements StudentDAO{

    @Override
    public StudentDTO searchEachStudent(String id) throws Exception {
         String SQL = "SELECT * from Student where Stu_Id = ?";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, id);

        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setPid(rst.getString(2));
            studentDTO.setName(rst.getString("Stu_Name"));
            studentDTO.setSchool(rst.getString(4));
            studentDTO.setAddess(rst.getString(5));
            studentDTO.setGender(rst.getString(6));
            studentDTO.setAge(rst.getInt(7));
            studentDTO.setMobile(rst.getInt(8));
            studentDTO.setDob(rst.getString(10));

            return studentDTO;
        }
        return null;
    }

    @Override
    public boolean add(StudentDTO dto) throws Exception {
        String SQL = "insert into Student values(?,?,?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getId());
        stm.setObject(2, dto.getPid());
        stm.setObject(3, dto.getName());
        stm.setObject(4, dto.getSchool());
        stm.setObject(5, dto.getAddess());
        stm.setObject(6, dto.getGender());
        stm.setObject(7, dto.getAge());
        stm.setObject(8, dto.getMobile());
        stm.setObject(9, dto.getLand());
        stm.setObject(10, dto.getDob());
        int rst = stm.executeUpdate();
        return rst > 0;
    }

    @Override
    public boolean update(StudentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(StudentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StudentDTO search(StudentDTO dto) throws Exception {
        String SQL = "SELECT Stu_Name from Student where Stu_Id = ?";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getId());

        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setName(rst.getString("Stu_Name"));

            return studentDTO;
        }
        return null;
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        String SQL = "select Stu_Id from Student";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<StudentDTO> student = new ArrayList<>();
        
        while (rst.next()) {
            StudentDTO allID = new StudentDTO();
            allID.setId(rst.getString(1));
            student.add(allID);
        }
        return student;
    }
    
}
