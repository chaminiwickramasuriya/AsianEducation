/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.controller;

import com.ijse.sms.core.dto.AttendanceDTO;
import com.ijse.sms.dao.DAOFactory;
import com.ijse.sms.dao.custom.AttendanceDAO;
import java.util.ArrayList;

/**
 *
 * @author Chamini
 */
public class AttendanceController {
    public static AttendanceDAO attendanceDAO=(AttendanceDAO) DAOFactory.geInstatce().getDAO(DAOFactory.DAOTypes.Attendance);
    
    public static boolean addAttendance(AttendanceDTO attendance) throws Exception{
        boolean add = attendanceDAO.add(attendance);
        return add;
    }
    
    public static boolean updateAttendance(AttendanceDTO attendance) throws Exception{
        boolean update = attendanceDAO.update(attendance);
        return update;
        
    }
    
    public static boolean deleteAttendance(AttendanceDTO attendance) throws Exception{
        boolean delete = attendanceDAO.delete(attendance);
        return delete;
    }
    
    public static AttendanceDTO searchAttendance(AttendanceDTO attendance) throws Exception{
        AttendanceDTO search = attendanceDAO.search(attendance);
        return search;
    }
    
    public static ArrayList<AttendanceDTO>getAllAttendance() throws Exception{
        return attendanceDAO.getAll();
    }

    public static ArrayList<AttendanceDTO> getEachAttendence(String rid) throws Exception{
        return attendanceDAO.getEachAttendence(rid);
    }
}
