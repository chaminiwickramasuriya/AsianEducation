/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.ImageDTO;
import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.core.dto.TeacherDetailDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.ImageDAO;
import com.ijse.sms.dao.custom.TeacherDAO;
import com.ijse.sms.dao.custom.TeacherDetailDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chamini
 */
public class TeacherDetailController {

    public static TeacherDetailDAO teacharDetailDAO = (TeacherDetailDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.TeacherDetail);
    public static TeacherDAO teacherDAO = (TeacherDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Teacher);
    public static ImageDAO imageDAO = (ImageDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Image);

    public static boolean addTeacherDetails(TeacherDTO teacher, ArrayList<TeacherDetailDTO> teacherDetail, ImageDTO image) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();

        try {
            connection.setAutoCommit(false);
            boolean add = teacherDAO.add(teacher);
            if (!add) {
                connection.rollback();
                return false;
            }
            for (TeacherDetailDTO teacherDetail1 : teacherDetail) {
                add = teacharDetailDAO.add(teacherDetail1);

                if (!add) {
                    connection.rollback();
                    return false;
                }

            }

            add = imageDAO.add(image);
            if (!add) {
                connection.rollback();
                return false;
            }

            connection.commit();
            return true;

        } catch (SQLException ex) {
            connection.rollback();
            ex.printStackTrace();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public static ArrayList<TeacherDetailDTO> getAllTeacher() throws Exception {
        return null;

    }

    public static boolean deleteTeacherDetail(TeacherDTO teacherDTO, ArrayList<TeacherDetailDTO> teacherDetail) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();
//        try {
//            connection.setAutoCommit(false);
//            boolean delete = teacherDAO.delete(teacherDTO);
//            if (!delete) {
//                connection.rollback();
//                return false;
//            }
//            for (TeacherDetailDTO teacherDetail1 : teacherDetail) {
//                delete = teacharDetailDAO.delete(teacherDetail1);
//
//                if (!delete) {
//                    connection.rollback();
//                    return false;
//                }
//
//            }
//
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
        return false;
    }
    public static ArrayList<TeacherDetailDTO> eachSubjet(String id) throws Exception{
       return teacharDetailDAO.eachSubject(id);
   }  
   
}
