package com.linuxstudyclub.widget;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;


public class WidgetGUI extends javax.swing.JDialog 
{    
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width/2);
    int x;
    int y;
    JDialog home = this;
    public WidgetGUI(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocation(1366/2, HEIGHT);
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YouTube = new javax.swing.JLabel();
        Amazon = new javax.swing.JLabel();
        Twitter = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Widget");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        YouTube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/linuxstudyclub/widget/YouTube.png"))); // NOI18N
        YouTube.setAutoscrolls(true);
        YouTube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YouTube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YouTubeMouseClicked(evt);
            }
        });
        getContentPane().add(YouTube, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 13, 54, 54));

        Amazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/linuxstudyclub/widget/Amazon.png"))); // NOI18N
        Amazon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Amazon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmazonMouseClicked(evt);
            }
        });
        getContentPane().add(Amazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 13, 54, 54));

        Twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/linuxstudyclub/widget/Twitter.png"))); // NOI18N
        Twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwitterMouseClicked(evt);
            }
        });
        getContentPane().add(Twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 13, 54, 54));

        Facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/linuxstudyclub/widget/Facebook.png"))); // NOI18N
        Facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacebookMouseClicked(evt);
            }
        });
        getContentPane().add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 13, 54, 54));

        Background.setBackground(new java.awt.Color(22, 160, 133));
        Background.setOpaque(true);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 75));
        Background.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacebookMouseClicked
        // TODO add your handling code here:
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("/usr/bin/firefox -new-window www.facebook.com");
        } catch (IOException ex) {
            Logger.getLogger(WidgetGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FacebookMouseClicked

    private void TwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitterMouseClicked
        // TODO add your handling code here:
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("/usr/bin/firefox -new-window www.twitter.com");
        } catch (IOException ex) {
            Logger.getLogger(WidgetGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TwitterMouseClicked

    private void AmazonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmazonMouseClicked
        // TODO add your handling code here:
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("/usr/bin/firefox -new-window www.amazon.com");
        } catch (IOException ex) {
            Logger.getLogger(WidgetGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AmazonMouseClicked

    private void YouTubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YouTubeMouseClicked
        // TODO add your handling code here:
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("/usr/bin/firefox -new-window www.youtube.com");
        } catch (IOException ex) {
            Logger.getLogger(WidgetGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_YouTubeMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidgetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                WidgetGUI dialog = new WidgetGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amazon;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Facebook;
    private javax.swing.JLabel Twitter;
    private javax.swing.JLabel YouTube;
    // End of variables declaration//GEN-END:variables
}