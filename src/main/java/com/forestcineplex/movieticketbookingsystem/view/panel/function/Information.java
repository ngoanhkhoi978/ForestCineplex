/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.forestcineplex.movieticketbookingsystem.view.panel.function;

import com.forestcineplex.movieticketbookingsystem.data.DataConnection;
import com.forestcineplex.movieticketbookingsystem.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Information extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    
    private User user;

    public void setUser(User user) {
        this.user = user;
    }
    
    public void loadUser() {
        String username = user.getUser();
        String sqlQuery = "SELECT * FROM user WHERE User = ?";
        
        try (ResultSet resultSet = DataConnection.executeQuery(sqlQuery, username)) {
            if (resultSet != null && resultSet.next()) {
                String user1 = resultSet.getString("User");
                String passwordHash1 = resultSet.getString("PasswordHash");
                String role = resultSet.getString("Role");
                String fullName = resultSet.getString("FullName");
                String gender = resultSet.getString("Gender");
                Date birthDate = resultSet.getDate("BirthDate");
                String address = resultSet.getString("Address");
                String phone = resultSet.getString("Phone");
                String mail = resultSet.getString("Mail");
                double salary = resultSet.getDouble("Salary");
                this.user = new User(user1,passwordHash1,role,fullName,gender,salary,address,phone,mail,birthDate);
            } 
        } catch (SQLException e) {
            e.printStackTrace(); // Hoặc log lỗi
        }
    }
    
    public void loadInfo() {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        jLabelUser.setText(user.getUser());
        jLabelFullName.setText(user.getFullname());
        jLabelGender.setText(user.getGender());
        jLabelBirthDate.setText(dateFormat.format(user.getBirthDate()));
        jLabelPhone.setText(user.getPhone());
        jLabelMail.setText(user.getMail());
        jLabelAddress.setText(user.getAddress());
        
    }
    

    public Information(User user) {
        setUser(user);
        initComponents();  
        loadInfo();
    }
    public Information() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelFullName = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelBirthDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(650, 650));
        setPreferredSize(new java.awt.Dimension(970, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Birth Date:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("User:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabelMail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelMail.setText("aaa");
        jPanel2.add(jLabelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Gender:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Mail:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Address:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Phone:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Full Name:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabelFullName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelFullName.setText("aaa");
        jPanel2.add(jLabelFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelUser.setText("aaa");
        jPanel2.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabelAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelAddress.setText("aaa");
        jLabelAddress.setToolTipText("");
        jPanel2.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabelPhone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelPhone.setText("aaa");
        jPanel2.add(jLabelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabelGender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelGender.setText("aaa");
        jPanel2.add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabelBirthDate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelBirthDate.setText("aaa");
        jPanel2.add(jLabelBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("INFORMATION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 830, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}