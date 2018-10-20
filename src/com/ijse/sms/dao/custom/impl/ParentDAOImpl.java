/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.ParentDTO;
import com.ijse.sms.dao.custom.ParentDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class ParentDAOImpl implements ParentDAO{

    @Override
    public boolean add(ParentDTO dto) throws Exception {
        String SQL="insert into Parent values(?,?,?,?)";
        Connection connection=DBConnection.geBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getPrId());
        stm.setObject(2, dto.getPrName());
        stm.setObject(3, dto.getMobile());
        stm.setObject(4, dto.getOccupation());
        int rst = stm.executeUpdate();
        return rst>0;
    }

    @Override
    public boolean update(ParentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ParentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ParentDTO search(ParentDTO dto) throws Exception {
        String SQL="SELECT * FROM Parent WHERE Pr_Id = ? ";
        Connection connection=DBConnection.geBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getPrId());
        ResultSet rst = stm.executeQuery();
        ParentDTO parent = new ParentDTO();
        if (rst.next()) {
            parent.setPrId(rst.getString(1));
            parent.setPrName(rst.getString(2));
            parent.setMobile(rst.getString(3));
            parent.setOccupation(rst.getString(4));
            return  parent;
        }
        return null;
    }

    @Override
    public ArrayList<ParentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
