/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import javax.swing.JOptionPane;
import com.mycompany.spidermanonlinefoodservicessofs.Item;
import com.mycompany.spidermanonlinefoodservicessofs.ItemService;

/**
 *
 * @author Alan Wong
 */
public class AddFoodItem extends javax.swing.JFrame {

    private final ItemService itemService; 
    /**
     * Creates new form AddFDCategory
     */
    public AddFoodItem() {
        initComponents();
        this.itemService = new ItemService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewFDLab = new javax.swing.JLabel();
        BackBut = new javax.swing.JButton();
        FDIDLab = new javax.swing.JLabel();
        FDNameLab = new javax.swing.JLabel();
        FDPriceLab = new javax.swing.JLabel();
        FDCategoryLab = new javax.swing.JLabel();
        FDIDTxt = new javax.swing.JTextField();
        FDNameTxt = new javax.swing.JTextField();
        FDPriceTxt = new javax.swing.JTextField();
        AddBut = new javax.swing.JButton();
        FDCategoryTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewFDLab.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        ViewFDLab.setForeground(new java.awt.Color(255, 255, 0));
        ViewFDLab.setText("Add Food Item");

        BackBut.setBackground(new java.awt.Color(255, 255, 255));
        BackBut.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 18)); // NOI18N
        BackBut.setForeground(new java.awt.Color(0, 0, 0));
        BackBut.setText("Back");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        FDIDLab.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        FDIDLab.setForeground(new java.awt.Color(0, 0, 0));
        FDIDLab.setText("Food ID");

        FDNameLab.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        FDNameLab.setForeground(new java.awt.Color(0, 0, 0));
        FDNameLab.setText("Food Name");

        FDPriceLab.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        FDPriceLab.setForeground(new java.awt.Color(0, 0, 0));
        FDPriceLab.setText("Price(RM)");

        FDCategoryLab.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        FDCategoryLab.setForeground(new java.awt.Color(0, 0, 0));
        FDCategoryLab.setText("Category");

        AddBut.setBackground(new java.awt.Color(255, 255, 255));
        AddBut.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 18)); // NOI18N
        AddBut.setForeground(new java.awt.Color(0, 0, 0));
        AddBut.setText("ADD");
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
                .addGap(18, 18, 18)
                .addComponent(BackBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FDPriceLab, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(FDPriceTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FDNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FDCategoryLab, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FDNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(FDIDTxt)
                                    .addComponent(FDCategoryTxt))))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ViewFDLab, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FDIDLab))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBut)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BackBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewFDLab)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDIDLab)
                    .addComponent(FDIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDNameLab)
                    .addComponent(FDNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDCategoryLab)
                    .addComponent(FDCategoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDPriceLab)
                    .addComponent(FDPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(AddBut)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        // TODO add your handling code here:
        String FDID = FDIDTxt.getText();
        String FDName = FDNameTxt.getText();
        String FDCategory = FDCategoryTxt.getText();
        String FDPrice = FDPriceTxt.getText();
        
        if(FDID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Food ID cannot be empty");
            return;
        }
        
        if(FDName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Food name cannot be empty");
            return;
        }
        
        if(FDCategory.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Food Category cannot be empty");
            return;
        }
       
        if(FDPrice.isEmpty() || !FDPrice.chars().allMatch( Character::isDigit) ||
                Double.parseDouble(FDPrice) <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price for the item");
            return;
        }
        
        
        Item item = new Item(FDID,FDName,FDCategory,
                    Double.parseDouble(FDPriceTxt.getText()));
        
        itemService.create(item);
        
        FDIDTxt.setText("");
        FDNameTxt.setText("");
        FDCategoryTxt.setText("");
        FDPriceTxt.setText("");
        JOptionPane.showMessageDialog(this, "Food Details has been added");
        
        
    }//GEN-LAST:event_AddButActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        AdminMainPage ap = new AdminMainPage();
        ap.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFoodItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBut;
    private javax.swing.JButton BackBut;
    private javax.swing.JLabel FDCategoryLab;
    private javax.swing.JTextField FDCategoryTxt;
    private javax.swing.JLabel FDIDLab;
    private javax.swing.JTextField FDIDTxt;
    private javax.swing.JLabel FDNameLab;
    private javax.swing.JTextField FDNameTxt;
    private javax.swing.JLabel FDPriceLab;
    private javax.swing.JTextField FDPriceTxt;
    private javax.swing.JLabel ViewFDLab;
    // End of variables declaration//GEN-END:variables
}
