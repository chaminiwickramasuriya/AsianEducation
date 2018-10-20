/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.core.dto.TeacherTeacherDetailDTO;
import com.ijse.sms.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public interface TeacherDAO extends SuperDAO<TeacherDTO>{
  public ArrayList<TeacherDTO>getEachTeacher(String tid)throws Exception;
    public String searchId(String id)throws Exception;
    public TeacherDTO searchAllTeacher(TeacherDTO teacher)throws Exception;
//    public ArrayList<TeacherDTO> eachSubjectTeacher(String id)throws Exception;

  

   
}
