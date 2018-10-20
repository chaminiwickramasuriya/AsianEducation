/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.StudentDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.StudentDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class StudentController {
     public static StudentDAO studentDAO=(StudentDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Student);
   
    public static boolean addStudent(StudentDTO student) throws Exception{
       boolean add = studentDAO.add(student);
       return add;
    }
    public static StudentDTO searchStudent(StudentDTO student) throws Exception{
       return studentDAO.search(student);
    }
    public static ArrayList<StudentDTO>getAll() throws Exception{
        return studentDAO.getAll();
    }
    public static StudentDTO searchEachStudent(String id) throws Exception{
        return studentDAO.searchEachStudent(id);
    }
}
