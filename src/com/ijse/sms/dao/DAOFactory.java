/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.dao;

import com.ijse.sms.dao.custom.Impl.AttendanceDAOImpl;
import com.ijse.sms.dao.custom.impl.ExamsDAOImpl;
import com.ijse.sms.dao.custom.impl.ImageDAOImpl;
import com.ijse.sms.dao.custom.impl.LogginDAOImpl;
import com.ijse.sms.dao.custom.impl.ParentDAOImpl;
import com.ijse.sms.dao.custom.impl.RegSubjectDAOImpl;
import com.ijse.sms.dao.custom.impl.RegistrationDAOImpl;
import com.ijse.sms.dao.custom.impl.StudentDAOImpl;
import com.ijse.sms.dao.custom.impl.StudentPaymentsDAOImpl;
import com.ijse.sms.dao.custom.impl.SubjectDAOImpl;
import com.ijse.sms.dao.custom.impl.TeacherDAOImpl;
import com.ijse.sms.dao.custom.impl.TeacherDetailDAOImpl;
import com.ijse.sms.dao.custom.impl.TeacherPaymentsDAOImpl;
import com.ijse.sms.dao.custom.impl.TeacherTeacherDetailDAOImpl;




/**
 *
 * @author Chamini
 */
public class DAOFactory {
    public enum DAOTypes{
        Loggin,Student,Subject,Parent,Registration,RegSubject,Attendance,Exams,StudentPayments,Teacher,TeacherPayments,Image,TeacherDetail,TeacherTeacherDetail;
        
    }
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }
    public  static DAOFactory geInstatce(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;        
    }
    public SuperDAO getDAO(DAOTypes daoType){
        switch(daoType){
            case Loggin:
                return new LogginDAOImpl();
            case Student:
                return new StudentDAOImpl();
            case Subject:
                return new SubjectDAOImpl();
            case Parent:
                return new ParentDAOImpl();
            case Registration:
                return new RegistrationDAOImpl();
            case RegSubject :
                return new RegSubjectDAOImpl();
            case Attendance:
                return new AttendanceDAOImpl();
            case Exams:
                return new ExamsDAOImpl();
            case StudentPayments:
                return new StudentPaymentsDAOImpl();
            case Teacher:
                return new TeacherDAOImpl();
            case TeacherPayments:
                return new TeacherPaymentsDAOImpl();
            case Image:
                return new ImageDAOImpl();
            case TeacherDetail:
                return new TeacherDetailDAOImpl();
            case TeacherTeacherDetail:
                return new TeacherTeacherDetailDAOImpl();
            
        }
        return null;
    }
}
