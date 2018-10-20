/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.RegistrationDTO;
import com.ijse.sms.dao.custom.RegistrationDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class RegistrationDAOImpl implements RegistrationDAO{

    @Override
    public boolean add(RegistrationDTO dto) throws Exception {
        Connection connection=DBConnection.geBConnection().getConnection();
        String SQL="insert into Registration values(?,?,?,?,?) ";
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getReid());
        stm.setObject(2, dto.getStuid());
        stm.setObject(3, dto.getReFee());
        stm.setObject(4, dto.getGrade());
        stm.setObject(5, dto.getDate());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean update(RegistrationDTO dto) throws Exception {
        String SQL="update Registration set Reg_Grade=? where Reg_Id=?";
        Connection connection=DBConnection.geBConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getGrade());
        stm.setObject(2, dto.getReid());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean delete(RegistrationDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDTO search(RegistrationDTO dto) throws Exception {
         String SQL="select * from Registration where Reg_Id = ?";
        Connection connection=DBConnection.geBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getReid());
        ResultSet rst = stm.executeQuery();
        
        if(rst.next()){
            RegistrationDTO reg = new RegistrationDTO();
            reg.setReid(rst.getString("Reg_Id"));
            reg.setStuid(rst.getString("Stu_Id"));
            reg.setReFee(rst.getInt(3)+"");
            reg.setGrade(rst.getString(4));
            reg.setDate(rst.getString(5));
            return reg;
        }
        return null;
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
        String SQL="select * from Registration";
        Connection connection=DBConnection.geBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        ResultSet rst = stm.executeQuery();
        
        ArrayList<RegistrationDTO>registration=null;
        while(rst.next()){
            if(registration==null){
                registration=new ArrayList<>();
            }
            registration.add(new RegistrationDTO(
                rst.getString(1),
                rst.getString(2),
                rst.getString(3),
            rst.getString(4),
            rst.getString(5)));
        }
        return registration;
    }
    
}
