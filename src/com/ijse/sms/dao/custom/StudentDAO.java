/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.StudentDTO;
import com.ijse.sms.dao.SuperDAO;

/**
 *
 * @author Chamini
 */
public interface StudentDAO extends SuperDAO<StudentDTO>{
    public StudentDTO searchEachStudent(String id) throws Exception;
}
