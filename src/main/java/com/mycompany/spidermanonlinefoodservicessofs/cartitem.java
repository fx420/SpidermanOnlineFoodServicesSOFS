/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

/**
 *
 * @author Alan Wong
 */
public class cartitem {
    private Item Citem;
    private int FDquantity;
    private double FDprice;

    public cartitem(Item Citem, int FDquantity, double FDprice) {
        this.Citem = Citem;
        this.FDquantity = FDquantity;
        this.FDprice = FDprice;
    }

    public Item getItem() {
        return Citem;
    }

    public void setItem(Item Citem) {
        this.Citem = Citem;
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
