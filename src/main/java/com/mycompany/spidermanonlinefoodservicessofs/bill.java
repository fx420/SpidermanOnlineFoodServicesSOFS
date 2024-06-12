/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Alan Wong
 */
public class bill {
    
    private Scanner sc;
    private Scanner scan;
    private String FDName;
    private String FDCategory;
    private String FDPrice;
    private String FDQuantity;
    private StringBuilder fullnames;
    private double DPrice;
    private int DQuantity;
    private double multi;
    private PrintWriter pw;
    
    public bill() {
        fullnames = new StringBuilder();
        openFile();
        readFile();
        closeFile();
    }
    
    public StringBuilder getFullNames() {
        return fullnames;
    }

    public String getTotal() {

        double totalPrice = 0;

        try {
            scan = new Scanner(new FileInputStream("storage/order.txt"));
            while (scan.hasNextLine()) {
                scan.nextLine();
                scan.nextLine();
                FDPrice = scan.nextLine();
                totalPrice += Double.valueOf(FDPrice);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return String.valueOf("Total Price is : " + totalPrice);
    }

    private void openFile() {
        try {
            scan = new Scanner(new File("storage/order.txt"));
            System.out.println("File found!");
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    private void readFile() {
        try {
            while (scan.hasNextLine()) {
                FDCategory = scan.nextLine();
                FDPrice = scan.nextLine();
                FDQuantity = scan.nextLine();
                FDPrice = scan.nextLine();
                fullnames.append(FDName + "\t" + FDCategory + "\t" + FDQuantity + "\t" + FDPrice + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void closeFile() {
        scan.close();
    }
    
}


