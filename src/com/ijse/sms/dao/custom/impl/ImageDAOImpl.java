/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom.impl;

import com.ijse.sms.core.dto.ImageDTO;
import com.ijse.sms.dao.custom.ImageDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class ImageDAOImpl implements ImageDAO {

    @Override
    public boolean add(ImageDTO dto) throws Exception {
        File file = new File(dto.getImage());
        FileInputStream fis = new FileInputStream(file);
        Connection connection = DBConnection.geBConnection().getConnection();
        PreparedStatement ps = connection.prepareStatement("insert into Image values(?,?,?)");
        ps.setString(1, dto.getId());
        ps.setBinaryStream(2, (InputStream) fis, (int) file.length());
        ps.setString(3, dto.getTe_Id());
        return ps.executeUpdate()> 0;
        
    }

    @Override
    public boolean update(ImageDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ImageDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageDTO search(ImageDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ImageDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
