/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.core.dto.TeacherTeacherDetailDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.TeacherDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class TeacherController {
    public static TeacherDAO teacharDAO=(TeacherDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Teacher);
            
    public static boolean addTeacher(TeacherDTO teacher) throws Exception{
        boolean add = teacharDAO.add(teacher);
        return add;
    }
    public static ArrayList<TeacherDTO>getEachTeacher(String tid) throws Exception{
        return teacharDAO.getEachTeacher(tid);
    }
    public static ArrayList<TeacherDTO>getAllTeacher() throws Exception{
        return teacharDAO.getAll();

    }
   
    public static TeacherDTO searchTeacher(TeacherDTO teacher) throws Exception{
        TeacherDTO search = teacharDAO.search(teacher);
        return search;
    }
    public static boolean deleteTeacher(TeacherDTO teacher) throws Exception{
        boolean delete = teacharDAO.delete(teacher);
        return delete; 
    }
    public static String searchId(String id) throws Exception{
       return teacharDAO.searchId(id);   
    }
    public static TeacherDTO searchAllTeacher(TeacherDTO teacher) throws Exception{
        TeacherDTO searchAllTeacher = teacharDAO.searchAllTeacher(teacher);
        return searchAllTeacher;
    }
//     public static ArrayList<TeacherDTO> eachSubjetTeacher(String id) throws Exception{
//       return teacharDAO.eachSubjectTeacher(id);
//   }  
    
}
