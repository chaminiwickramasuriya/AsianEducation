/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.SubjectDTO;
import com.ijse.sms.dao.custom.SubjectDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class SubjectDAOImpl implements SubjectDAO{

    @Override
    public boolean add(SubjectDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="insert into Subject values(?,?)";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSubId());
        stm.setObject(2, dto.getSubName());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean update(SubjectDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SubjectDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="delete from Subject where Sub_Id=? or Sub_Name=?";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSubId());
        stm.setObject(2, dto.getSubName());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public SubjectDTO search(SubjectDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SubjectDTO> getAll() throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="select * from Subject";
        PreparedStatement stm=connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        ArrayList<SubjectDTO>subject=new ArrayList<>();
        while(rst.next()){
            
            subject.add(new SubjectDTO(
                rst.getString(1),
                rst.getString(2)
            ));
            
        }
        return subject;
    }
    
}
