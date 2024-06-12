/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

/**
 *
 * @author Alan Wong
 */
public class admin {
    private String StaffUN;
    private String StaffPass;

    public admin(String StaffUN, String StaffPass) {
        this.StaffUN = StaffUN;
        this.StaffPass = StaffPass;
    }

    public String getStaffUN() {
        return StaffUN;
    }

    public void setName(String StaffUN) {
        this.StaffUN = StaffUN;
    }

    public String getStaffPass() {
        return StaffPass;
    }

    public void setStaffPass(String StaffPass) {
        this.StaffPass = StaffPass;
    }
}
