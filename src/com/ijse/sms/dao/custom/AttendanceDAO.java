/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao.custom;

import com.ijse.sms.core.dto.AttendanceDTO;
import com.ijse.sms.dao.SuperDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public interface AttendanceDAO extends SuperDAO<AttendanceDTO>{
    public ArrayList<AttendanceDTO> getEachAttendence(String rid) throws Exception;
}
