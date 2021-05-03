/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_System;

/**
 *
 * @author Xanakran
 */
public class Order_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Order_Menu
     */
    public Order_Menu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        DrinkButton = new javax.swing.JRadioButton();
        BurgerButton = new javax.swing.JRadioButton();
        SideButton = new javax.swing.JRadioButton();
        Banner = new javax.swing.JLabel();
        Select_item = new javax.swing.JLabel();
        Adjust_Quantity = new javax.swing.JLabel();
        Special_Comments = new javax.swing.JLabel();
        ItemList = new javax.swing.JComboBox<>();
        Quantity_spinner = new javax.swing.JSpinner();
        Comments_Text = new javax.swing.JTextField();
        Finish_Order = new javax.swing.JButton();
        Add_Item = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(990, 610));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DrinkButton.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(DrinkButton);
        DrinkButton.setText("Drinks");
        DrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DrinkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 318, 143));

        BurgerButton.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(BurgerButton);
        BurgerButton.setText("Burgers");
        BurgerButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BurgerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BurgerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 318, 143));

        SideButton.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(SideButton);
        SideButton.setText("Sides");
        SideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SideButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 318, 143));

        Banner.setBackground(new java.awt.Color(102, 255, 102));
        Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Banner.png"))); // NOI18N
        Banner.setText("Banner");
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 60));

        Select_item.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Select_item.setForeground(new java.awt.Color(255, 255, 255));
        Select_item.setText("Select Item:");
        getContentPane().add(Select_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 150, 33));

        Adjust_Quantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Adjust_Quantity.setForeground(new java.awt.Color(255, 255, 255));
        Adjust_Quantity.setText("Adjust Quantity:");
        getContentPane().add(Adjust_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 210, 33));

        Special_Comments.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Special_Comments.setForeground(new java.awt.Color(255, 255, 255));
        Special_Comments.setText("Special Comments:");
        getContentPane().add(Special_Comments, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 33));

        ItemList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ItemList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemListActionPerformed(evt);
            }
        });
        getContentPane().add(ItemList, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 225, 36));

        Quantity_spinner.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        getContentPane().add(Quantity_spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 55, 29));

        Comments_Text.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Comments_Text.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Comments_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comments_TextActionPerformed(evt);
            }
        });
        getContentPane().add(Comments_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 218, 102));

        Finish_Order.setText("Finish Order");
        Finish_Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Finish_OrderActionPerformed(evt);
            }
        });
        getContentPane().add(Finish_Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 165, 59));

        Add_Item.setText("Add Item to Order");
        Add_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ItemActionPerformed(evt);
            }
        });
        getContentPane().add(Add_Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 165, 59));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Color.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        Background.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background1..png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrinkButtonActionPerformed

    private void BurgerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurgerButtonActionPerformed

    private void Comments_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comments_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Comments_TextActionPerformed

    private void SideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SideButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SideButtonActionPerformed

    private void Finish_OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Finish_OrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Finish_OrderActionPerformed

    private void Add_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_ItemActionPerformed

    private void ItemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemListActionPerformed

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
            java.util.logging.Logger.getLogger(Order_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Item;
    private javax.swing.JLabel Adjust_Quantity;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Banner;
    private javax.swing.JRadioButton BurgerButton;
    private javax.swing.JTextField Comments_Text;
    private javax.swing.JRadioButton DrinkButton;
    private javax.swing.JButton Finish_Order;
    private javax.swing.JComboBox<String> ItemList;
    private javax.swing.JSpinner Quantity_spinner;
    private javax.swing.JLabel Select_item;
    private javax.swing.JRadioButton SideButton;
    private javax.swing.JLabel Special_Comments;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
