/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.forestcineplex.movieticketbookingsystem.view.panel;

import com.forestcineplex.movieticketbookingsystem.view.frame.LobbySystem;

/**
 *
 * @author LENOVO
 */
public class RegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    
    private boolean buttonVisible = false;
    private boolean buttonVisible1 = false;
    private LobbySystem lobbySystem;
    
    public RegisterPanel() {
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

        jLabelUser = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelVisible = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsers = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelAcc = new javax.swing.JLabel();
        jLabelPassword1 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabelVisible1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelFullName = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelShape = new javax.swing.JLabel();
        javax.swing.JLabel jLabelBackground = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User.png"))); // NOI18N
        add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 35, -1, -1));

        jTextFieldUser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 300, 35));

        jLabelVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisibleOff.png"))); // NOI18N
        jLabelVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVisibleMouseClicked(evt);
            }
        });
        add(jLabelVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 40, 40));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPasswordField1.setActionCommand("<Not Set>");
        jPasswordField1.setAlignmentX(0.4F);
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 300, 35));

        jLabelPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(0, 102, 51));
        jLabelPassword.setText("Password");
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabelUsers.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelUsers.setForeground(new java.awt.Color(0, 102, 51));
        jLabelUsers.setText("Username");
        add(jLabelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        jLabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Register.png"))); // NOI18N
        add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        jLabelAcc.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAcc.setForeground(new java.awt.Color(51, 51, 255));
        jLabelAcc.setText("<html><u>I have an account</u></html>"); // NOI18N
        jLabelAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAccMouseClicked(evt);
            }
        });
        add(jLabelAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, -1, -1));

        jLabelPassword1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPassword1.setForeground(new java.awt.Color(0, 102, 51));
        jLabelPassword1.setText("Confirm Password");
        add(jLabelPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPasswordField2.setActionCommand("<Not Set>");
        jPasswordField2.setAlignmentX(0.4F);
        add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 300, 35));

        jLabelVisible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisibleOff.png"))); // NOI18N
        jLabelVisible1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVisible1MouseClicked(evt);
            }
        });
        add(jLabelVisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 40, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 390, 20));

        jLabelFullName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(0, 102, 51));
        jLabelFullName.setText("Full Name");
        add(jLabelFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabelPhone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPhone.setForeground(new java.awt.Color(0, 102, 51));
        jLabelPhone.setText("Phone");
        add(jLabelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabelGender.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(0, 102, 51));
        jLabelGender.setText("Gender");
        add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 335, -1, -1));

        jTextFieldFullName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(jTextFieldFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 300, 35));

        jTextFieldPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 300, 35));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Another" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 190, 30));

        jLabelShape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shape2.png"))); // NOI18N
        add(jLabelShape, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 430, 780));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVisibleMouseClicked
        if (buttonVisible == false) {
            buttonVisible = true;
            jPasswordField1.setEchoChar((char)0);
            jLabelVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisibleOn.png")));
        } else {
            buttonVisible = false;
            jPasswordField1.setEchoChar('\u2022');
            jLabelVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisibleOff.png")));
        }
    }//GEN-LAST:event_jLabelVisibleMouseClicked

    private void jLabelVisible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVisible1MouseClicked
        if (buttonVisible1 == false) {
            buttonVisible1 = true;
            jPasswordField2.setEchoChar((char)0);
            jLabelVisible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisibleOn.png")));
        } else {
            buttonVisible1 = false;
            jPasswordField2.setEchoChar('\u2022');
            jLabelVisible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisibleOff.png")));
        }
    }//GEN-LAST:event_jLabelVisible1MouseClicked

    private void jLabelAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccMouseClicked

    }//GEN-LAST:event_jLabelAccMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelAcc;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelShape;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsers;
    private javax.swing.JLabel jLabelVisible;
    private javax.swing.JLabel jLabelVisible1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
