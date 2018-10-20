/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.core.dto.TeacherDetailDTO;
import com.ijse.sms.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public interface TeacherDetailDAO extends SuperDAO<TeacherDetailDTO>{

    public ArrayList<TeacherDetailDTO> eachSubject(String id)throws Exception;

    

  
    
}
