/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

/**
 *
 * @author Alan Wong
 */
public class orderline {
    private int orderID;
    private String FDname;
    private int FDquantity;
    private double FDprice;

    public orderline(int orderID, String FDname, int FDquantity, double FDprice) {
        this.orderID = orderID;
        this.FDname = FDname;
        this.FDquantity = FDquantity;
        this.FDprice = FDprice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getFDName() {
        return FDname;
    }

    public void setFDName(String FDname) {
        this.FDname = FDname;
    }

    public int getFDQuantity() {
        return FDquantity;
    }

    public void setFDQuantity(int FDquantity) {
        this.FDquantity = FDquantity;
    }

    public double getFDPrice() {
        return FDprice;
    }

    public void setFDPrice(double FDprice) {
        this.FDprice = FDprice;
    }
}
