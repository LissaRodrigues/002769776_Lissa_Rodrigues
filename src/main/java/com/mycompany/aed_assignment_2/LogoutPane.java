/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.aed_assignment_2;

import java.util.ArrayList;
import javax.swing.JSplitPane;
import model.MainHistory;
import model.MainModel;

/**
 *
 * @author Lissa
 */
public class LogoutPane extends javax.swing.JPanel {
    MainHistory history;
    JSplitPane jSplitPane2;
    int cityArraySize;
    
    /**
     * Creates new form LogoutPane
     */
    public LogoutPane(MainHistory history, JSplitPane jSplitPane1,int cityArraySize) {
        initComponents();
        this.history = history;
        this.jSplitPane2 = jSplitPane1;
        this.cityArraySize = cityArraySize;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("BM Yeonsung", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("HOSPITAL MANAGEMENT SYSTEM");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        ArrayList<MainModel> mainM = history.getHistory();
        for(int i =0;i<mainM.size();i++){
            if(mainM.get(i).getSessionName()!=null){
                String SessionName = null;
                String SessionId = null;
                String SessionPass = null;
                String SessionRole = null;
                
                mainM.get(i).setSessionName(SessionName);
                mainM.get(i).setSessionId(SessionId);
                mainM.get(i).setSessionPass(SessionPass);
                mainM.get(i).setSessionRole(SessionRole);
                LoginPane obj = new LoginPane(history,jSplitPane2,cityArraySize);
                jSplitPane2.setLeftComponent(obj);
                WelcomePage obj1 = new WelcomePage(history,jSplitPane2,cityArraySize);
                jSplitPane2.setRightComponent(obj1);
            
                break;
            }
            
        }
        
//        if(Flag == 0){
//            System.out.println("USER DOESN'T EXIST");
//        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
