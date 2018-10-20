/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.core.dto;

/**
 *
 * @author Chamini
 */
public class AttendanceDTO extends SuperDTO{
    private String regId;
    private String date;
    private String mark;

    public AttendanceDTO() {
    }

    public AttendanceDTO(String regId, String date, String mark) {
        this.regId = regId;
        this.date = date;
        this.mark = mark;
    }
    
    public AttendanceDTO(String date, String mark) {
        this.date = date;
        this.mark = mark;
    }
    
    public AttendanceDTO(String date) {
        this.date = date;
    }

    /**
     * @return the regId
     */
    public String getRegId() {
        return regId;
    }

    /**
     * @param regId the regId to set
     */
    public void setRegId(String regId) {
        this.regId = regId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
 
    
}
