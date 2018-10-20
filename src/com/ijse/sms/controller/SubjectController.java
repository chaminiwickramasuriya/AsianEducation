/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.SubjectDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.SubjectDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class SubjectController {
    public static SubjectDAO subjectDAO=(SubjectDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Subject);
    
    public static ArrayList<SubjectDTO>getAllId() throws Exception{
        return subjectDAO.getAll();
    }
    
    public static boolean addSubject(SubjectDTO subject) throws Exception{
        boolean add = subjectDAO.add(subject);
        return add;
    }
    
    public static boolean deleteSubject(SubjectDTO subject) throws Exception{
        boolean delete = subjectDAO.delete(subject);
        return delete;
    }
}
