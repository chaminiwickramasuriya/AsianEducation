/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.TeacherPaymentDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.TeacherPaymentsDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class TeacherPaymentsController {
    public static TeacherPaymentsDAO teacherPaymentsDAO=(TeacherPaymentsDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.TeacherPayments);
    
    public static boolean addPayment(TeacherPaymentDTO teacher) throws Exception{
        boolean add = teacherPaymentsDAO.add(teacher);
        return add;
    }
    public static ArrayList<TeacherPaymentDTO> getEachPayment(String teId) throws Exception{
      return  teacherPaymentsDAO.getEachPayments(teId);
    }
    
    public static ArrayList<TeacherPaymentDTO>getAllPayments() throws Exception{
        return  teacherPaymentsDAO.getAll();
    }
    public static TeacherPaymentDTO searchPayment(TeacherPaymentDTO teacher) throws Exception{
        TeacherPaymentDTO search = teacherPaymentsDAO.search(teacher);
        return search;
    }
     public static boolean deletePayment(TeacherPaymentDTO payment) throws Exception{
        boolean delete = teacherPaymentsDAO.delete(payment);
        return delete;
    }
}
