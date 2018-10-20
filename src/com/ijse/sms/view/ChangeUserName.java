/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.view;

import com.ijse.sms.controller.LoginController;
import com.ijse.sms.core.dto.LoginDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamini
 */
public class ChangeUserName extends javax.swing.JPanel {

    /**
     * Creates new form ChangeUserName
     */
    public ChangeUserName() {
        initComponents();
        txtCurentUserName.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCurentUserName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pswPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtNewUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtReEnter = new javax.swing.JTextField();
        btnChangeUN = new javax.swing.JButton();

        setBackground(new java.awt.Color(40, 52, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change User Name");

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current UserName");

        txtCurentUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurentUserNameActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        pswPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswPassActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New UserName");

        txtNewUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewUserNameActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Re-Enter UserName");

        txtReEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReEnterActionPerformed(evt);
            }
        });

        btnChangeUN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChangeUN.setText("Change UserName");
        btnChangeUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeUNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnChangeUN)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(txtCurentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(txtNewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(37, 37, 37)
                            .addComponent(txtReEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnChangeUN)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurentUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurentUserNameActionPerformed
        // TODO add your handling code here:
        pswPass.requestFocus();
    }//GEN-LAST:event_txtCurentUserNameActionPerformed

    private void pswPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswPassActionPerformed
        // TODO add your handling code here:
        txtNewUserName.requestFocus();
    }//GEN-LAST:event_pswPassActionPerformed

    private void txtNewUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewUserNameActionPerformed
        // TODO add your handling code here:
        txtReEnter.requestFocus();
    }//GEN-LAST:event_txtNewUserNameActionPerformed

    private void txtReEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReEnterActionPerformed
        // TODO add your handling code here:
        btnChangeUN.doClick();
    }//GEN-LAST:event_txtReEnterActionPerformed

    private void btnChangeUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeUNActionPerformed
        // TODO add your handling code here:
        try {
            String cName = txtCurentUserName.getText();
            String nName = txtNewUserName.getText();
            String rName = txtReEnter.getText();
            String pass = pswPass.getText();
            if (!cName.equals(nName)) {
                System.out.println("kjbdfkjsdhbfdfhbgjkuf");
                if (nName.equals(rName)) {
                    System.out.println("654165106541651654");

                    LoginDTO log = new LoginDTO(cName+"-"+rName,pass);
                    boolean update = LoginController.update(log);
                    if (update) {
                        JOptionPane.showMessageDialog(this, "userName Changed.");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please Enter new UserName");
            }
        } catch (Exception ex) {
            Logger.getLogger(ChangeUserName.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnChangeUNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeUN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pswPass;
    private javax.swing.JTextField txtCurentUserName;
    private javax.swing.JTextField txtNewUserName;
    private javax.swing.JTextField txtReEnter;
    // End of variables declaration//GEN-END:variables
}
