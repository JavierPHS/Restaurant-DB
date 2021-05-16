/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_System;

import Connector.mySQLConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Xanakran
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    String cUsername;
    String cName;
    String address;
    int zipcode;
    String mUsername;
    String mName;
    int userFlag = 0;  // 0 = guest, 1 = customer, 2 = manager
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
        ResultSet rs;
        PreparedStatement ps;
        String query = "SELECT * FROM Menu";
        ps = mySQLConnector.setConnection().prepareStatement(query);
        rs = ps.executeQuery();
        while (rs.next()) {
            String item = (String) rs.getString("itemName") + " : $" + rs.getFloat("itemPrice") + "\n";
            if (rs.getString("itemType").equals("Burger")) {
                burgersText.append(item);
            }
            else if (rs.getString("itemType").equalsIgnoreCase("Side")) {
                sidesText.append(item);
            }
            else if (rs.getString("itemType").equalsIgnoreCase("Drink")) {
                drinksText.append(item);
            }
        }
        
        } catch (Exception e) {
            
        }
    }
    
    public Menu(String user, String name, String add, int zip) {
        initComponents();
        this.setLocationRelativeTo(null);
        cUsername = user;
        cName = name;
        address = add;
        zipcode = zip;
        userFlag = 1;
        try {
        ResultSet rs;
        PreparedStatement ps;
        String query = "SELECT * FROM Menu";
        ps = mySQLConnector.setConnection().prepareStatement(query);
        rs = ps.executeQuery();
        while (rs.next()) {
            String item = (String) rs.getString("itemName") + " : $" + rs.getFloat("itemPrice") + "\n";
            if (rs.getString("itemType").equals("Burger")) {
                burgersText.append(item);
            }
            else if (rs.getString("itemType").equalsIgnoreCase("Side")) {
                sidesText.append(item);
            }
            else if (rs.getString("itemType").equalsIgnoreCase("Drink")) {
                drinksText.append(item);
            }
        }
        
        } catch (Exception e) {
            
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemsTab = new javax.swing.JTabbedPane();
        burgersTab = new javax.swing.JPanel();
        burgersText = new javax.swing.JTextArea();
        Burger4 = new javax.swing.JLabel();
        Burger1 = new javax.swing.JLabel();
        Burger2 = new javax.swing.JLabel();
        Burger3 = new javax.swing.JLabel();
        txtShadow1 = new javax.swing.JLabel();
        sidesTab = new javax.swing.JPanel();
        sidesText = new javax.swing.JTextArea();
        Sides1 = new javax.swing.JLabel();
        Sides2 = new javax.swing.JLabel();
        Sides3 = new javax.swing.JLabel();
        Sides4 = new javax.swing.JLabel();
        txtShadow2 = new javax.swing.JLabel();
        drinksTab = new javax.swing.JPanel();
        drinksText = new javax.swing.JTextArea();
        Drink3 = new javax.swing.JLabel();
        Drink1 = new javax.swing.JLabel();
        Drink4 = new javax.swing.JLabel();
        Drink2 = new javax.swing.JLabel();
        txtShadow3 = new javax.swing.JLabel();
        Homebutton = new javax.swing.JButton();
        Banner = new javax.swing.JLabel();
        BannerColor = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemsTab.setFocusable(false);
        itemsTab.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        burgersTab.setBackground(new java.awt.Color(255, 255, 255));
        burgersTab.setOpaque(false);
        burgersTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        burgersText.setEditable(false);
        burgersText.setBackground(new java.awt.Color(0,0,0,0));
        burgersText.setColumns(20);
        burgersText.setFont(new java.awt.Font("Rockwell", 3, 30)); // NOI18N
        burgersText.setForeground(new java.awt.Color(255, 255, 255));
        burgersText.setRows(5);
        burgersText.setText("test");
        burgersText.setBorder(null);
        burgersText.setOpaque(false);
        burgersTab.add(burgersText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 560, 400));

        Burger4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Burger4.png"))); // NOI18N
        Burger4.setText("Burger1");
        burgersTab.add(Burger4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 210, 130));

        Burger1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Burger1.png"))); // NOI18N
        Burger1.setText("Burger1");
        Burger1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        burgersTab.add(Burger1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 200, 130));

        Burger2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Burger2.png"))); // NOI18N
        Burger2.setText("Burger1");
        Burger2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        burgersTab.add(Burger2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 210, 130));

        Burger3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Burger3.png"))); // NOI18N
        Burger3.setText("Burger1");
        burgersTab.add(Burger3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 210, 130));

        txtShadow1.setBackground(new java.awt.Color(0,0,0,128));
        txtShadow1.setOpaque(true);
        burgersTab.add(txtShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));

        itemsTab.addTab("Burgers", burgersTab);

        sidesTab.setBackground(new java.awt.Color(255, 255, 255));
        sidesTab.setOpaque(false);
        sidesTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidesText.setEditable(false);
        sidesText.setBackground(new java.awt.Color(0,0,0,0));
        sidesText.setColumns(20);
        sidesText.setFont(new java.awt.Font("Rockwell", 3, 30)); // NOI18N
        sidesText.setForeground(new java.awt.Color(255, 255, 255));
        sidesText.setRows(5);
        sidesText.setText("test2");
        sidesText.setBorder(null);
        sidesText.setOpaque(false);
        sidesTab.add(sidesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 610, 400));

        Sides1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Sides1.png"))); // NOI18N
        Sides1.setText("Burger1");
        Sides1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        sidesTab.add(Sides1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 220, 130));

        Sides2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Sides4.png"))); // NOI18N
        Sides2.setText("Burger1");
        Sides2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        sidesTab.add(Sides2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 220, 130));

        Sides3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Sides2.png"))); // NOI18N
        Sides3.setText("Burger1");
        Sides3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        sidesTab.add(Sides3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 210, 130));

        Sides4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Sides3.png"))); // NOI18N
        Sides4.setText("Burger1");
        Sides4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        sidesTab.add(Sides4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 220, 130));

        txtShadow2.setBackground(new java.awt.Color(0,0,0,128));
        txtShadow2.setOpaque(true);
        sidesTab.add(txtShadow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));

        itemsTab.addTab("Sides", sidesTab);

        drinksTab.setBackground(new java.awt.Color(255, 255, 255));
        drinksTab.setOpaque(false);
        drinksTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drinksText.setEditable(false);
        drinksText.setBackground(new java.awt.Color(0,0,0,0));
        drinksText.setColumns(20);
        drinksText.setFont(new java.awt.Font("Rockwell", 3, 30)); // NOI18N
        drinksText.setForeground(new java.awt.Color(255, 255, 255));
        drinksText.setRows(5);
        drinksText.setText("test3");
        drinksText.setBorder(null);
        drinksText.setOpaque(false);
        drinksTab.add(drinksText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 600, 400));

        Drink3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Drinks3.png"))); // NOI18N
        Drink3.setText("Burger1");
        Drink3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        drinksTab.add(Drink3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 220, 150));

        Drink1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Drinks1.png"))); // NOI18N
        Drink1.setText("Burger1");
        Drink1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        drinksTab.add(Drink1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 220, 150));

        Drink4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Drinks4.png"))); // NOI18N
        Drink4.setText("Burger1");
        Drink4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        drinksTab.add(Drink4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 230, 150));

        Drink2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Drinks2.png"))); // NOI18N
        Drink2.setText("Burger1");
        Drink2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        drinksTab.add(Drink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 220, 150));

        txtShadow3.setBackground(new java.awt.Color(0,0,0,128));
        txtShadow3.setOpaque(true);
        drinksTab.add(txtShadow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 460));

        itemsTab.addTab("Drinks", drinksTab);

        getContentPane().add(itemsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 990, 500));

        Homebutton.setText("Main Menu");
        Homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Homebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 129, 54));

        Banner.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Banner.png"))); // NOI18N
        Banner.setText("Johnny's Burgers");
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 480, -1));

        BannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Color.png"))); // NOI18N
        BannerColor.setText("jLabel1");
        BannerColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(BannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Menu_Picture.png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebuttonActionPerformed
        if (userFlag == 0) {
            Restaurant_System rs = new Restaurant_System();
            rs.setVisible(true);
            this.dispose();
        }
        else if (userFlag == 1) {
            Customer_Menu cm = new Customer_Menu(cUsername, cName, address, zipcode);
            cm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_HomebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel BannerColor;
    private javax.swing.JLabel Burger1;
    private javax.swing.JLabel Burger2;
    private javax.swing.JLabel Burger3;
    private javax.swing.JLabel Burger4;
    private javax.swing.JLabel Drink1;
    private javax.swing.JLabel Drink2;
    private javax.swing.JLabel Drink3;
    private javax.swing.JLabel Drink4;
    private javax.swing.JButton Homebutton;
    private javax.swing.JLabel Sides1;
    private javax.swing.JLabel Sides2;
    private javax.swing.JLabel Sides3;
    private javax.swing.JLabel Sides4;
    private javax.swing.JPanel burgersTab;
    private javax.swing.JTextArea burgersText;
    private javax.swing.JPanel drinksTab;
    private javax.swing.JTextArea drinksText;
    private javax.swing.JTabbedPane itemsTab;
    private javax.swing.JPanel sidesTab;
    private javax.swing.JTextArea sidesText;
    private javax.swing.JLabel txtShadow1;
    private javax.swing.JLabel txtShadow2;
    private javax.swing.JLabel txtShadow3;
    // End of variables declaration//GEN-END:variables
}
