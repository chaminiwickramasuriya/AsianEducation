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
public class RegSubjectDTO extends SuperDTO{
      private String RSid;
    private String Subid;
    private String RSLevel;
    private String Medium;

    public RegSubjectDTO() {
    }

    public RegSubjectDTO(String RSid, String Subid, String RSLevel, String Medium) {
        this.RSid = RSid;
        this.Subid = Subid;
        this.RSLevel = RSLevel;
        this.Medium = Medium;
    }

    /**
     * @return the RSid
     */
    public String getRSid() {
        return RSid;
    }

    /**
     * @param RSid the RSid to set
     */
    public void setRSid(String RSid) {
        this.RSid = RSid;
    }

    /**
     * @return the Subid
     */
    public String getSubid() {
        return Subid;
    }

    /**
     * @param Subid the Subid to set
     */
    public void setSubid(String Subid) {
        this.Subid = Subid;
    }

    /**
     * @return the RSLevel
     */
    public String getRSLevel() {
        return RSLevel;
    }

    /**
     * @param RSLevel the RSLevel to set
     */
    public void setRSLevel(String RSLevel) {
        this.RSLevel = RSLevel;
    }

    /**
     * @return the Medium
     */
    public String getMedium() {
        return Medium;
    }

    /**
     * @param Medium the Medium to set
     */
    public void setMedium(String Medium) {
        this.Medium = Medium;
    }
    
    
}
