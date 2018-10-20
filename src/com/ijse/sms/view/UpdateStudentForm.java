/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.view;

import com.ijse.sms.controller.RegSubjectController;
import com.ijse.sms.controller.RegistrationController;
import com.ijse.sms.controller.StudentController;
import com.ijse.sms.controller.SubjectController;
import com.ijse.sms.core.dto.RegSubjectDTO;
import com.ijse.sms.core.dto.RegistrationDTO;
import com.ijse.sms.core.dto.StudentDTO;
import com.ijse.sms.core.dto.SubjectDTO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chamini
 */
public class UpdateStudentForm extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStudent
     */
    String level="";
     public static ViewProfileForm viewProfileForm;
    public UpdateStudentForm(ViewProfileForm viewProfileForm) {
        initComponents();
         this.viewProfileForm = viewProfileForm;
        setLocationRelativeTo(null);
        loadAllSubjects();
        txtRegId.requestFocus();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRegId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtStuId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStuName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbSubName = new javax.swing.JComboBox();
        lblRGrade = new javax.swing.JLabel();
        cbRGrade = new javax.swing.JComboBox();
        lblLevel = new javax.swing.JLabel();
        rbPrimary = new javax.swing.JRadioButton();
        rbOrdinary = new javax.swing.JRadioButton();
        lblRGrade1 = new javax.swing.JLabel();
        cbRMedium = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel2.setText("Update Student Subjects");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 40, 360, 38);

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Reg Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 100, 90, 30);

        txtRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtRegId);
        txtRegId.setBounds(480, 100, 170, 30);

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Student Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 150, 80, 19);

        txtStuId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStuIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtStuId);
        txtStuId.setBounds(140, 140, 120, 30);

        jLabel4.setBackground(new java.awt.Color(0, 51, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Student Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 140, 100, 30);
        jPanel1.add(txtStuName);
        txtStuName.setBounds(370, 140, 280, 30);

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Subjects");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 190, 70, 30);

        cmbSubName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(cmbSubName);
        cmbSubName.setBounds(140, 190, 240, 30);

        lblRGrade.setBackground(new java.awt.Color(0, 51, 102));
        lblRGrade.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblRGrade.setText("Grade");
        jPanel1.add(lblRGrade);
        lblRGrade.setBounds(410, 190, 50, 30);

        cbRGrade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbRGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05", "Grade 06", "Grade 07", "Grade 08", "Grade 09", "Grade 10", "Grade 11" }));
        cbRGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRGradeActionPerformed(evt);
            }
        });
        jPanel1.add(cbRGrade);
        cbRGrade.setBounds(520, 190, 130, 30);

        lblLevel.setBackground(new java.awt.Color(0, 51, 102));
        lblLevel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblLevel.setText("Level");
        jPanel1.add(lblLevel);
        lblLevel.setBounds(50, 240, 70, 19);

        rbPrimary.setBackground(new java.awt.Color(0, 106, 117));
        buttonGroup1.add(rbPrimary);
        rbPrimary.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        rbPrimary.setText("Primay Level");
        rbPrimary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrimaryActionPerformed(evt);
            }
        });
        jPanel1.add(rbPrimary);
        rbPrimary.setBounds(140, 240, 120, 27);

        rbOrdinary.setBackground(new java.awt.Color(0, 106, 117));
        buttonGroup1.add(rbOrdinary);
        rbOrdinary.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        rbOrdinary.setText("Ordinary Level");
        rbOrdinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOrdinaryActionPerformed(evt);
            }
        });
        jPanel1.add(rbOrdinary);
        rbOrdinary.setBounds(280, 240, 127, 27);

        lblRGrade1.setBackground(new java.awt.Color(0, 51, 102));
        lblRGrade1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblRGrade1.setText("Medium");
        jPanel1.add(lblRGrade1);
        lblRGrade1.setBounds(420, 237, 80, 30);

        cbRMedium.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbRMedium.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sinhala ", "English" }));
        cbRMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRMediumActionPerformed(evt);
            }
        });
        jPanel1.add(cbRMedium);
        cbRMedium.setBounds(522, 233, 130, 30);

        tblStudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Name", "Grade", "Level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblStudent);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 300, 600, 170);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 480, 90, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(560, 480, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegIdActionPerformed
        try {
            // TODO add your handling code here:
            String rid = txtRegId.getText();

            RegistrationDTO search = RegistrationController.search(new RegistrationDTO(rid));
            StudentDTO searchStudent = new StudentDTO();
            searchStudent.setId(search.getStuid());
            StudentDTO searchStudent1 = StudentController.searchStudent(searchStudent);
            txtStuId.setText(search.getStuid());
            txtStuName.setText(searchStudent1.getName());

        } catch (Exception ex) {
            Logger.getLogger(UpdateStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtRegIdActionPerformed

    private void txtStuIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStuIdActionPerformed
        // TODO add your handling code here:
        txtStuName.requestFocus();
    }//GEN-LAST:event_txtStuIdActionPerformed

    private void cbRGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRGradeActionPerformed

    private void rbPrimaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrimaryActionPerformed
        // TODO add your handling code here:
        String sName = cmbSubName.getSelectedItem().toString();
        String grade = cbRGrade.getSelectedItem().toString();
        if (rbPrimary.isSelected()) {
            level = rbPrimary.getText();
        } else {
            level = rbOrdinary.getText();
        }
        Object[] loadSub = {sName, grade, level};
        DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
        dtm.addRow(loadSub);
    }//GEN-LAST:event_rbPrimaryActionPerformed

    private void rbOrdinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOrdinaryActionPerformed
        // TODO add your handling code here:
        String sName = cmbSubName.getSelectedItem().toString();
        String grade = cbRGrade.getSelectedItem().toString();
        if (rbPrimary.isSelected()) {
            level = rbPrimary.getText();
        } else {
            level = rbOrdinary.getText();
        }
        Object[] loadSub = {sName, grade, level};
        DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
        dtm.addRow(loadSub);
    }//GEN-LAST:event_rbOrdinaryActionPerformed

    private void cbRMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRMediumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String rid = txtRegId.getText();
            String subName = cmbSubName.getSelectedItem().toString();
            String subId="";
            ArrayList<SubjectDTO>allId=SubjectController.getAllId();
            for (SubjectDTO allId1 : allId) {
                if(allId1.getSubName().equals(subName)){
                    subId=allId1.getSubId();
                }
            }
            String level="";
            if(rbOrdinary.isSelected()){
                level=rbOrdinary.getText();
            }else{
                level=rbPrimary.getText();
            }
            String medium = cbRMedium.getSelectedItem().toString();
            RegSubjectDTO regSub=new RegSubjectDTO(rid, subId, level, medium);
            boolean add = RegSubjectController.add(regSub);
            if(add){
                JOptionPane.showMessageDialog(this,"Update Successfull.");
                // addProfileTable();
                viewProfileForm.FillTable(rid);
            }else{
                JOptionPane.showMessageDialog(this, "Update Failed.");
            }
        } catch (Exception ex) {
            Logger.getLogger(UpdateStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbRGrade;
    private javax.swing.JComboBox cbRMedium;
    private javax.swing.JComboBox cmbSubName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblRGrade;
    private javax.swing.JLabel lblRGrade1;
    private javax.swing.JRadioButton rbOrdinary;
    private javax.swing.JRadioButton rbPrimary;
    public javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtRegId;
    private javax.swing.JTextField txtStuId;
    private javax.swing.JTextField txtStuName;
    // End of variables declaration//GEN-END:variables

    private void loadAllSubjects() {
        try {
            ArrayList<SubjectDTO> SubID = SubjectController.getAllId();
            cmbSubName.removeAllItems();
            if (SubID == null) {
                return;
            }
            for (SubjectDTO SubIDs : SubID) {
                cmbSubName.addItem(SubIDs.getSubName());
            }
        } catch (Exception ex) {
            Logger.getLogger(UpdateStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}