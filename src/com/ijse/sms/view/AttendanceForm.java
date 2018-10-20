/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.view;

import com.ijse.sms.controller.AttendanceController;
import com.ijse.sms.controller.RegistrationController;
import com.ijse.sms.controller.StudentController;
import com.ijse.sms.core.dto.AttendanceDTO;
import com.ijse.sms.core.dto.RegistrationDTO;
import com.ijse.sms.core.dto.StudentDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chamini
 */
public class AttendanceForm extends javax.swing.JPanel {

    /**
     * Creates new form AttendanceForm
     */
    String rid="";
    String attendence="";
    public AttendanceForm() {
        initComponents();
        txtRegId.requestFocus();
        setDate();
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
        jLabel6 = new javax.swing.JLabel();
        txtRegId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chkPresent = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtStId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAttendance = new javax.swing.JTable();
        update = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel6.setText("Register Id");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 110, 100, 28);

        txtRegId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRegId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtRegId);
        txtRegId.setBounds(220, 110, 180, 28);

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel5.setText("Date");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(510, 90, 85, 28);

        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jPanel2.add(txtDate);
        txtDate.setBounds(630, 90, 188, 28);

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel3.setText("Attendance Mark");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 150, 130, 32);

        chkPresent.setBackground(new java.awt.Color(3, 102, 114));
        chkPresent.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        chkPresent.setText("Present");
        chkPresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPresentActionPerformed(evt);
            }
        });
        jPanel2.add(chkPresent);
        chkPresent.setBounds(220, 150, 90, 32);

        jLabel4.setBackground(new java.awt.Color(0, 51, 102));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel4.setText("Student Id");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(510, 130, 90, 28);

        txtStId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtStId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtStId);
        txtStId.setBounds(630, 130, 190, 28);

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel7.setText("Student Name");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(510, 170, 110, 28);

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(630, 170, 188, 28);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Present Date");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(100, 210, 100, 30);

        tblAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration Id", "Date", "Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAttendance);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(100, 250, 740, 210);

        update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(650, 470, 100, 40);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(780, 470, 95, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1190, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegIdActionPerformed

        try {
            rid = txtRegId.getText();

            RegistrationDTO search = RegistrationController.search(new RegistrationDTO(rid));
            StudentDTO searchStudent = new StudentDTO();
            searchStudent.setId(search.getStuid());
            StudentDTO searchStudent1 = StudentController.searchStudent(searchStudent);
            txtStId.setText(search.getStuid());
            txtName.setText(searchStudent1.getName());

            getAllAttendenceForEach();

        } catch (Exception ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtRegIdActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void chkPresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPresentActionPerformed
        try {
            // TODO add your handling code here:
            rid=txtRegId.getText();
           // String name = txtName.getText();
            String date = txtDate.getText();
            
            if (chkPresent.isSelected()) {
                attendence = chkPresent.getText();
                
            }
            
            AttendanceDTO newAttendence = new AttendanceDTO(rid, date, attendence);
            
            boolean addAttendance = AttendanceController.addAttendance(newAttendence);
            if (addAttendance) {
                getAllAttendenceForEach();

                JOptionPane.showMessageDialog(this, "Adedd Successfully.");
                chkPresent.setSelected(false);
            }
            
            txtRegId.setText("");
            txtStId.setText("");
            txtName.setText("");
        } catch (Exception ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_chkPresentActionPerformed

    private void txtStIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtStIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String datte = (String) tblAttendance.getValueAt(tblAttendance.getSelectedRow(), 1);
            String atten = (String) tblAttendance.getValueAt(tblAttendance.getSelectedRow(), 2);
            AttendanceDTO attendance = new AttendanceDTO(rid, datte, atten);
            boolean updateAttendance = AttendanceController.updateAttendance(attendance);
            if (updateAttendance) {
                getAllAttendenceForEach();
                JOptionPane.showMessageDialog(this, "Update Successfully.");
                
            } else {
                JOptionPane.showMessageDialog(this, "Update Failed.");
             
            }

        } catch (Exception ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String date = txtDate.getText();

            AttendanceDTO attendance = new AttendanceDTO(date, attendence);
            boolean deleteAttendance = AttendanceController.deleteAttendance(attendance);
            if (deleteAttendance) {
                getAllAttendenceForEach();
                JOptionPane.showMessageDialog(this, "Delete Successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Attendance hasn't been delete due to some errors.");
            }
        } catch (Exception ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JCheckBox chkPresent;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAttendance;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegId;
    private javax.swing.JTextField txtStId;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void getAllAttendenceForEach() throws Exception {
          DefaultTableModel dtm = (DefaultTableModel) tblAttendance.getModel();
        dtm.setRowCount(0);
        ArrayList<AttendanceDTO> searchAttendance = AttendanceController.getEachAttendence(rid);
        if (searchAttendance != null) {
            for (AttendanceDTO searchAttendance1 : searchAttendance) {
                dtm.addRow(new Object[]{searchAttendance1.getRegId(),searchAttendance1.getDate(), searchAttendance1.getMark()});
            }
        } else {
            JOptionPane.showMessageDialog(null, "There is no attendence such that Student..!!");
        }
    
    }
     private void setDate() {
        Date d1 = new Date();
        SimpleDateFormat fdate = new SimpleDateFormat("YYYY-MM-dd");
        String sd = fdate.format(d1);
        txtDate.setText(sd);
     }
}