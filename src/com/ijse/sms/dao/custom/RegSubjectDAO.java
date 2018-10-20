/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.RegSubjectDTO;
import com.ijse.sms.core.dto.SubjectDTO;
import com.ijse.sms.core.dto.SuperDTO;
import com.ijse.sms.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public interface RegSubjectDAO extends SuperDAO<RegSubjectDTO>{
    public ArrayList<SubjectDTO > eachSubject(String id)throws Exception;
   
}
