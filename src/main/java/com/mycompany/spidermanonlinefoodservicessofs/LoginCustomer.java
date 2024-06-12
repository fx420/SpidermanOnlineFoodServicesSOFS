/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author Alan Wong
 */
public class LoginCustomer extends javax.swing.JFrame {
    static ArrayList CusUN = new ArrayList();
    static ArrayList Cuspass = new ArrayList();

    public LoginCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerLab = new javax.swing.JLabel();
        CusUNLab = new javax.swing.JLabel();
        CusPassLab = new javax.swing.JLabel();
        CusUNTxt = new javax.swing.JTextField();
        CusPassTxt = new javax.swing.JTextField();
        ClearBut = new javax.swing.JButton();
        RegisterBut = new javax.swing.JButton();
        LoginBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CustomerLab.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        CustomerLab.setForeground(new java.awt.Color(255, 0, 0));
        CustomerLab.setText("Customer Login Page");

        CusUNLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusUNLab.setForeground(new java.awt.Color(0, 0, 255));
        CusUNLab.setText("Customer Username:");

        CusPassLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusPassLab.setForeground(new java.awt.Color(51, 51, 255));
        CusPassLab.setText("Password:");

        ClearBut.setBackground(new java.awt.Color(255, 255, 255));
        ClearBut.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ClearBut.setForeground(new java.awt.Color(0, 0, 0));
        ClearBut.setText("Clear");
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });

        RegisterBut.setBackground(new java.awt.Color(255, 255, 255));
        RegisterBut.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        RegisterBut.setForeground(new java.awt.Color(0, 0, 0));
        RegisterBut.setText("Register");
        RegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButActionPerformed(evt);
            }
        });

        LoginBut.setBackground(new java.awt.Color(255, 255, 255));
        LoginBut.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LoginBut.setForeground(new java.awt.Color(0, 0, 0));
        LoginBut.setText("Login");
        LoginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButActionPerformed(evt);
            }
        });

        BackBut.setBackground(new java.awt.Color(255, 255, 255));
        BackBut.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 18)); // NOI18N
        BackBut.setForeground(new java.awt.Color(0, 0, 0));
        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(RegisterBut)
                        .addGap(43, 43, 43)
                        .addComponent(LoginBut))
                    .addComponent(CustomerLab)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CusUNLab)
                            .addComponent(CusPassLab))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CusUNTxt)
                            .addComponent(CusPassTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackBut)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(CustomerLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusUNLab)
                    .addComponent(CusUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusPassLab)
                    .addComponent(CusPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegisterBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BackBut)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButActionPerformed
        // TODO add your handling code here:

           try {
                String s;
                String CusUN = CusUNTxt.getText();
                String CusPass = CusUNTxt.getText();
                String[] array;
                boolean isLogin= false; 
                BufferedReader br = new BufferedReader(new FileReader("storage/customer.txt"));
                while((s=br.readLine())!=null) {
                    array=s.split("/");
                    if(CusUNTxt.getText().equals(array[0])&& CusPassTxt.getText().equals(array[1])){
                        JOptionPane.showMessageDialog(null, "You are logged in");
                        isLogin = true;
                        this.setVisible(false);
                        new CustomerMainMenu().setVisible(true);
                        break;
                    } else if(array.length != 0 && CusUN.equals(CusUNTxt.getText())&& CusPass.equals(CusPassTxt.getText())){
                        JOptionPane.showMessageDialog(null, "You are logged in");
                        isLogin = true;
                        this.setVisible(false);
                        new CustomerMainMenu().setVisible(true);
                        break;
                    }
                }
                if(!isLogin) {
                    JOptionPane.showMessageDialog(null, "Please check your account information again.");
                }
                br.close();
            } catch (IOException e10) {
                // TODO Auto-generated catch block
                e10.printStackTrace();
            }
                    
    }//GEN-LAST:event_LoginButActionPerformed

    private void RegisterButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new RegisterCustomer().setVisible(true);
    }//GEN-LAST:event_RegisterButActionPerformed

    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButActionPerformed
        // TODO add your handling code here:
        CusUNTxt.setText("");
        CusPassTxt.setText("");
    }//GEN-LAST:event_ClearButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_BackButActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JButton ClearBut;
    private javax.swing.JLabel CusPassLab;
    private javax.swing.JTextField CusPassTxt;
    private javax.swing.JLabel CusUNLab;
    private javax.swing.JTextField CusUNTxt;
    private javax.swing.JLabel CustomerLab;
    private javax.swing.JButton LoginBut;
    private javax.swing.JButton RegisterBut;
    // End of variables declaration//GEN-END:variables
}