/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import javax.swing.JOptionPane;
import com.mycompany.spidermanonlinefoodservicessofs.adminservice;

/**
 *
 * @author Alan Wong
 */
public class DeleteAdmin extends javax.swing.JFrame {

    private final adminservice adminservice;
    
    /**
     * Creates new form DeleteAdmin
     */
    public DeleteAdmin() {
        initComponents();
        this.adminservice= new adminservice();
        performFileRelatedTask();
    }
    
    private void performFileRelatedTask() {
        StringBuilder stringBuilder = new StringBuilder();
        adminservice.getAll().forEach((Staff) -> {
            stringBuilder.append(Staff.getStaffUN())
                    .append("\n");

        });
        StaffList.setText(stringBuilder.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DltAdminLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StaffList = new javax.swing.JTextArea();
        StaffUNLab = new javax.swing.JLabel();
        DltStaffLab = new javax.swing.JLabel();
        DltStaffUNTxt = new javax.swing.JTextField();
        BackBut = new javax.swing.JButton();
        DltBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DltAdminLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        DltAdminLab.setForeground(new java.awt.Color(0, 0, 0));
        DltAdminLab.setText("Delete Admin");

        StaffList.setColumns(20);
        StaffList.setRows(5);
        jScrollPane1.setViewportView(StaffList);

        StaffUNLab.setText("Staff Username");

        DltStaffLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        DltStaffLab.setForeground(new java.awt.Color(0, 0, 0));
        DltStaffLab.setText("Which Staff want to delete:");

        BackBut.setBackground(new java.awt.Color(255, 255, 255));
        BackBut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        BackBut.setForeground(new java.awt.Color(0, 0, 0));
        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        DltBut.setBackground(new java.awt.Color(255, 255, 255));
        DltBut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        DltBut.setForeground(new java.awt.Color(0, 0, 0));
        DltBut.setText("Delete");
        DltBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DltButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BackBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DltBut))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DltStaffLab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DltStaffUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StaffUNLab)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(DltAdminLab, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(116, 116, 116)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DltAdminLab)
                .addGap(3, 3, 3)
                .addComponent(StaffUNLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DltStaffLab)
                    .addComponent(DltStaffUNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBut)
                    .addComponent(DltBut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        AdminMainPage AP = new AdminMainPage();
        AP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackButActionPerformed

    private void DltButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DltButActionPerformed
        // TODO add your handling code here:
        String deleteStaffUN = DltStaffUNTxt.getText();
        
        if (deleteStaffUN.isEmpty()) {
            DltStaffUNTxt.setText("");
            JOptionPane.showMessageDialog(this, "Please eneter a valid Staff ID to delete");
            return;
        }
        
        adminservice.delete(deleteStaffUN);

        // Show confirmation pop up
        JOptionPane.showMessageDialog(this, "Staff has been deleted");

        // Reset the deleted text field
        DltStaffUNTxt.setText("");

        // Reinitilize the form with updated data
        performFileRelatedTask();
    }//GEN-LAST:event_DltButActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JLabel DltAdminLab;
    private javax.swing.JButton DltBut;
    private javax.swing.JLabel DltStaffLab;
    private javax.swing.JTextField DltStaffUNTxt;
    private javax.swing.JTextArea StaffList;
    private javax.swing.JLabel StaffUNLab;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
