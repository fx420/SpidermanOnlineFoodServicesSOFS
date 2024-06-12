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
import com.mycompany.spidermanonlinefoodservicessofs.AddCustomer;
import com.mycompany.spidermanonlinefoodservicessofs.DeleteCustomer;
import com.mycompany.spidermanonlinefoodservicessofs.ModifyCustomer;
import com.mycompany.spidermanonlinefoodservicessofs.customer;

/**
 *
 * @author Alan Wong
 */
public class customerservice {
    
    public customerservice() {
    }
    
    public List<customer> getAll() {
        List<customer> customerList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/customer.txt"))) {
            while (scanner.hasNextLine()) {

                String customerLine = scanner.nextLine();

                String customerInfo[] = customerLine.split(",");

                customer customer = new customer(customerInfo[0], customerInfo[1], customerInfo[2], customerInfo[3], customerInfo[4], customerInfo[5], customerInfo[6]);

                customerList.add(customer);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeleteCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customerList;
    }

    public void create(customer customer) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/customer.txt", true))) {
            pw.println(customer.getCusID() + "," + customer.getCusUN() + "," + customer.getCusFN() + "," + customer.getCusEmail() + "," + customer.getCusPhone() + "," + customer.getCusAddress() + "," + customer.getCusPass());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized boolean update(String sourceCusID, customer updatedcustomer) {
        // Read all the items
        List<customer> customerList = getAll();

        int indexToUpdate = -1;
        for (int i = 0; i < customerList.size(); i++) {
            customer customer = customerList.get(i);

            if (customer.getCusID().equalsIgnoreCase(sourceCusID)) {
                indexToUpdate = i;
            }
        }

        if (indexToUpdate == -1) {
           return false;
        }

        customerList.set(indexToUpdate, updatedcustomer);

        try {
            Files.delete(Paths.get("storage/customer.txt"));
        } catch (IOException ex) {
            Logger.getLogger(ModifyCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/customer.txt"))) {
            customerList.forEach(customer -> {
                pw.println(customer.getCusID() + "," + customer.getCusFN() + "," + customer.getCusEmail() + "," + customer.getCusPhone() + "," + customer.getCusAddress() + "," + customer.getCusPass());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModifyCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    public synchronized void delete(String CusID) {
        List<customer> customerList = getAll();

        // find the labour to be deleted
        for (int i = 0; i < customerList.size(); i++) {

            customer customer = customerList.get(i);

            if (customer.getCusID().equalsIgnoreCase(CusID)) {
                customerList.remove(customer);
            }
        }

        try {
            // Delete the entire file
            Files.delete(Paths.get("storage/customer.txt"));
        } catch (IOException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Create a new file and write new data into the file
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/customer.txt"))) {
            customerList.forEach(customer -> {
                pw.println(customer.getCusID() + "," + customer.getCusUN() + "," + customer.getCusFN()+ "," + customer.getCusEmail() + "," + customer.getCusPhone() + "," + customer.getCusAddress() + "," + customer.getCusPass());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(customerservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
