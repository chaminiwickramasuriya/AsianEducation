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
public class ImageDTO extends SuperDTO{
    private String id;
    private String image;
    private String te_Id;

    public ImageDTO() {
    }
   
    public ImageDTO(String id, String image, String te_Id) {
        this.id = id;
        this.image = image;
        this.te_Id = te_Id;
    }
    public ImageDTO(String te_Id) {
        this.te_Id = te_Id;
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
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the te_Id
     */
    public String getTe_Id() {
        return te_Id;
    }

    /**
     * @param te_Id the te_Id to set
     */
    public void setTe_Id(String te_Id) {
        this.te_Id = te_Id;
    }
    
    
}
