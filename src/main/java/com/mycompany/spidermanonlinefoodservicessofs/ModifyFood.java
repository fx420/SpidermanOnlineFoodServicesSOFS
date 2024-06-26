/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.mycompany.spidermanonlinefoodservicessofs;

import javax.swing.JOptionPane;
import com.mycompany.spidermanonlinefoodservicessofs.Item;
import com.mycompany.spidermanonlinefoodservicessofs.ItemService;

/**
 *
 * @author Shahin
 */
public class ModifyFood extends javax.swing.JFrame {

    private final ItemService ItemService;

    /**
     * Creates new form ModifyItem
     */
    public ModifyFood() {
        initComponents();
        this.ItemService = new ItemService();
        performFileRelatedTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void performFileRelatedTask() {
        StringBuilder fullnames = new StringBuilder();

        ItemService.getAll().forEach((item) -> {
            fullnames.append(item.getFDID())
                    .append("\t")
                    .append(item.getFDName())
                    .append("\t\t")
                    .append(item.getFDCategory())
                    .append("\t\t")
                    .append(item.getFDPrice())
                    .append("\n");
        });

        FDList.setText(fullnames.toString());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        FDList = new javax.swing.JTextArea();
        NFDIDLab = new javax.swing.JLabel();
        NFDIDTxt = new javax.swing.JTextField();
        ModifyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        ENFDNLab = new javax.swing.JLabel();
        NFDNTxt = new javax.swing.JTextField();
        NFDPriceTxt = new javax.swing.JTextField();
        ENFDPriceLab = new javax.swing.JLabel();
        FDNLab = new javax.swing.JLabel();
        FDPriceLab = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FDIDLab = new javax.swing.JLabel();
        FDCategoryLab = new javax.swing.JLabel();
        ENFDcategoryLab = new javax.swing.JLabel();
        NFDCategoryTxt = new javax.swing.JTextField();
        EFDNameLab = new javax.swing.JLabel();
        FDNameTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        FDList.setEditable(false);
        FDList.setColumns(20);
        FDList.setRows(5);
        jScrollPane1.setViewportView(FDList);

        NFDIDLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        NFDIDLab.setForeground(new java.awt.Color(0, 0, 0));
        NFDIDLab.setText("Enter NewFood ID :");

        ModifyButton.setBackground(new java.awt.Color(255, 255, 255));
        ModifyButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        ModifyButton.setForeground(new java.awt.Color(0, 0, 0));
        ModifyButton.setText("Modify");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ENFDNLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        ENFDNLab.setForeground(new java.awt.Color(0, 0, 0));
        ENFDNLab.setText("Enter New Food Name :");

        ENFDPriceLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        ENFDPriceLab.setForeground(new java.awt.Color(0, 0, 0));
        ENFDPriceLab.setText("Enter New Food Price :");

        FDNLab.setText("Food Name");

        FDPriceLab.setText("Food Price");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Modify Food");

        FDIDLab.setText("Food ID");

        FDCategoryLab.setText("Food Category");

        ENFDcategoryLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        ENFDcategoryLab.setForeground(new java.awt.Color(0, 0, 0));
        ENFDcategoryLab.setText("Enter New Food Category :");

        EFDNameLab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 18)); // NOI18N
        EFDNameLab.setForeground(new java.awt.Color(0, 0, 0));
        EFDNameLab.setText("Enter Food Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NFDIDLab, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ENFDNLab, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ENFDPriceLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(154, 154, 154))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EFDNameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FDNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FDIDLab)
                        .addGap(39, 39, 39)
                        .addComponent(FDNLab)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 71, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(FDCategoryLab)
                                .addGap(98, 98, 98)
                                .addComponent(FDPriceLab)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ENFDcategoryLab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NFDCategoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NFDNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NFDPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NFDIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModifyButton)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FDIDLab)
                    .addComponent(FDNLab)
                    .addComponent(FDCategoryLab)
                    .addComponent(FDPriceLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EFDNameLab)
                    .addComponent(FDNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NFDIDLab)
                    .addComponent(NFDIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NFDNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ENFDNLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ENFDcategoryLab)
                    .addComponent(NFDCategoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NFDPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ENFDPriceLab))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(ModifyButton))
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        String srcName = FDNameTxt.getText();
        String newFDID = NFDIDTxt.getText();
        String newFDName = NFDNTxt.getText();
        String newFDCategory = NFDCategoryTxt.getText();
        String newFDPrice =  NFDPriceTxt.getText();

        if (srcName.isEmpty() || newFDID.isEmpty() || newFDName.isEmpty() || newFDCategory.isEmpty()|| newFDPrice.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field cannot be left empty");
            return;
        }

        if (!newFDPrice.chars().allMatch(Character::isDigit)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price for the item");
            return;
        }
       

        Item ModifyFood = new Item (newFDID, newFDName, newFDCategory, Double.parseDouble(newFDPrice));

        boolean isUpdated = ItemService.update(srcName, ModifyFood);

        if (!isUpdated) {
            JOptionPane.showMessageDialog(this, "No Food was found to updated.");
            return;
        }

        // Reset the modify fields
        NFDIDTxt.setText("");
        NFDNTxt.setText("");
        NFDCategoryTxt.setText("");
        NFDPriceTxt.setText("");

        // Show confirmation pop up
        JOptionPane.showMessageDialog(this, "Food has been Modified");

        // Update display information
        performFileRelatedTask();
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AdminMainPage AP = new AdminMainPage();
        AP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ModifyFood().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EFDNameLab;
    private javax.swing.JLabel ENFDNLab;
    private javax.swing.JLabel ENFDPriceLab;
    private javax.swing.JLabel ENFDcategoryLab;
    private javax.swing.JLabel FDCategoryLab;
    private javax.swing.JLabel FDIDLab;
    private javax.swing.JTextArea FDList;
    private javax.swing.JLabel FDNLab;
    private javax.swing.JTextField FDNameTxt;
    private javax.swing.JLabel FDPriceLab;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JTextField NFDCategoryTxt;
    private javax.swing.JLabel NFDIDLab;
    private javax.swing.JTextField NFDIDTxt;
    private javax.swing.JTextField NFDNTxt;
    private javax.swing.JTextField NFDPriceTxt;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
