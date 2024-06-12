/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import com.mycompany.spidermanonlinefoodservicessofs.AddAdmin;
import com.mycompany.spidermanonlinefoodservicessofs.DeleteAdmin;
import com.mycompany.spidermanonlinefoodservicessofs.ModifyAdmin;
import com.mycompany.spidermanonlinefoodservicessofs.admin;

/**
 *
 * @author Sopnopriyo
 */
public class adminservice {

    public adminservice() {
    }

    public List<admin> getAll() {
        List<admin> adminList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileInputStream("storage/staff.txt"))) {
            while (scanner.hasNextLine()) {

                String adminLine = scanner.nextLine();

                String adminInfo[] = adminLine.split(",");

                admin admin = new admin(adminInfo[0], adminInfo[1]);

                adminList.add(admin);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeleteAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adminList;
    }

    public void create(admin admin) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/staff.txt", true))) {
            pw.println(admin.getStaffUN() + "," + admin.getStaffPass());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized boolean update(String sourceStaffUN, admin updatedadmin) {
        // Read all the items
        List<admin> adminList = getAll();

        int indexToUpdate = -1;
        for (int i = 0; i < adminList.size(); i++) {
            admin admin = adminList.get(i);

            if (admin.getStaffUN().equalsIgnoreCase(sourceStaffUN)) {
                indexToUpdate = i;
            }
        }

        if (indexToUpdate == -1) {
           return false;
        }

        adminList.set(indexToUpdate, updatedadmin);

        try {
            Files.delete(Paths.get("storage/staff.txt"));
        } catch (IOException ex) {
            Logger.getLogger(ModifyAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/staff.txt"))) {
            adminList.forEach(admin -> {
                pw.println(admin.getStaffUN() + "," + admin.getStaffPass());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ModifyAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    public synchronized void delete(String StaffUN) {
        List<admin> adminList = getAll();

        // find the labour to be deleted
        for (int i = 0; i < adminList.size(); i++) {

            admin admin = adminList.get(i);

            if (admin.getStaffUN().equalsIgnoreCase(StaffUN)) {
                adminList.remove(admin);
            }
        }

        try {
            // Delete the entire file
            Files.delete(Paths.get("storage/staff.txt"));
        } catch (IOException ex) {
            Logger.getLogger(adminservice.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Create a new file and write new data into the file
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("storage/staff.txt"))) {
            adminList.forEach(admin -> {
                pw.println(admin.getStaffUN() + "," + admin.getStaffPass());
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
