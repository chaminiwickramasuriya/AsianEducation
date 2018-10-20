/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import static com.ijse.sms.controller.TeacherController.teacharDAO;
import com.ijse.sms.core.dto.TeacherTeacherDetailDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.TeacherTeacherDetailDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class TeacherTeacherDetailController {
     public static TeacherTeacherDetailDAO teacherTeacherDetailDAO=(TeacherTeacherDetailDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.TeacherTeacherDetail);
//     public static ArrayList<TeacherTeacherDetailDTO>getAllTeacherDetails(String tId) throws Exception{
//        return teacherTeacherDetailDAO.getAllTeacherDetails(tId);
//
//    }
     public static ArrayList<TeacherTeacherDetailDTO>getAllTeacher() throws Exception{
        return teacherTeacherDetailDAO.getAllTeacher();

    }
}
