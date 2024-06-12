/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

/**
 *
 * @author Alan Wong
 */
public class order {
    private int orderID;
    private double FDprice;
    private String date;

    public order(int orderID, double FDprice, String date) {
        this.orderID = orderID;
        this.FDprice = FDprice;
        this.date = date;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPrice() {
        return FDprice;
    }

    public void setPrice(double FDprice) {
        this.FDprice = FDprice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
