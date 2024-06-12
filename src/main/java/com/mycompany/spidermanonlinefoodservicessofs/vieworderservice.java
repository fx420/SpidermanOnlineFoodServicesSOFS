/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.spidermanonlinefoodservicessofs.order;

/**
 *
 * @author Alan Wong
 */
public class vieworderservice {
    
    
    public vieworderservice() {
    }
    
    public List<order> getAll() {
        List<order> orderList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/order.txt"))) {
            while (scanner.hasNextLine()) {

                String orderLine = scanner.nextLine();

                String orderInfo[] = orderLine.split(",");

                order order = new order(Integer.parseInt(orderInfo[0]), Double.parseDouble(orderInfo[1]), orderInfo[2]);

                orderList.add(order);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vieworderservice.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderList;
    }
}
