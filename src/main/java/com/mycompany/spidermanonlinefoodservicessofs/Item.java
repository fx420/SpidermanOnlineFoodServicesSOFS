/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spidermanonlinefoodservicessofs;

/**
 *
 * @author Sopnopriyo
 */
public class Item {
    private String FDID;
    private String FDName;
    private String FDCategory;
    private double FDPrice;

    public Item(String FDID, String FDName,String FDCategory, double FDPrice) {
        this.FDID = FDID;
        this.FDName = FDName;
        this.FDCategory = FDCategory;
        this.FDPrice = FDPrice;
    }
    
    public String getFDID() {
        return FDID;
    }

    public void setFDID(String FDID) {
        this.FDID = FDID;
    }

    public String getFDName() {
        return FDName;
    }

    public void setFDName(String FDName) {
        this.FDName = FDName;
    }
    
    public String getFDCategory() {
        return FDCategory;
    }

    public void setFDCategory(String FDCategory) {
        this.FDCategory = FDCategory;
    }

    public double getFDPrice() {
        return FDPrice;
    }
    

    public void setFDDPrice(double FDPrice) {
        this.FDPrice = FDPrice;
    }

}
