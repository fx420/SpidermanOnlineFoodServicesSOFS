/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import javax.swing.JOptionPane;
import com.mycompany.spidermanonlinefoodservicessofs.ItemService;

/**
 *
 * @author Alan Wong
 */
public class DeleteFood extends javax.swing.JFrame {
    
    private final ItemService ItemService;

    /**
     * Creates new form DeleteFood
     */
    public DeleteFood() {
        initComponents();
        this.ItemService = new ItemService();
        performFileRelatedTask();
    }
    
    private void performFileRelatedTask() {
        StringBuilder fullnames = new StringBuilder();

        ItemService.getAll().forEach((item) -> {
            fullnames.append(item.getFDID())
                    .append("\t")
                    .append(item.getFDName())
                    .append("\t\t")
                    .append(item.getFDCategory())
                    .append("\t")
                    .append(item.getFDPrice())
                    .append("\n");
        });

        FDList.setText(fullnames.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FoodLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FDList = new javax.swing.JTextArea();
        FDIDLab = new javax.swing.JLabel();
        FDNLab = new javax.swing.JLabel();
        FDCategoryLab = new javax.swing.JLabel();
        FDPriceLab = new javax.swing.JLabel();
        DltFDLab = new javax.swing.JLabel();
        DltFDTxt = new javax.swing.JTextField();
        DltBut = new javax.swing.JButton();
        BackBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FoodLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        FoodLab.setForeground(new java.awt.Color(0, 0, 0));
        FoodLab.setText("Delete Food");

        FDList.setColumns(20);
        FDList.setRows(5);
        jScrollPane1.setViewportView(FDList);

        FDIDLab.setText("Food ID");

        FDNLab.setText("Food Name");

        FDCategoryLab.setText("Food Category");

        FDPriceLab.setText("Food Price");

        DltFDLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        DltFDLab.setForeground(new java.awt.Color(0, 0, 0));
        DltFDLab.setText("Enter Food Name to delete:");

        DltBut.setBackground(new java.awt.Color(255, 255, 255));
        DltBut.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        DltBut.setForeground(new java.awt.Color(0, 0, 0));
        DltBut.setText("Delete");
        DltBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DltButActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FoodLab, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DltBut))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(FDIDLab)
                        .addGap(39, 39, 39)
                        .addComponent(FDNLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FDCategoryLab)
                        .addGap(30, 30, 30)
                        .addComponent(FDPriceLab)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(DltFDLab, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DltFDTxt)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FoodLab)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDIDLab)
                    .addComponent(FDNLab)
                    .addComponent(FDCategoryLab)
                    .addComponent(FDPriceLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DltFDLab)
                    .addComponent(DltFDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DltBut)
                    .addComponent(BackBut))
                .addContainerGap(8, Short.MAX_VALUE))
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
        String FDName = DltFDTxt.getText();

        if (FDName.isEmpty()) {
            DltFDTxt.setText("");
            JOptionPane.showMessageDialog(this, "Please enter a valid name to delete");
            return;
        }

        boolean isDeleted = ItemService.delete(FDName);

        if (!isDeleted) {
            DltFDTxt.setText("");
            JOptionPane.showMessageDialog(this, "No Food has been found to delete");
            return;
        }

        // Show confirmation pop up
        JOptionPane.showMessageDialog(this, "Food has been removed");

        // Reset the deleted text field
        DltFDTxt.setText("");

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
            java.util.logging.Logger.getLogger(DeleteFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JButton DltBut;
    private javax.swing.JLabel DltFDLab;
    private javax.swing.JTextField DltFDTxt;
    private javax.swing.JLabel FDCategoryLab;
    private javax.swing.JLabel FDIDLab;
    private javax.swing.JTextArea FDList;
    private javax.swing.JLabel FDNLab;
    private javax.swing.JLabel FDPriceLab;
    private javax.swing.JLabel FoodLab;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
