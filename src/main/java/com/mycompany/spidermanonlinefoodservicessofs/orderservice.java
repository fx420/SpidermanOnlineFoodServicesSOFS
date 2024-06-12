/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import java.util.ArrayList;
import com.mycompany.spidermanonlinefoodservicessofs.cart;
import com.mycompany.spidermanonlinefoodservicessofs.cartitem;

/**
 *
 * @author Sopnopriyo
 */
public class orderservice {
    
    private cart cart;
    
    public orderservice() {
        this.cart = new cart(new ArrayList<>(), 0);
    }
    
    public void addToCart(cartitem cartItem) {
        this.cart.addItemToC(cartItem);
    }
    
    public void clearCart() {
        this.cart = new cart(new ArrayList<>(), 0);
    }
    
    public cart getCart() {
        return this.cart;
    }
}
