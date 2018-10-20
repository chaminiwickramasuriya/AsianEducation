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
public class TeacherDTO extends SuperDTO{
    private String teId;
    private String sub_Id;
    private String sub_Name;
    private String teName;
    private int teMobile;
    

    public TeacherDTO() {
    }

    public TeacherDTO(String teId, String sub_Id, String sub_Name, String teName, int teMobile) {
        this.teId = teId;
        this.sub_Id = sub_Id;
        this.sub_Name = sub_Name;
        this.teName = teName;
        this.teMobile = teMobile;
        
    }
//    public TeacherDTO(String teId) {
//        this.teId = teId;
//       
//    }
   
    
    public TeacherDTO(String teId,String sub_Name, String teName, int teMobile) {
        this.teId = teId;
        this.sub_Name = sub_Name;
        this.teName = teName;
        this.teMobile = teMobile;
    }
     public TeacherDTO(String teId,String teName) {
        this.teId = teId;
        this.teName = teName;
    }
     public TeacherDTO(String teName) {
        this.teName = teName;
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
     * @return the techerDetailDTO
     */
   

    
}
