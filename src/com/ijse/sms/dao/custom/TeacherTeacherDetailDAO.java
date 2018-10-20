/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.TeacherTeacherDetailDTO;
import com.ijse.sms.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public interface TeacherTeacherDetailDAO extends SuperDAO<TeacherTeacherDetailDTO>{
     public ArrayList<TeacherTeacherDetailDTO> getAllTeacherDetails(String tId )throws Exception;

   // public ArrayList<TeacherTeacherDetailDTO> getAllTeacherDetails();

    public ArrayList<TeacherTeacherDetailDTO> getAllTeacher()throws Exception;
}
