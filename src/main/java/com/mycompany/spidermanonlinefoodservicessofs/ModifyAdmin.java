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
public class ModifyAdmin extends javax.swing.JFrame {

    private final adminservice adminservice;
    
    /**
     * Creates new form ModifyAdmin
     */
    public ModifyAdmin() {
        initComponents();
        this.adminservice = new adminservice();
        performFileRelatedTask();
    }
    
    private void performFileRelatedTask() {
        StringBuilder fullnames = new StringBuilder();

        adminservice.getAll().forEach((Staff) -> {
            fullnames.append(Staff.getStaffUN())
                    .append("\t\t")
                    .append(Staff.getStaffPass())
                    .append("\n");
        });

        StaffList.setText(fullnames.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModifyStaffLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StaffList = new javax.swing.JTextArea();
        StaffUNLab = new javax.swing.JLabel();
        StaffPassLab = new javax.swing.JLabel();
        ModifyLab = new javax.swing.JLabel();
        StaffUNTxt = new javax.swing.JTextField();
        NStaffUNLab = new javax.swing.JLabel();
        NStaffPassLab = new javax.swing.JLabel();
        NStaffUNTxt = new javax.swing.JTextField();
        NStaffPassTxt = new javax.swing.JTextField();
        ModifyBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ModifyStaffLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        ModifyStaffLab.setForeground(new java.awt.Color(0, 0, 0));
        ModifyStaffLab.setText("Modify Staff");

        StaffList.setColumns(20);
        StaffList.setRows(5);
        jScrollPane1.setViewportView(StaffList);

        StaffUNLab.setText("Staff Username");

        StaffPassLab.setText("Staff Password");

        ModifyLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        ModifyLab.setForeground(new java.awt.Color(0, 0, 0));
        ModifyLab.setText("Which staff want to modify:");

        NStaffUNLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        NStaffUNLab.setForeground(new java.awt.Color(0, 0, 0));
        NStaffUNLab.setText("Enter new Staff Username:");

        NStaffPassLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        NStaffPassLab.setForeground(new java.awt.Color(0, 0, 0));
        NStaffPassLab.setText("Enter new staff Password:");

        ModifyBut.setBackground(new java.awt.Color(255, 255, 255));
        ModifyBut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        ModifyBut.setForeground(new java.awt.Color(0, 0, 0));
        ModifyBut.setText("Modify");
        ModifyBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButActionPerformed(evt);
            }
        });

        BackBut.setBackground(new java.awt.Color(255, 255, 255));
        BackBut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StaffUNLab)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NStaffPassLab, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StaffPassLab)
                            .addComponent(ModifyStaffLab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BackBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModifyBut))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ModifyLab, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StaffUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(NStaffUNLab, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NStaffPassTxt)
                            .addComponent(NStaffUNTxt))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ModifyStaffLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StaffUNLab)
                    .addComponent(StaffPassLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyLab)
                    .addComponent(StaffUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NStaffUNLab)
                    .addComponent(NStaffUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NStaffPassLab)
                    .addComponent(NStaffPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyBut)
                    .addComponent(BackBut))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModifyButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButActionPerformed
        // TODO add your handling code here:
        String sourceStaffUN = StaffUNTxt.getText();
        String StaffUN = NStaffUNTxt.getText();
        String StaffPass = NStaffPassTxt.getText();

        if (sourceStaffUN.isEmpty() ||  StaffUN.isEmpty() || StaffUN.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field cannot be left empty");
            return;
        }

        if (!NStaffUNTxt.getText().chars().allMatch(Character::isLetterOrDigit)) {
            JOptionPane.showMessageDialog(this, "Please enter valid password");
            return;
        }

        admin updatedadmin = new admin(StaffUN, StaffPass);

        boolean isUpdated = adminservice.update(sourceStaffUN, updatedadmin);
        
        if (!isUpdated) {
            JOptionPane.showConfirmDialog(this, "No labour found to update");
            return;
        }

        // Reset the modify fields
        StaffUNTxt.setText("");
        NStaffUNTxt.setText("");
        NStaffPassTxt.setText("");

        // Show confirmation pop up
        JOptionPane.showMessageDialog(this, "Labour info has been Updated");

        // Update display information
        performFileRelatedTask();
    }//GEN-LAST:event_ModifyButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
         AdminMainPage AP = new AdminMainPage();
         AP.setVisible(true);
         this.setVisible(false);
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
            java.util.logging.Logger.getLogger(ModifyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JButton ModifyBut;
    private javax.swing.JLabel ModifyLab;
    private javax.swing.JLabel ModifyStaffLab;
    private javax.swing.JLabel NStaffPassLab;
    private javax.swing.JTextField NStaffPassTxt;
    private javax.swing.JLabel NStaffUNLab;
    private javax.swing.JTextField NStaffUNTxt;
    private javax.swing.JTextArea StaffList;
    private javax.swing.JLabel StaffPassLab;
    private javax.swing.JLabel StaffUNLab;
    private javax.swing.JTextField StaffUNTxt;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
