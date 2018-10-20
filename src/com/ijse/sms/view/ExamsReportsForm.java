/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.sms.view;

import com.ijse.sms.controller.ExamsController;
import static com.ijse.sms.controller.ExamsController.getAllExams;
import com.ijse.sms.controller.RegistrationController;
import com.ijse.sms.controller.StudentController;
import com.ijse.sms.controller.SubjectController;
import com.ijse.sms.core.dto.ExamsDTO;
import com.ijse.sms.core.dto.RegistrationDTO;
import com.ijse.sms.core.dto.StudentDTO;
import com.ijse.sms.core.dto.SubjectDTO;
import com.ijse.sms.dao.db.DBConnection;
import java.awt.Dialog;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lk.ijse.jasper.IJSEJasperViewer;
import lk.ijse.jasper.JasperUtil;
import lk.ijse.jasper.Report;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;

/**
 *
 * @author Chamini
 */
@Report("com.ijse.sms.reports")
public class ExamsReportsForm extends javax.swing.JFrame {

    /**
     * Creates new form ExamsReportsForm
     */
    String subName;

    public ExamsReportsForm() {
        initComponents();
        setLocationRelativeTo(null);
        jpDate.setEnabled(false);
        cmbSubjects.setEnabled(false);
        cmboGrade.setEnabled(false);
        btnAllExams.setEnabled(false);
        LoadSubjects();
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
        jLabel2 = new javax.swing.JLabel();
        txtrid = new javax.swing.JTextField();
        txtstuName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExam = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAllExams = new javax.swing.JButton();
        jpDate = new org.jdesktop.swingx.JXDatePicker();
        lblAllExams = new javax.swing.JLabel();
        cmbSubjects = new javax.swing.JComboBox();
        cmboGrade = new javax.swing.JComboBox();
        hh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registration Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 110, 30);

        txtrid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtridActionPerformed(evt);
            }
        });
        jPanel1.add(txtrid);
        txtrid.setBounds(140, 80, 160, 30);

        txtstuName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtstuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstuNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtstuName);
        txtstuName.setBounds(310, 80, 290, 30);

        tblExam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration Id", "Exam Id", "Exam Name", "Marks", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExam);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 600, 290);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 420, 90, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 420, 90, 30);

        btnAllExams.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAllExams.setText("All Exams");
        btnAllExams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllExamsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllExams);
        btnAllExams.setBounds(760, 340, 130, 30);
        jPanel1.add(jpDate);
        jpDate.setBounds(630, 210, 250, 30);

        lblAllExams.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblAllExams.setText("All Exams");
        lblAllExams.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAllExams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAllExamsMouseClicked(evt);
            }
        });
        jPanel1.add(lblAllExams);
        lblAllExams.setBounds(720, 150, 110, 30);

        cmbSubjects.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(cmbSubjects);
        cmbSubjects.setBounds(630, 250, 250, 30);

        cmboGrade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmboGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grade 01", "Grade 02", "Grade 03", "Grade 04", "Grade 05", "Grade 06", "Grade 07", "Grade 08", "Grade 09", "Grade 10", "Grade 11" }));
        jPanel1.add(cmboGrade);
        cmboGrade.setBounds(630, 290, 190, 30);

        hh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(hh);
        hh.setBounds(620, 130, 290, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 930, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtridActionPerformed
        try {
            // TODO add your handling code here:
            String rid = txtrid.getText();

            RegistrationDTO search = RegistrationController.search(new RegistrationDTO(rid));
            StudentDTO searchStudent = new StudentDTO();
            searchStudent.setId(search.getStuid());
            StudentDTO searchStudent1 = StudentController.searchStudent(searchStudent);
            txtstuName.setText(searchStudent1.getName());
            getAllExamsForEach();
        } catch (Exception ex) {
            Logger.getLogger(ExamsReportsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtridActionPerformed

    private void txtstuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstuNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstuNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtrid.getText() != null) {
            JasperUtil.init(ExamsReportsForm.class);
            JasperReportsContext ctx = JasperUtil.getReportContext();

            try {
                JasperReport compiledReport = JasperUtil.getCompiledReport("Exams.jrxml");
                JasperFillManager fillManager = JasperFillManager.getInstance(ctx);
                HashMap<String, Object> reportParams = new HashMap<>();
//            TableModel tblmodel = tblExam.getModel();
                reportParams.put("Reg_Id", txtrid.getText());
                Connection connection = DBConnection.geBConnection().getConnection();
                JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, connection);

                IJSEJasperViewer frmJSEJasperViewer = new IJSEJasperViewer(filledReport);
                frmJSEJasperViewer.setTitle("Exams Details");
                frmJSEJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
                frmJSEJasperViewer.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(ViewProfileForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JasperUtil.init(ExamsReportsForm.class);
            JasperReportsContext ctx = JasperUtil.getReportContext();
            try {
                JasperReport compiledReport = JasperUtil.getCompiledReport("All_Exams.jrxml");
                JasperFillManager fillManager = JasperFillManager.getInstance(ctx);
                HashMap<String, Object> reportParams = new HashMap<>();
//            TableModel tblmodel = tblExam.getModel();
                reportParams.put("Exam_Date", jpDate.getDate());
                reportParams.put("Sub_Name", cmbSubjects.getSelectedItem().toString());
                reportParams.put("Grade", cmboGrade.getSelectedItem().toString());
                Connection connection = DBConnection.geBConnection().getConnection();
                JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, connection);

                IJSEJasperViewer frmJSEJasperViewer = new IJSEJasperViewer(filledReport);
                frmJSEJasperViewer.setTitle("Exams Details");
                frmJSEJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
                frmJSEJasperViewer.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(ViewProfileForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAllExamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllExamsActionPerformed
        // TODO add your handling code here:
        Date date = jpDate.getDate();
        String sub = cmbSubjects.getSelectedItem().toString();
        String grade = cmboGrade.getSelectedItem().toString();
        if (date != null && sub != null && grade != null) {
            try {
                ArrayList<SubjectDTO> allId = SubjectController.getAllId();
                for (SubjectDTO allSub1 : allId) {
                    if (allSub1.getSubName().equals(sub)) {
                        subName = allSub1.getSubId();
                    }
                }
                getAllExamdetails();
            } catch (Exception ex) {
                Logger.getLogger(ExamsReportsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAllExamsActionPerformed

    private void lblAllExamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAllExamsMouseClicked
        // TODO add your handling code here:
        jpDate.setEnabled(true);
        cmbSubjects.setEnabled(true);
        cmboGrade.setEnabled(true);
        btnAllExams.setEnabled(true);
    }//GEN-LAST:event_lblAllExamsMouseClicked

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
            java.util.logging.Logger.getLogger(ExamsReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamsReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamsReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamsReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamsReportsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllExams;
    private javax.swing.JComboBox cmbSubjects;
    private javax.swing.JComboBox cmboGrade;
    private javax.swing.JLabel hh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jpDate;
    private javax.swing.JLabel lblAllExams;
    private javax.swing.JTable tblExam;
    private javax.swing.JTextField txtrid;
    private javax.swing.JTextField txtstuName;
    // End of variables declaration//GEN-END:variables

    private void getAllExamsForEach() {
        try {
            ArrayList<ExamsDTO> searchExam = ExamsController.getEachExams(txtrid.getText());
            DefaultTableModel dtm = (DefaultTableModel) tblExam.getModel();
            dtm.setRowCount(0);

            if (searchExam != null) {
                for (ExamsDTO searchExams1 : searchExam) {
                    dtm.addRow(new Object[]{searchExams1.getRegId(), searchExams1.getExamId(), searchExams1.getExamName(), searchExams1.getExamMark(), searchExams1.getExamDate()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "There is no Exams such that Student..!!");
            }
        } catch (Exception ex) {
            Logger.getLogger(ExamsReportsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getAllExamdetails() {
        try {
            ArrayList<ExamsDTO> allExams = ExamsController.getAllExams();
            DefaultTableModel dtm = (DefaultTableModel) tblExam.getModel();
            dtm.setRowCount(0);
            if (allExams != null) {
                for (ExamsDTO allExams1 : allExams) {
                    dtm.addRow(new Object[]{allExams1.getRegId(), allExams1.getExamId(), allExams1.getExamName(), allExams1.getExamMark(), allExams1.getExamDate()});
                }
            } else {
                JOptionPane.showMessageDialog(null, "There is no Exams such that Student..!!");
            }
        } catch (Exception ex) {
            Logger.getLogger(ExamsReportsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LoadSubjects() {
        try {
            ArrayList<SubjectDTO> all = SubjectController.getAllId();
            cmbSubjects.removeAllItems();
            if (all == null) {
                return;
            }
            for (SubjectDTO all1 : all) {
                cmbSubjects.addItem(all1.getSubName());
            }
        } catch (Exception ex) {
            Logger.getLogger(ExamsReportsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}