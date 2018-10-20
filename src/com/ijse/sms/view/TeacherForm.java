/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.view;

import com.ijse.sms.common.IDGeneretor;
import com.ijse.sms.common.validation;
import com.ijse.sms.controller.ImageController;
import com.ijse.sms.controller.SubjectController;
import com.ijse.sms.controller.TeacherController;
import com.ijse.sms.controller.TeacherDetailController;
import com.ijse.sms.controller.TeacherTeacherDetailController;
import com.ijse.sms.core.dto.ImageDTO;
import com.ijse.sms.core.dto.SubjectDTO;
import com.ijse.sms.core.dto.TeacherDTO;
import com.ijse.sms.core.dto.TeacherDetailDTO;
import com.ijse.sms.core.dto.TeacherTeacherDetailDTO;
import java.awt.Frame;
import java.awt.Image;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Chamini
 */
public class TeacherForm extends javax.swing.JPanel {

    /**
     * Creates new form TeacherForm
     */
    String subName = "";
    DefaultTableModel dtm;
    DefaultTableModel dtm2;

    public TeacherForm() {
        initComponents();
        dtm = (DefaultTableModel) tblAllTeacher.getModel();
        dtm2 = (DefaultTableModel) tblTeacher.getModel();
        AutoGenarateID();
        LoadSubjectName();
        txtTName.requestFocus();
        getAllTeacher();

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
        jLabel3 = new javax.swing.JLabel();
        txtTName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbTeSubject = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllTeacher = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtTechrId = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtImgID = new javax.swing.JTextField();
        btnGetImage = new javax.swing.JButton();
        labelSaveImg = new javax.swing.JLabel();
        lblImagePath = new javax.swing.JLabel();
        btnSaveImage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeacher = new javax.swing.JTable();
        btnnew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbGrade = new javax.swing.JComboBox();
        btnDeleteRow = new javax.swing.JButton();
        lblNewTime = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 77, 50, 30);

        txtTName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtTName);
        txtTName.setBounds(140, 80, 240, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Teach Level");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 200, 90, 30);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox2.setMaximumRowCount(2);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ordinary Level", "Primary Level" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(140, 200, 120, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Subject");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 240, 60, 30);

        cmbTeSubject.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(cmbTeSubject);
        cmbTeSubject.setBounds(140, 240, 240, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Mobile No");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 280, 80, 30);

        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileKeyReleased(evt);
            }
        });
        jPanel1.add(txtMobile);
        txtMobile.setBounds(140, 280, 240, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(930, 550, 80, 30);

        tblAllTeacher.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblAllTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Name", "Sub_Id", "Subject", "Mobile No", "Grade", "Day0fMonth", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAllTeacher);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(560, 40, 620, 490);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Teacher Id");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 120, 80, 30);

        txtTechrId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtTechrId);
        txtTechrId.setBounds(140, 120, 120, 30);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(1023, 550, 110, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Image Id");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 160, 70, 30);
        jPanel1.add(txtImgID);
        txtImgID.setBounds(140, 160, 120, 30);

        btnGetImage.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnGetImage.setText("Get Image");
        btnGetImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetImageActionPerformed(evt);
            }
        });
        jPanel1.add(btnGetImage);
        btnGetImage.setBounds(270, 120, 110, 30);

        labelSaveImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(labelSaveImg);
        labelSaveImg.setBounds(390, 80, 160, 160);
        jPanel1.add(lblImagePath);
        lblImagePath.setBounds(390, 250, 170, 30);

        btnSaveImage.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnSaveImage.setText("Save ");
        btnSaveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveImageActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveImage);
        btnSaveImage.setBounds(440, 500, 100, 30);

        tblTeacher.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Grade", "DayOfMonth", "Time-Period"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTeacher);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 380, 400, 220);

        btnnew.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnnew.setText("New Time");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew);
        btnnew.setBounds(430, 410, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Select Grade");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 320, 80, 30);

        cmbGrade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05", "Grade 06", "Grade 07", "Grade 08", "Grade 09", "Grade 10", "Grade 11", " ", " " }));
        cmbGrade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGradeItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbGrade);
        cmbGrade.setBounds(140, 320, 140, 30);

        btnDeleteRow.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDeleteRow.setText("Delete Row");
        btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteRow);
        btnDeleteRow.setBounds(430, 450, 120, 30);

        lblNewTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jPanel1.add(lblNewTime);
        lblNewTime.setBounds(0, 0, 1300, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TeacherDetailsForm TF = new TeacherDetailsForm();
        TF.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGetImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            lblImagePath.setText(selectedFile.getAbsolutePath());

            ImageIcon image = new ImageIcon(selectedFile.getAbsolutePath());
            Image im = image.getImage();
            Image myImg = im.getScaledInstance(labelSaveImg.getWidth(), labelSaveImg.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImg);
            labelSaveImg.setIcon(newImage);

        }
    }//GEN-LAST:event_btnGetImageActionPerformed

    private void btnSaveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveImageActionPerformed

        try {
            String tId = txtTechrId.getText();
            String name = txtTName.getText();
            String subName = cmbTeSubject.getSelectedItem().toString();
            String mobile = txtMobile.getText();
            String subId = "";
            ArrayList<SubjectDTO> allSub = SubjectController.getAllId();
            for (SubjectDTO allSub1 : allSub) {
                if (allSub1.getSubName().equals(subName)) {
                    subId = allSub1.getSubId();
                }

            }//String teId, String sub_Id, String sub_Name, String teName, int teMobile
            TeacherDTO teacher = new TeacherDTO(tId, subId, subName, name, Integer.parseInt(mobile));

            String grade = "";
            String month = "";
            String time = "";
            ArrayList<TeacherDetailDTO> teacherDetail = new ArrayList<>();
            for (int i = 0; i < tblTeacher.getRowCount(); i++) {
                grade = (String) tblTeacher.getValueAt(i, 1);
                month = (String) tblTeacher.getValueAt(i, 2);
                time = (String) tblTeacher.getValueAt(i, 3);
                //  teacherDetail.add(new TeacherDetailDTO(tId,grade,month,time));
                TeacherDetailDTO teacherDetailDTO = new TeacherDetailDTO(tId, month, grade, time);
                teacherDetail.add(teacherDetailDTO);
              

            }
              ImageDTO image = new ImageDTO(txtImgID.getText(), lblImagePath.getText(), txtTechrId.getText());
            boolean addTeacherDetails = TeacherDetailController.addTeacherDetails(teacher, teacherDetail, image);
            if (addTeacherDetails) {
                getEachTeacher();
                JOptionPane.showMessageDialog(this, "Adedd Sucessfully..");
            } else {
                JOptionPane.showMessageDialog(this, "Adedd Failed..");
            }

        } catch (Exception ex) {
            Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        AutoGenarateID();
        txtMobile.setText("");
        txtTName.setText("");
        labelSaveImg.setIcon(null);
        lblImagePath.setText("");
        dtm2.setRowCount(0);

    }//GEN-LAST:event_btnSaveImageActionPerformed

    private void txtTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTNameActionPerformed

    private void txtMobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyReleased
        // TODO add your handling code here:
        validation.phoneNumber(txtMobile, evt);
    }//GEN-LAST:event_txtMobileKeyReleased

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        // TODO add your handling code here:
        btnnew.doClick();

        // btnSaveImage.doClick();
    }//GEN-LAST:event_txtMobileActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            int selectedRow = tblAllTeacher.getSelectedRow();
            String tid = dtm.getValueAt(selectedRow, 0).toString();
            TeacherDTO teacher = new TeacherDTO();
            ArrayList<TeacherDetailDTO> teacherDetail = new ArrayList<>();
            System.out.println(tid);
            teacher.setTeId(tid);
            boolean deleteTeacher = TeacherController.deleteTeacher(teacher);
           // boolean deleteTeacherDetail = TeacherDetailController.deleteTeacherDetail(teacher, teacherDetail);

            if (deleteTeacher) {
                getEachTeacher();
                JOptionPane.showMessageDialog(this, "Delete Successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Delete Failed.");
            }

        } catch (Exception ex) {
            Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        AutoGenarateID();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        String id = txtTechrId.getText();
        String grade = cmbGrade.getSelectedItem().toString();
        DefaultTableModel dtm = (DefaultTableModel) tblTeacher.getModel();

        Object[] all = {id,grade};
        dtm.addRow(all);
    }//GEN-LAST:event_btnnewActionPerformed

    private void cmbGradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGradeItemStateChanged
        // TODO add your handling code here:
        btnnew.requestFocus();
    }//GEN-LAST:event_cmbGradeItemStateChanged

    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        // TODO add your handling code here:          
                
             if (tblTeacher.getRowCount() > 0) {
            DefaultTableModel dtt = (DefaultTableModel) tblTeacher.getModel();
            int selectedRow = tblTeacher.getSelectedRow();
            System.out.println(selectedRow);
            dtt.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "There is no data in table.");
        }

    }//GEN-LAST:event_btnDeleteRowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JButton btnGetImage;
    private javax.swing.JButton btnSaveImage;
    private javax.swing.JButton btnnew;
    private javax.swing.JComboBox cmbGrade;
    private javax.swing.JComboBox cmbTeSubject;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelSaveImg;
    private javax.swing.JLabel lblImagePath;
    private javax.swing.JLabel lblNewTime;
    private javax.swing.JTable tblAllTeacher;
    private javax.swing.JTable tblTeacher;
    private javax.swing.JTextField txtImgID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtTName;
    private javax.swing.JTextField txtTechrId;
    // End of variables declaration//GEN-END:variables

    private void AutoGenarateID() {
        try {
            txtImgID.setText(IDGeneretor.getImageID("Image", "id", "I"));
            txtTechrId.setText(IDGeneretor.getTeacherID("Teacher", "Te_Id", "T"));
        } catch (SQLException ex) {
            Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LoadSubjectName() {
        try {
            ArrayList<SubjectDTO> allSub = SubjectController.getAllId();
            cmbTeSubject.removeAllItems();
            if (allSub == null) {
                return;
            }
            for (SubjectDTO allSub1 : allSub) {
                cmbTeSubject.addItem(allSub1.getSubName());
            }
        } catch (Exception ex) {
            Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getEachTeacher() {

        try {
           // ArrayList<TeacherTeacherDetailDTO> all = TeacherTeacherDetailController.getAllTeacherDetails(txtTechrId.getText());
 ArrayList<TeacherTeacherDetailDTO> all = TeacherTeacherDetailController.getAllTeacher();
            DefaultTableModel dtm = (DefaultTableModel) tblAllTeacher.getModel();
            dtm.setRowCount(0);
            if (all != null) {
                for (TeacherTeacherDetailDTO all1 : all) {
                    
                    System.out.println(all1);
                    dtm.addRow(new Object[]{all1.getTeId(),all1.getTeName(),all1.getSub_Id(),all1.getSub_Name(),all1.getTeMobile(),all1.getGrade(),all1.getDayOfMonth(),all1.getTime()});
                }

            } else {
                JOptionPane.showMessageDialog(this, "There are no Teacher such that TeacherId.");

            }
        } catch (Exception ex) {
            Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void getAllTeacher() {

        try {
            ArrayList<TeacherTeacherDetailDTO> all = TeacherTeacherDetailController.getAllTeacher();
//            System.out.println(all.size());
            DefaultTableModel dtm = (DefaultTableModel) tblAllTeacher.getModel();
            dtm.setRowCount(0);
            if (all != null) {
                for (TeacherTeacherDetailDTO all1 : all) {
                    dtm.addRow(new Object[]{all1.getTeId(),all1.getTeName(),all1.getSub_Id(),all1.getSub_Name(),all1.getTeMobile(),all1.getGrade(),all1.getDayOfMonth(),all1.getTime()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "There are no Teacher such that TeacherId.");

            }
        } catch (Exception ex) {
            Logger.getLogger(TeacherForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}