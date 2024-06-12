/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.spidermanonlinefoodservicessofs;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author Alan Wong
 */
public class SpidermanOnlineFoodServicesSOFS extends JFrame{

    public static void main(String[] args) {
        
        createRequiredFileIfDoesNotExist();
        
        MainMenu mm = new MainMenu();
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mm.setVisible(true);
        
    }
    
    private static void createRequiredFileIfDoesNotExist() {
        String fileNames [];
        
        File rootDir = new File("storage");
        rootDir.mkdirs();
        
        fileNames = new String [] {"storage/item.txt",
            "storage/staff.txt",
            "storage/order.txt",
            "storage/orderLine.txt",
            "storage/customer.txt",
            "storage/item.txt",
            "storage/temp.txt",
            "storage/totalbill.txt"};
        
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if(!file.exists())
            {  
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
       
    }
}
