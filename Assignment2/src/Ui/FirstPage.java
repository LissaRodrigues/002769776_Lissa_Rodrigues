/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ui;

import JavaMainModel.PatientDirectory;
import JavaMainModel.PersonDirectory;

/**
 *
 * @author girish
 */
public class FirstPage extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    PersonDirectory persons;
    PatientDirectory patientDirectory;
    //ImageIcon medical = new ImageIcon("Backgroud.jfif");
    public FirstPage() {
        initComponents();
        persons = new PersonDirectory();
        patientDirectory=new PatientDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanelBtns = new javax.swing.JPanel();
        btnCreateAppointment = new javax.swing.JButton();
        btnRegisterPtn = new javax.swing.JButton();
        btnViewApt = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAbnormalPtn = new javax.swing.JButton();
        btnAptHist = new javax.swing.JButton();
        btnViewAllPtn = new javax.swing.JButton();
        jPanelMainWin = new javax.swing.JPanel();
        lblMainWindow = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setBackground(new java.awt.Color(180, 207, 234));

        jPanelBtns.setBackground(new java.awt.Color(180, 207, 234));
        jPanelBtns.setForeground(new java.awt.Color(180, 207, 234));
        jPanelBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreateAppointment.setBackground(new java.awt.Color(17, 12, 102));
        btnCreateAppointment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCreateAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });
        jPanelBtns.add(btnCreateAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 207, -1));

        btnRegisterPtn.setBackground(new java.awt.Color(117, 12, 102));
        btnRegisterPtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegisterPtn.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterPtn.setText("Register New Patient");
        btnRegisterPtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPtnActionPerformed(evt);
            }
        });
        jPanelBtns.add(btnRegisterPtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, 207, -1));

        btnViewApt.setBackground(new java.awt.Color(17, 12, 102));
        btnViewApt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnViewApt.setForeground(new java.awt.Color(255, 255, 255));
        btnViewApt.setText("View All Appointments");
        btnViewApt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAptActionPerformed(evt);
            }
        });
        jPanelBtns.add(btnViewApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 324, 207, -1));

        btnUpdate.setBackground(new java.awt.Color(17, 12, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Patient Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanelBtns.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 397, 207, -1));

        btnAbnormalPtn.setBackground(new java.awt.Color(17, 12, 102));
        btnAbnormalPtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAbnormalPtn.setForeground(new java.awt.Color(255, 255, 255));
        btnAbnormalPtn.setText("Patients with Abnormal Vitals");
        btnAbnormalPtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbnormalPtnActionPerformed(evt);
            }
        });
        jPanelBtns.add(btnAbnormalPtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 534, -1, -1));

        btnAptHist.setBackground(new java.awt.Color(17, 12, 102));
        btnAptHist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAptHist.setForeground(new java.awt.Color(255, 255, 255));
        btnAptHist.setText("View Appointment History");
        btnAptHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAptHistActionPerformed(evt);
            }
        });
        jPanelBtns.add(btnAptHist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 468, 207, -1));

        btnViewAllPtn.setBackground(new java.awt.Color(17, 12, 102));
        btnViewAllPtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnViewAllPtn.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAllPtn.setText("View All Patients");
        btnViewAllPtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllPtnActionPerformed(evt);
            }
        });
        jPanelBtns.add(btnViewAllPtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 207, -1));

        jSplitPane.setLeftComponent(jPanelBtns);

        jPanelMainWin.setBackground(new java.awt.Color(180, 207, 234));
        jPanelMainWin.setForeground(new java.awt.Color(180, 207, 234));
        jPanelMainWin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMainWindow.setBackground(new java.awt.Color(111, 141, 172));
        lblMainWindow.setForeground(new java.awt.Color(111, 141, 172));
        lblMainWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainWindow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMainWindow.setOpaque(true);
        jPanelMainWin.add(lblMainWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 98, 573, 494));

        lblWelcome.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(17, 12, 102));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Hospital Management System");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelMainWin.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 12, 573, 80));

        jSplitPane.setRightComponent(jPanelMainWin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterPtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPtnActionPerformed
        RegisterNewPtn registartionNewPtn=new RegisterNewPtn(persons);
        jSplitPane.setRightComponent(registartionNewPtn);
    }//GEN-LAST:event_btnRegisterPtnActionPerformed

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        // TODO add your handling code here:
        CreateAppointment createAppointment = new CreateAppointment(persons, patientDirectory);
        jSplitPane.setRightComponent(createAppointment);
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void btnViewAptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAptActionPerformed
        // TODO add your handling code here:
        ViewAllAppointments viewAllAppointments=new ViewAllAppointments(patientDirectory,persons);
        jSplitPane.setRightComponent(viewAllAppointments);
    }//GEN-LAST:event_btnViewAptActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        UpdatePatientInfo updatePatientInfo=new UpdatePatientInfo(patientDirectory,persons);
        jSplitPane.setRightComponent(updatePatientInfo);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAbnormalPtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbnormalPtnActionPerformed
        // TODO add your handling code here:
        SearchAbnormalPatient searchAbnormalPatient=new SearchAbnormalPatient(patientDirectory,persons);
        jSplitPane.setRightComponent(searchAbnormalPatient);
    }//GEN-LAST:event_btnAbnormalPtnActionPerformed

    private void btnAptHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAptHistActionPerformed
        // TODO add your handling code here:
        PatientPastEncounter patientPastEncounter=new PatientPastEncounter(patientDirectory,persons);
        jSplitPane.setRightComponent(patientPastEncounter);
    }//GEN-LAST:event_btnAptHistActionPerformed

    private void btnViewAllPtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllPtnActionPerformed
        // TODO add your handling code here:
        ShowAllPatient searchAllPatient=new ShowAllPatient(patientDirectory,persons);
        jSplitPane.setRightComponent(searchAllPatient);
    }//GEN-LAST:event_btnViewAllPtnActionPerformed

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
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FirstPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbnormalPtn;
    private javax.swing.JButton btnAptHist;
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnRegisterPtn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAllPtn;
    private javax.swing.JButton btnViewApt;
    private javax.swing.JPanel jPanelBtns;
    private javax.swing.JPanel jPanelMainWin;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblMainWindow;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
