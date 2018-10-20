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
public class RegistrationDTO extends SuperDTO{
     private String Reid;
    private String Stuid;
    private String ReFee;
    private String Grade;
    private String date;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String Reid, String Stuid, String ReFee, String Grade, String date) {
        this.Reid = Reid;
        this.Stuid = Stuid;
        this.ReFee = ReFee;
        this.Grade = Grade;
        this.date = date;
    }
    
    public RegistrationDTO(String Reid) {
        this.Reid = Reid;
    }
    
    public RegistrationDTO(String rid,String sid,String grade){
        this.Reid=rid;
        this.Stuid=sid;
        this.Grade=grade;
    }
    /**
     * @return the Reid
     */
    public String getReid() {
        return Reid;
    }

    /**
     * @param Reid the Reid to set
     */
    public void setReid(String Reid) {
        this.Reid = Reid;
    }

    /**
     * @return the Stuid
     */
    public String getStuid() {
        return Stuid;
    }

    /**
     * @param Stuid the Stuid to set
     */
    public void setStuid(String Stuid) {
        this.Stuid = Stuid;
    }

    /**
     * @return the ReFee
     */
    public String getReFee() {
        return ReFee;
    }

    /**
     * @param ReFee the ReFee to set
     */
    public void setReFee(String ReFee) {
        this.ReFee = ReFee;
    }

    /**
     * @return the Grade
     */
    public String getGrade() {
        return Grade;
    }

    /**
     * @param Grade the Grade to set
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
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
    
    
}
