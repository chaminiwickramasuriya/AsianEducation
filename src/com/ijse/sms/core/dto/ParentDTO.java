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
public class ParentDTO extends SuperDTO{
     private String prId;
    private String prName;
    private String mobile;
    private String occupation;

    public ParentDTO() {
    }

    public ParentDTO(String prId, String prName, String mobile, String occupation) {
        this.prId = prId;
        this.prName = prName;
        this.mobile = mobile;
        this.occupation = occupation;
    }

    /**
     * @return the prId
     */
    public String getPrId() {
        return prId;
    }

    /**
     * @param prId the prId to set
     */
    public void setPrId(String prId) {
        this.prId = prId;
    }

    /**
     * @return the prName
     */
    public String getPrName() {
        return prName;
    }

    /**
     * @param prName the prName to set
     */
    public void setPrName(String prName) {
        this.prName = prName;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    
}
