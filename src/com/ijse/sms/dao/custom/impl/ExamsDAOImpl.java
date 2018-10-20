/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.ExamsDTO;
import com.ijse.sms.dao.custom.ExamsDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class ExamsDAOImpl implements ExamsDAO{

    @Override
    public ArrayList<ExamsDTO> getEachExams(String rid) throws Exception {
         Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from Exams where Reg_Id=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, rid);
        ResultSet rst = stm.executeQuery();
        ArrayList<ExamsDTO>exams=new ArrayList<>();
        while(rst.next()){
            ExamsDTO examDTO=new  ExamsDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),Integer.parseInt(rst.getString(7)));
            exams.add(examDTO);
        }
        return exams;
    }

    @Override
    public boolean add(ExamsDTO dto) throws Exception {
        String SQL="insert into Exams values(?,?,?,?,?,?,?)";
        Connection connection=DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getExamId());
        stm.setObject(2, dto.getRegId());
        stm.setObject(3, dto.getSubId());
        stm.setObject(4, dto.getGrade());
        stm.setObject(5, dto.getExamName());
        stm.setObject(6, dto.getExamDate());
        stm.setObject(7, dto.getExamMark());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean update(ExamsDTO dto) throws Exception {
        String SQL="update Exams set Exam_Marks=? where Exam_Id=? ";
        Connection connection=DBConnection.geBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getExamMark());
        stm.setObject(2, dto.getExamId());
        int rst = stm.executeUpdate();
        return rst>0;
        
    }

    @Override
    public boolean delete(ExamsDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="delete from Exams where Reg_Id=? and Sub_Id=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getRegId());
        stm.setObject(2, dto.getSubId());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public ExamsDTO search(ExamsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExamsDTO> getAll() throws Exception {
       Connection connection=DBConnection.geBConnection().getConnection();
       String SQL="select * from Exams";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<ExamsDTO>all=new ArrayList<>();
        while(rst.next()){
            all.add(new ExamsDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),Integer.parseInt(rst.getString(7))));
        }
        return all;
    }
    
    public String getSubID(String sub) throws Exception {
        String SQL = "select Sub_Id from Subject where Sub_Name = ?";
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, sub);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return rst.getString("Sub_Id");
        }
        return null;
    }

    @Override
    public ArrayList<ExamsDTO> getAllDetails() throws Exception {
         Connection connection=DBConnection.geBConnection().getConnection();
       String SQL="select r.Reg_Id,stu.Stu_Name,e.Exam_Id,e.Exam_Name,e.Exam_Marks,e.Exam_Date "
               + "from exams e,subject s,registration r,student stu "
               + "where e.Sub_Id = s.Sub_Id and r.Stu_Id=stu.Stu_Id group by e.Reg_Id;";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<ExamsDTO>all=new ArrayList<>();
        while(rst.next()){
            all.add(new ExamsDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),Integer.parseInt(rst.getString(7))));
        }
        return all;
    }

   
    
}
