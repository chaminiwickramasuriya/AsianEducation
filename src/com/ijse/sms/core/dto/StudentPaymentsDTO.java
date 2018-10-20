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
public class StudentPaymentsDTO extends SuperDTO {

    private String payNo;
    private String reg_Id;
    private String subId;
    private String date;
    private String month;
    private int fee;
    private int amount;

    public StudentPaymentsDTO() {
    }

    public StudentPaymentsDTO(String payNo, String reg_Id, String subId, String date, String month, int fee, int amount) {
        this.payNo = payNo;
        this.reg_Id = reg_Id;
        this.subId = subId;
        this.date = date;
        this.month = month;
        this.fee = fee;
        this.amount = amount;
    }
     public StudentPaymentsDTO(String payNo, String reg_Id, String subId, String date, String month, int fee) {
        this.payNo = payNo;
        this.reg_Id = reg_Id;
        this.subId = subId;
        this.date = date;
        this.month = month;
        this.fee = fee;
    }

   

    public StudentPaymentsDTO(String reg_Id, String date) {
        this.reg_Id = reg_Id;
        this.date = date;
    }

    /**
     * @return the payNo
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * @param payNo the payNo to set
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * @return the reg_Id
     */
    public String getReg_Id() {
        return reg_Id;
    }

    /**
     * @param reg_Id the reg_Id to set
     */
    public void setReg_Id(String reg_Id) {
        this.reg_Id = reg_Id;
    }

    /**
     * @return the subId
     */
    public String getSubId() {
        return subId;
    }

    /**
     * @param subId the subId to set
     */
    public void setSubId(String subId) {
        this.subId = subId;
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
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the fee
     */
    public int getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(int fee) {
        this.fee = fee;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
