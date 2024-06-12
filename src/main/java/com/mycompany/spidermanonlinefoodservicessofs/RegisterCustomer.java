/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;
import java.io.*;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import com.mycompany.spidermanonlinefoodservicessofs.customer;
import com.mycompany.spidermanonlinefoodservicessofs.customerservice;
/**
 *
 * @author Alan Wong
 */
public class RegisterCustomer extends javax.swing.JFrame {
    
    private final customerservice customerservice;

    public RegisterCustomer() {
        initComponents();
        this.customerservice = new customerservice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CusReLab = new javax.swing.JLabel();
        CusUNLab = new javax.swing.JLabel();
        CusFNLab = new javax.swing.JLabel();
        CusAddressLab = new javax.swing.JLabel();
        CusEmailLab = new javax.swing.JLabel();
        CusPhoneLab = new javax.swing.JLabel();
        CusPassLab = new javax.swing.JLabel();
        CusUNTxt = new javax.swing.JTextField();
        CusFNTxt = new javax.swing.JTextField();
        CusAddressTxt = new javax.swing.JTextField();
        CusEmailTxt = new javax.swing.JTextField();
        CusPhoneTxt = new javax.swing.JTextField();
        CusPassTxt = new javax.swing.JTextField();
        RegisterBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();
        CusIDLab = new javax.swing.JLabel();
        CusIDTxt = new javax.swing.JTextField();
        ClearBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CusReLab.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CusReLab.setForeground(new java.awt.Color(255, 0, 51));
        CusReLab.setText("Customer Registertation Page");

        CusUNLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusUNLab.setForeground(new java.awt.Color(0, 0, 255));
        CusUNLab.setText("Customer Username:");

        CusFNLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusFNLab.setForeground(new java.awt.Color(51, 51, 255));
        CusFNLab.setText("Fullname:");

        CusAddressLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusAddressLab.setForeground(new java.awt.Color(51, 51, 255));
        CusAddressLab.setText("Address:");

        CusEmailLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusEmailLab.setForeground(new java.awt.Color(0, 0, 255));
        CusEmailLab.setText("E-mail:");

        CusPhoneLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusPhoneLab.setForeground(new java.awt.Color(51, 51, 255));
        CusPhoneLab.setText("Phone Number:");

        CusPassLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusPassLab.setForeground(new java.awt.Color(0, 0, 255));
        CusPassLab.setText("Password:");

        RegisterBut.setBackground(new java.awt.Color(255, 255, 255));
        RegisterBut.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        RegisterBut.setForeground(new java.awt.Color(0, 0, 0));
        RegisterBut.setText("Register");
        RegisterBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButActionPerformed(evt);
            }
        });

        BackBut.setBackground(new java.awt.Color(255, 255, 255));
        BackBut.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BackBut.setForeground(new java.awt.Color(0, 0, 0));
        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        CusIDLab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CusIDLab.setForeground(new java.awt.Color(51, 51, 255));
        CusIDLab.setText("Customer ID:");

        ClearBut.setBackground(new java.awt.Color(255, 255, 255));
        ClearBut.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ClearBut.setForeground(new java.awt.Color(0, 0, 0));
        ClearBut.setText("Clear");
        ClearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearBut, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(RegisterBut)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(CusUNLab))
                            .addComponent(CusIDLab))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CusIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CusUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CusReLab, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CusFNLab)
                            .addComponent(CusPhoneLab)
                            .addComponent(CusPassLab)
                            .addComponent(CusEmailLab)
                            .addComponent(CusAddressLab))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CusEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CusFNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CusAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CusPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CusPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(CusReLab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusIDLab)
                    .addComponent(CusIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusUNLab)
                    .addComponent(CusUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusFNLab)
                    .addComponent(CusFNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusEmailLab)
                    .addComponent(CusEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusAddressLab)
                    .addComponent(CusAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusPhoneLab)
                    .addComponent(CusPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CusPassLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterBut)
                    .addComponent(BackBut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButActionPerformed
        // TODO add your handling code here:

            String CusID = CusIDTxt.getText().trim();
            String CusUN = CusUNTxt.getText().trim();
            String CusFN = CusFNTxt.getText().trim();
            String CusEmail = CusEmailTxt.getText().trim();
            String CusAddress = CusAddressTxt.getText().trim();
            String CusPhone = CusPhoneTxt.getText().trim();
            String CusPass = CusPassTxt.getText().trim();
            
            try{
                FileWriter fr = new FileWriter("storage/customer.txt",true);
                try(PrintWriter pr = new PrintWriter(fr)){
                    pr.println(CusID + "," + CusUN + "," + CusFN + "," + CusEmail + "," + CusAddress + "," + CusPhone + "," + CusPass);
                    customer customer = new customer(CusID, CusUN, CusFN, CusEmail, CusPhone, CusAddress, CusPass);
                    customerservice.create(customer);
                    JOptionPane.showMessageDialog(this, "Account Success Register!");
                }
            }   catch (IOException e){
            }
            this.setVisible(false);
            new LoginCustomer().setVisible(true);
    }//GEN-LAST:event_RegisterButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginCustomer().setVisible(true);
    }//GEN-LAST:event_BackButActionPerformed

    private void ClearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButActionPerformed
        // TODO add your handling code here:
        CusIDTxt.setText("");
        CusUNTxt.setText("");
        CusFNTxt.setText("");
        CusEmailTxt.setText("");
        CusAddressTxt.setText("");
        CusPhoneTxt.setText("");
        CusPassTxt.setText("");
    }//GEN-LAST:event_ClearButActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JButton ClearBut;
    private javax.swing.JLabel CusAddressLab;
    private javax.swing.JTextField CusAddressTxt;
    private javax.swing.JLabel CusEmailLab;
    private javax.swing.JTextField CusEmailTxt;
    private javax.swing.JLabel CusFNLab;
    private javax.swing.JTextField CusFNTxt;
    private javax.swing.JLabel CusIDLab;
    private javax.swing.JTextField CusIDTxt;
    private javax.swing.JLabel CusPassLab;
    private javax.swing.JTextField CusPassTxt;
    private javax.swing.JLabel CusPhoneLab;
    private javax.swing.JTextField CusPhoneTxt;
    private javax.swing.JLabel CusReLab;
    private javax.swing.JLabel CusUNLab;
    private javax.swing.JTextField CusUNTxt;
    private javax.swing.JButton RegisterBut;
    // End of variables declaration//GEN-END:variables
}
