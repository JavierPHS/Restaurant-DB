package Restaurant_System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xanakran
 */
public class Customer_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Menu
     */
    public Customer_Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Customer_Menu(String user, String name) {
        initComponents();
        this.setLocationRelativeTo(null);
        String[] cname = name.split(" ");
        Welcome.setText("Welcome " + cname[0] + "!");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        Order_History = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        Banner = new javax.swing.JLabel();
        BannerColor = new javax.swing.JLabel();
        BottomText = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("Welcome,");
        getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 70, 320, 104));

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 129, 54));

        Order_History.setText("Order_History");
        Order_History.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Order_History, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 330, 70));

        OrderButton.setText("Order");
        OrderButton.setBorder(new javax.swing.border.MatteBorder(null));
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 330, 70));

        MenuButton.setText("Menu");
        MenuButton.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(MenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 330, 70));

        Banner.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Banner.png"))); // NOI18N
        Banner.setText("Johnny's Burgers");
        getContentPane().add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 480, -1));

        BannerColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Color.png"))); // NOI18N
        BannerColor.setText("jLabel1");
        BannerColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BannerColor.setOpaque(true);
        getContentPane().add(BannerColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        BottomText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Bottom_text.png"))); // NOI18N
        BottomText.setText("jLabel2");
        getContentPane().add(BottomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 990, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background1..png"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Banner;
    private javax.swing.JLabel BannerColor;
    private javax.swing.JLabel BottomText;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton OrderButton;
    private javax.swing.JButton Order_History;
    private javax.swing.JLabel Welcome;
    // End of variables declaration//GEN-END:variables
}
