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
public class StudentDTO extends SuperDTO {

    private String id;
    private String pid;
    private String name;
    private String school;
    private String addess;
    private String gender;
    private int age;
    private int mobile;
    private int land;
    private String dob;

    public StudentDTO() {
    }

    public StudentDTO(String id, String pid, String name, String school, String addess, String gender, int age, int mobile, int land, String dob) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.school = school;
        this.addess = addess;
        this.gender = gender;
        this.age = age;
        this.mobile = mobile;
        this.land = land;
        this.dob = dob;
    }

    public StudentDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentDTO(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the addess
     */
    public String getAddess() {
        return addess;
    }

    /**
     * @param addess the addess to set
     */
    public void setAddess(String addess) {
        this.addess = addess;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the mobile
     */
    public int getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the land
     */
    public int getLand() {
        return land;
    }

    /**
     * @param land the land to set
     */
    public void setLand(int land) {
        this.land = land;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

}
