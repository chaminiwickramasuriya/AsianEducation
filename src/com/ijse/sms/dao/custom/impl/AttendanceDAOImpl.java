/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.Impl;

import com.ijse.sms.core.dto.AttendanceDTO;
import com.ijse.sms.dao.custom.AttendanceDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AttendanceDAOImpl implements AttendanceDAO{

   @Override
    public ArrayList<AttendanceDTO> getEachAttendence(String rid) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM Attendance WHERE Reg_Id = ?");
        stm.setObject(1, rid);
        ResultSet rst = stm.executeQuery();
        ArrayList<AttendanceDTO> all = new ArrayList<>();
        while (rst.next()) {
            AttendanceDTO att = new AttendanceDTO(rst.getString(1), rst.getString(2), rst.getString(3));
            all.add(att);
       //    return all ;
        }
        return all;
    }

    @Override
    public boolean add(AttendanceDTO dto) throws Exception {
         Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="insert into Attendance values(?,?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getRegId());
        stm.setObject(2, dto.getDate());
        stm.setObject(3, dto.getMark());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean update(AttendanceDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="update Attendance set Reg_Mark=? where Reg_Id=? and Date=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getMark());
        stm.setObject(2, dto.getRegId());
        stm.setObject(3, dto.getDate());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean delete(AttendanceDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="delete from Attendance where Date=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getDate());
        int rst = stm.executeUpdate();
        return rst>0;
                
    }

    @Override
    public AttendanceDTO search(AttendanceDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from Attendance where Reg_Id=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getRegId());
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            return new AttendanceDTO(rst.getString(1), rst.getString(2),rst.getString(3));
        }
                return null;
    }

    @Override
    public ArrayList<AttendanceDTO> getAll() throws Exception {
       Connection connection=DBConnection.geBConnection().getConnection();
       String SQL="select * from Attendance";
        PreparedStatement stm = connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<AttendanceDTO>allAttendance=new ArrayList<>();
        while(rst.next()){
            allAttendance.add(new AttendanceDTO(rst.getString("Date")));
           
        }
        return allAttendance;
    }
    
}
