/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.StudentPaymentsDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.StudentPaymentsDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class StudentPaymentsController {
    public static StudentPaymentsDAO paymentDAO=(StudentPaymentsDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.StudentPayments);
    
    public static boolean addPayment(StudentPaymentsDTO payment) throws Exception{
        boolean add = paymentDAO.add(payment);
        return add;
    }
    public static ArrayList<StudentPaymentsDTO>getEachPay(String id) throws Exception{
        return paymentDAO.getEachPayments(id);
    }
    public static boolean deletePayment(StudentPaymentsDTO payment) throws Exception{
        boolean delete = paymentDAO.delete(payment);
        return delete;
    }
    public static boolean updatePayment(StudentPaymentsDTO payment) throws Exception{
        boolean update = paymentDAO.update(payment);
        return update;
    }
    public static ArrayList<StudentPaymentsDTO>getAllPayments() throws Exception{
        return paymentDAO.getAll();
    }
    public static String searchSubPaymnets(String date , String subId) throws Exception{
       return paymentDAO.searchSubPayments(date,subId);
        
    }
}
