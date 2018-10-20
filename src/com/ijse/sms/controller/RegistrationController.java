/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.ParentDTO;
import com.ijse.sms.core.dto.RegSubjectDTO;
import com.ijse.sms.core.dto.RegistrationDTO;
import com.ijse.sms.core.dto.StudentDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.ParentDAO;
import com.ijse.sms.dao.custom.RegSubjectDAO;
import com.ijse.sms.dao.custom.RegistrationDAO;
import com.ijse.sms.dao.custom.StudentDAO;
import com.ijse.sms.dao.custom.SubjectDAO;
import com.ijse.sms.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class RegistrationController {
    public static RegistrationDAO registrationDAO = (RegistrationDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Registration);
    public static ParentDAO addParent = (ParentDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Parent);
    public static StudentDAO addStudent = (StudentDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Student);
    public static RegSubjectDAO addSubject = (RegSubjectDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.RegSubject);

    
    public static boolean addRegistration(ParentDTO parent, StudentDTO student, ArrayList<RegSubjectDTO> allSub, RegistrationDTO registration) throws Exception {
        Connection connection = DBConnection.geBConnection().getConnection();

        try {

            connection.setAutoCommit(false);

            boolean result = addParent.add(parent);

            if (!result) {
                connection.rollback();
                return false;
            }

            result = addStudent.add(student);
            if (!result) {
                connection.rollback();
                return false;
            }

            if (!registrationDAO.add(registration)) {
                connection.rollback();
                return false;
            }

            for (RegSubjectDTO sub : allSub) {
                result=addSubject.add(sub);

                if (!result) {
                    connection.rollback();
                    return false;
                }

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
    
    public static RegistrationDTO search(RegistrationDTO registrationDTO) throws Exception {
        RegistrationDTO add = registrationDAO.search(registrationDTO);
        return add;
    }

    public static boolean update(RegistrationDTO registration, RegSubjectDTO regSubject) throws Exception {
        boolean status = false;
        status = registrationDAO.update(registration);
        if (status) {
            if (addSubject.update(regSubject)) {
                status = true;
            } else {
                status = false;
            }
        } else {
            status = false;
        }
        
        return status;

    }
}
