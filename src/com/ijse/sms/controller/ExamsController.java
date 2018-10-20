/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.ExamsDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.ExamsDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class ExamsController {
    public static ExamsDAO examsDAO=(ExamsDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Exams);
    
    public static boolean addExams(ExamsDTO exams) throws Exception{
        boolean add = examsDAO.add(exams);
        return add;
    }
    public static boolean updateExams(ExamsDTO exams) throws Exception{
        boolean update = examsDAO.update(exams);
        return update;
    }
    public static boolean deleteExams(ExamsDTO exams) throws Exception{
        boolean delete = examsDAO.delete(exams);
        return delete;
    }
    
     public static ArrayList<ExamsDTO>getEachExams(String rid) throws Exception{
        return examsDAO.getEachExams(rid);
    }
    
    public static  ArrayList<ExamsDTO>getAllExams() throws Exception{
        return examsDAO.getAll();
    }
    public static  ArrayList<ExamsDTO>getAllExamDetails() throws Exception{
        return examsDAO.getAllDetails();
    }
    

}
