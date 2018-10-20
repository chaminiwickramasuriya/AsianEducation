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
public class TeacherTeacherDetailDTO extends SuperDTO{
    private String teId;
     private String teName;
    private String sub_Id;
    private String sub_Name;   
    private int teMobile;
    private String grade;
    private String dayOfMonth;
    private String time;

    public TeacherTeacherDetailDTO() {
    }

    public TeacherTeacherDetailDTO(String teId, String teName, String sub_Id, String sub_Name, int teMobile, String grade, String dayOfMonth, String time) {
        this.teId = teId;
        this.teName = teName;
        this.sub_Id = sub_Id;
        this.sub_Name = sub_Name;        
        this.teMobile = teMobile;
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
     * @return the sub_Id
     */
    public String getSub_Id() {
        return sub_Id;
    }

    /**
     * @param sub_Id the sub_Id to set
     */
    public void setSub_Id(String sub_Id) {
        this.sub_Id = sub_Id;
    }

    /**
     * @return the sub_Name
     */
    public String getSub_Name() {
        return sub_Name;
    }

    /**
     * @param sub_Name the sub_Name to set
     */
    public void setSub_Name(String sub_Name) {
        this.sub_Name = sub_Name;
    }

    /**
     * @return the teName
     */
    public String getTeName() {
        return teName;
    }

    /**
     * @param teName the teName to set
     */
    public void setTeName(String teName) {
        this.teName = teName;
    }

    /**
     * @return the teMobile
     */
    public int getTeMobile() {
        return teMobile;
    }

    /**
     * @param teMobile the teMobile to set
     */
    public void setTeMobile(int teMobile) {
        this.teMobile = teMobile;
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
