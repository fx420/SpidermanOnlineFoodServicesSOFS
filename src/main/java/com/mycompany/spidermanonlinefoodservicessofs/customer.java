/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

/**
 *
 * @author Alan Wong
 */
public class customer {
    private String CusID;
    private String CusUN;
    private String CusFN;
    private String CusEmail;
    private String CusPhone;
    private String CusAddress;
    private String CusPass;
    
    public customer(String CusID, String CusUN, String CusFN, String CusEmail, String CusPhone, String CusAddress, String CusPass) {
        this.CusID = CusID;
        this.CusUN = CusUN;
        this.CusFN = CusFN;
        this.CusEmail = CusEmail;
        this.CusPhone = CusPhone;
        this.CusAddress = CusAddress;
        this.CusPass = CusPass;
    }
    
    public String getCusID() {
        return CusID;
    }

    public void setCusID(String CusID) {
        this.CusID = CusID;
    }

    public String getCusUN() {
        return CusUN;
    }

    public void setCusUN(String CusUN) {
        this.CusUN = CusUN;
    }
    
    public String getCusFN() {
        return CusFN;
    }

    public void setFName(String CusFN) {
        this.CusFN = CusFN;
    }
    
    public String getCusEmail() {
        return CusEmail;
    }

    public void setCusEmail(String CusEmail) {
        this.CusEmail = CusEmail;
    }
    
    public String getCusPhone() {
        return CusPhone;
    }

    public void setCusPhone(String CusPhone) {
        this.CusPhone = CusPhone;
    }
    
    public String getCusAddress() {
        return CusAddress;
    }

    public void setCusAddress(String CusAddress) {
        this.CusAddress = CusAddress;
    }

    public String getCusPass() {
        return CusPass;
    }

    public void setCusPass(String CusPass) {
        this.CusPass = CusPass;
    }
}
