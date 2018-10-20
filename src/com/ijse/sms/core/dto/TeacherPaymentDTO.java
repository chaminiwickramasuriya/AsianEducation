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
public class TeacherPaymentDTO extends SuperDTO{
   private String teId;
   private String tPayNo;
   private int noOfStudent;
   private int dayfullAmount;
   private String date;
 

    public TeacherPaymentDTO() {
    }
    public TeacherPaymentDTO(String teID) {
        this.teId = teID;
    }

    public TeacherPaymentDTO(String teId, String tPayNo, int noOfStudent, int dayfullAmount, String date) {
        this.teId = teId;
        this.tPayNo = tPayNo;
        this.noOfStudent = noOfStudent;
        this.dayfullAmount = dayfullAmount;
        this.date = date;
    }
    public TeacherPaymentDTO(String tPayNo, String date) {
        this.tPayNo = tPayNo;
        this.date = date;
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
     * @return the tPayNo
     */
    public String gettPayNo() {
        return tPayNo;
    }

    /**
     * @param tPayNo the tPayNo to set
     */
    public void settPayNo(String tPayNo) {
        this.tPayNo = tPayNo;
    }

        /**
     * @return the noOfStudent
     */
    public int getNoOfStudent() {
        return noOfStudent;
    }

    /**
     * @param noOfStudent the noOfStudent to set
     */
    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    /**
     * @return the dayfullAmount
     */
    public int getDayfullAmount() {
        return dayfullAmount;
    }

    /**
     * @param dayfullAmount the dayfullAmount to set
     */
    public void setDayfullAmount(int dayfullAmount) {
        this.dayfullAmount = dayfullAmount;
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
