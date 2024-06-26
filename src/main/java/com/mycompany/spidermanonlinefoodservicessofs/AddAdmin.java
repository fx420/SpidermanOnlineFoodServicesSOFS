/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import javax.swing.JOptionPane;
import com.mycompany.spidermanonlinefoodservicessofs.admin;
import com.mycompany.spidermanonlinefoodservicessofs.adminservice;

/**
 *
 * @author Alan Wong
 */
public class AddAdmin extends javax.swing.JFrame {
    
    private final adminservice adminservice;

    /**
     * Creates new form AddAdmin
     */
    public AddAdmin() {
        initComponents();
        this.adminservice = new adminservice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddAdminLab = new javax.swing.JLabel();
        StaffUNLab = new javax.swing.JLabel();
        StaffPassLab = new javax.swing.JLabel();
        BackBut = new javax.swing.JButton();
        AddBut = new javax.swing.JButton();
        StaffUNTxt = new javax.swing.JTextField();
        StaffPassTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddAdminLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        AddAdminLab.setForeground(new java.awt.Color(0, 0, 0));
        AddAdminLab.setText("Add Admin");

        StaffUNLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        StaffUNLab.setText("Staff Username:");

        StaffPassLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        StaffPassLab.setText("Staff Password:");

        BackBut.setBackground(new java.awt.Color(255, 255, 255));
        BackBut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        BackBut.setForeground(new java.awt.Color(0, 0, 0));
        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        AddBut.setBackground(new java.awt.Color(255, 255, 255));
        AddBut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        AddBut.setForeground(new java.awt.Color(0, 0, 0));
        AddBut.setText("Add");
        AddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(AddAdminLab, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BackBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBut)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StaffUNLab, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(StaffPassLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StaffUNTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StaffPassTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AddAdminLab)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StaffUNLab)
                    .addComponent(StaffUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StaffPassLab)
                    .addComponent(StaffPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBut)
                    .addComponent(AddBut))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        AdminMainPage AP = new AdminMainPage();
        AP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButActionPerformed

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        // TODO add your handling code here:
        String StaffUN = StaffUNTxt.getText();
        String StaffPass = StaffPassTxt.getText();

        if (StaffUN.isEmpty() || StaffPass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field cannot be empty");
            return;
        }

        if (!StaffPass.chars().allMatch(Character::isLetterOrDigit)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid password");
            return;
        }
        
        admin admin = new admin(StaffUN, StaffPass);

        adminservice.create(admin);

        JOptionPane.showMessageDialog(this, "Admin has been added");

        // Reset input fields
        StaffUNTxt.setText("");
        StaffPassTxt.setText("");
    }//GEN-LAST:event_AddButActionPerformed

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
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddAdminLab;
    private javax.swing.JButton AddBut;
    private javax.swing.JButton BackBut;
    private javax.swing.JLabel StaffPassLab;
    private javax.swing.JTextField StaffPassTxt;
    private javax.swing.JLabel StaffUNLab;
    private javax.swing.JTextField StaffUNTxt;
    // End of variables declaration//GEN-END:variables
}
