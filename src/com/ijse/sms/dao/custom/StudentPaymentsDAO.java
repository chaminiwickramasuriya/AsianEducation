/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.StudentPaymentsDTO;
import com.ijse.sms.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public interface StudentPaymentsDAO extends SuperDAO<StudentPaymentsDTO>{
    public  ArrayList<StudentPaymentsDTO>getEachPayments(String id)throws Exception;
    public String searchSubPayments(String date,String subid)throws Exception;
}
