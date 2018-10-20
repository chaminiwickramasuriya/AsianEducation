/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.ImageDTO;
import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.ImageDAO;
import com.ijse.sms.dao.custom.TeacherDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Chamini
 */
public class ImageController {

//    public static TeacherDAO teacharDAO = (TeacherDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Teacher);
//    public static ImageDAO imageDAO = (ImageDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Image);
//
//    public static boolean addTeacher(ArrayList<TeacherDTO> workList, ImageDTO image) throws Exception {
//
//        Connection connection = DBConnection.geBConnection().getConnection();
//        try {
//            connection.setAutoCommit(false);
//            boolean add=false;
//            for (TeacherDTO teacher : workList) {
//                 add = teacharDAO.add(teacher);
//                if (!add) {
//                    connection.rollback();
//                    return false;
//                }
//            }
//
//            add = imageDAO.add(image);
//            if (!add) {
//                connection.rollback();
//                return false;
//            }
//            connection.commit();
//            return true;
//
//        } catch (SQLException ex) {
//            connection.rollback();
//            ex.printStackTrace();
//            return false;
//        } finally {
//            connection.setAutoCommit(true);
//        }
//    }

}
