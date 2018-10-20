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
public class TeacherDetailDTO extends SuperDTO{
    private String teId;
    private String grade;
    private String dayOfMonth;
    private String time;

    public TeacherDetailDTO() {
    }

    public TeacherDetailDTO(String teId, String grade, String dayOfMonth, String time) {
        this.teId = teId;
        this.grade = grade;
        this.dayOfMonth = dayOfMonth;
        this.time = time;
    }
     public TeacherDetailDTO( String grade, String dayOfMonth, String time) {
        this.grade = grade;
        this.dayOfMonth = dayOfMonth;
        this.time = time;
    }

    /**
     * @return the teId
     */
    public String getTeId() {
        return teId;
    }

    /**
     * @param teId the teId to set
     */
    public void setTeId(String teId) {
        this.teId = teId;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the dayOfMonth
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * @param dayOfMonth the dayOfMonth to set
     */
    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    
    
}
