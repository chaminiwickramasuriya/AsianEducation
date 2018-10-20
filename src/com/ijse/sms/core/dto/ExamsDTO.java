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
public class ExamsDTO extends SuperDTO{
     private String examId;
    private String regId;
    private String subId;
    private String grade;
    private String examName;
    private String examDate;
    private int examMark;

    public ExamsDTO() {
    }

    public ExamsDTO(String examId, String regId, String subId, String grade, String examName, String examDate, int examMark) {
        this.examId = examId;
        this.regId = regId;
        this.subId = subId;
        this.grade = grade;
        this.examName = examName;
        this.examDate = examDate;
        this.examMark = examMark;
    }
    public ExamsDTO(String examId, String regId, String grade, String examName, String examDate, int examMark) {
        this.examId = examId;
        this.regId = regId;
        this.grade = grade;
        this.examName = examName;
        this.examDate = examDate;
        this.examMark = examMark;
    }

    /**
     * @return the examId
     */
    public String getExamId() {
        return examId;
    }

    /**
     * @param examId the examId to set
     */
    public void setExamId(String examId) {
        this.examId = examId;
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
     * @return the examName
     */
    public String getExamName() {
        return examName;
    }

    /**
     * @param examName the examName to set
     */
    public void setExamName(String examName) {
        this.examName = examName;
    }

    /**
     * @return the examDate
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     * @param examDate the examDate to set
     */
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    /**
     * @return the examMark
     */
    public int getExamMark() {
        return examMark;
    }

    /**
     * @param examMark the examMark to set
     */
    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }

    
}
