/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.view;
import java.awt.Color;
/**
 *
 * @author Chamini
 */
public class SettingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form SettingsPanel
     */
    public SettingsPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        btnUserName = new javax.swing.JButton();
        btnPassword = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        btnUserName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUserName.setText("Change UserName");
        btnUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(btnUserName);
        btnUserName.setBounds(30, 40, 160, 30);

        btnPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPassword.setText("Change Password");
        btnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(btnPassword);
        btnPassword.setBounds(30, 80, 160, 30);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );

        jPanel1.add(bodyPanel);
        bodyPanel.setBounds(240, 30, 481, 334);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserNameActionPerformed
        // TODO add your handling code here:
        bodyPanel.removeAll();
        ChangeUserName p = new ChangeUserName();
        p.setSize(bodyPanel.getSize());
        bodyPanel.add(p);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }//GEN-LAST:event_btnUserNameActionPerformed

    private void btnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasswordActionPerformed
        // TODO add your handling code here:
        bodyPanel.removeAll();
        ChangePassword p=new ChangePassword();
        p.setSize(bodyPanel.getSize());
        bodyPanel.add(p);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }//GEN-LAST:event_btnPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnPassword;
    private javax.swing.JButton btnUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
