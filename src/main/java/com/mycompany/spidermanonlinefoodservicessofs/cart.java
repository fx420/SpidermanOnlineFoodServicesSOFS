/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import java.util.List;

/**
 *
 * @author Sopnopriyo
 */
public class cart {
    
   private List<cartitem> CItems;
   private double totalPrice;

    public cart(List<cartitem> CItems, double totalPrice) {
        this.CItems = CItems;
        this.totalPrice = totalPrice;
    }

    public List<cartitem> getCItems() {
        return CItems;
    }

    public void setCItems(List<cartitem> cartItems) {
        this.CItems = cartItems;
    }
    
    public void addItemToC(cartitem cartItem) {
        this.CItems.add(cartItem);
    }

    public double getTotalPrice() {
        totalPrice = 0;
        CItems.forEach((cartItem) -> {
            totalPrice += cartItem.getFDPrice();
        });
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    } 
}
