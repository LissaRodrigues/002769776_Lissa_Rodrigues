/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.aed_assignment_2;

import java.awt.Component;
import java.awt.Container;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JComponent;
import model.MainHistory;
import model.MainModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author Lissa
 */
public class SignupPane extends javax.swing.JPanel {
    MainHistory history;
    JSplitPane jSplitPane2;
    int cityArraySize;
    /**
     * Creates new form SignupPage
     */
    public SignupPane(MainHistory history,JSplitPane jSplitPane1,int cityArraySize) {
        initComponents();
        this.history = history;
        this.jSplitPane2 = jSplitPane1;
        this.cityArraySize = cityArraySize;
        
        cityCombobox.removeAllItems();
        
        for(MainModel mainM : history.getHistory()){
            if(mainM.getCity()!=null){
                cityCombobox.addItem(mainM.getCity());
            }
            
            }
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
        inpUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inpName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cityCombobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        inpAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inpDob = new javax.swing.JTextField();
        inpContact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        inpGender = new javax.swing.JTextField();
        inpPass = new javax.swing.JPasswordField();
        inpCnfPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel1.setText("Create USER ID:");

        jLabel2.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel2.setText("Create PASSWORD:");

        inpUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpUserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("BM Yeonsung", 1, 18)); // NOI18N
        jLabel3.setText("HOSPITAL MANAGEMENT SYSTEM");

        jButton1.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jButton1.setText("SIGN UP");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel5.setText("Confirm PASSWORD:");

        jLabel4.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel4.setText("Enter Full Name:");

        inpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel6.setText("City");

        cityCombobox.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        cityCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel8.setText("DOB");

        jLabel9.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel9.setText("Contact");

        jLabel10.setFont(new java.awt.Font("BM Yeonsung", 1, 13)); // NOI18N
        jLabel10.setText("Gender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inpGender))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inpAddress)
                                    .addComponent(inpDob)
                                    .addComponent(inpContact)
                                    .addComponent(inpUser)
                                    .addComponent(inpName)
                                    .addComponent(inpPass)
                                    .addComponent(inpCnfPass)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inpUser)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inpPass)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(inpCnfPass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpDob, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpContact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            
        FieldsValidation fv = new FieldsValidation();
        String Name = inpName.getText();
        String UserId = inpUser.getText();
        String Pass = inpPass.getText();
        String CnfPass = inpCnfPass.getText();
        String address = inpAddress.getText();
        long contact = Long.parseLong(inpContact.getText());
        String dob = inpDob.getText();
        String gender = inpGender.getText();
        String city = cityCombobox.getSelectedItem().toString();
        
        
        String Role;
        int Flag = 0;
        ArrayList<MainModel> mainM = history.getHistory();
        ArrayList<MainModel> cityArray = new ArrayList();
           if(Name.equals("") || address.equals("") || String.valueOf(contact).equals("") || UserId.equals("") || Pass.equals("") || CnfPass.equals("") || dob.equals("") || gender.equals("") || city.equals(""))
           {
               throw new Exception("Please fill all the details");
           }
            
           if(!fv.verifyName(Name)){
               inpName.setText("");
               throw new Exception("Please enter valid name");
           }
           
           if(!fv.verifyContact(contact)){
               inpContact.setText("");
               throw new Exception("Please enter valid contact no");
           }
           
           if(!fv.verifyAdress(address)){
               inpAddress.setText("");
               throw new Exception("Please enter valid address");
           }
//         = new ArrayList();
        if(Pass.equals(CnfPass)){
            for(int i = 0; i < mainM.size();i++){
                cityArray = mainM.get(i).getPersonArray();
                for (int j = 0;j<cityArray.size();j++ ){
                    if(cityArray.get(j).getPersonId() == UserId){
                        JOptionPane.showMessageDialog(this, "USER ALREADY EXISTS");
                        Flag = 1;
                        return;
                        
                     
                    }
                    
            }
        }
            if(Flag == 0){
                MainModel mainMo = history.addNewPerson();
//                MainModel mainMo = history.addNewPerson();
                mainMo.setPersonName(Name);
                mainMo.setPersonRole("Patient");
                mainMo.setPersonId(UserId);
                mainMo.setPersonPassword(Pass);
                mainMo.setPersonAddress(address);
                mainMo.setPersonContact(contact);
                mainMo.setPersonDob(dob);
                mainMo.setPersonGender(gender);
                mainMo.setPersonCity(city);
                MainModel mainModel = history.addNewSession();
                mainModel.setSessionName(Name);
                mainModel.setSessionRole("Patient");
                mainModel.setSessionId(UserId);
                mainModel.setSessionPass(Pass);
                mainModel.setSessionAddress(address);
                mainModel.setSessionContact(contact);
                mainModel.setSessionDob(dob);
                mainModel.setSessionGender(gender);
                
                
                PatientOptionPane obj = new PatientOptionPane(history,jSplitPane2);
                jSplitPane2.setRightComponent(obj);
                LogoutPane obj1 = new LogoutPane(history,jSplitPane2,cityArraySize);
                jSplitPane2.setLeftComponent(obj1);
//                
                

                System.out.println("PersonAdded");
            }
        }
        // Validation ADD
//        try{
//            FieldsValidation fv = new FieldsValidation();
//            String UserId = inpUser.getText();
//            String Name = inpName.getText();
//            String Address = inpAddress.getText();
//            long Contact = Long.parseLong(inpContact.getText());
//            String Dob = inpDob.getText();
//            String Gender = inpGender.getText();
//            ArrayList<MainModel> mainM = history.getHistory();
//            if(Name.equals("") || Address.equals("") || String.valueOf(Contact)!="" )
//           {
//               throw new Exception("Please fill all the details");
//           }
//            
//           if(!fv.verifyName(Name)){
//               inpName.setText("");
//               throw new Exception("Please enter valid name");
//           }
//           
//           if(!fv.verifyContact(Contact)){
//               inpContact.setText("");
//               throw new Exception("Please enter valid contact no");
//           }
//           
//           if(!fv.verifyAdress(Address)){
//               inpAddress.setText("");
//               throw new Exception("Please enter valid address");
//           }
//            for(int i =0;i<mainM.size();i++){
//                
//              if(mainM.get(i).getPersonId() != null && mainM.get(i).getPersonId() == Uid){
//                  
//                  mainM.get(i).setPersonName(Name);
//                  mainM.get(i).setPersonAddress(Address);
//                  mainM.get(i).setPersonContact(Contact);
//                  mainM.get(i).setPersonDob(Dob);
//                  mainM.get(i).setPersonGender(Gender);
//                  break;
//              }
//            }
//        displayCommunity(SelectedCity);
//        
//            
//        }
//        catch(Exception e){            
//                    System.out.println("!!!!!!Exception : " + e.getMessage()+ "!!!!!!!!!!");                   
//                    JOptionPane.showMessageDialog(this, e.getMessage());
//        }        
            
    
//Validation END
        
        }catch(Exception e){
                    System.out.println("!!!!!!Exception : " + e.getMessage()+ "!!!!!!!!!!");                   
                    JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpNameActionPerformed

    private void inpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityCombobox;
    private javax.swing.JTextField inpAddress;
    private javax.swing.JPasswordField inpCnfPass;
    private javax.swing.JTextField inpContact;
    private javax.swing.JTextField inpDob;
    private javax.swing.JTextField inpGender;
    private javax.swing.JTextField inpName;
    private javax.swing.JPasswordField inpPass;
    private javax.swing.JTextField inpUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
public static ArrayList<Component> getAllComponents(final Container c) {
    Component[] comps = c.getComponents();
    ArrayList<Component> compList = new ArrayList<Component>();
    for (Component comp : comps) {
        compList.add(comp);
        if (comp instanceof Container)
            compList.addAll(getAllComponents((Container) comp));
    }
    return compList;
}

public static HashMap<String, Object> ArrayListToHashMap(ArrayList<MainModel> arrayList) {
    HashMap<String, Object> hashMap = new HashMap<>();
//        ArrayList<MainModel> mainM = history.getHistory();
               
        for(int i =0 ; i<arrayList.size();i++){
            hashMap.put("cityArray",arrayList.get(i).getCity());
        }
//        for (int i =0;i<mainM.get(j).getHospitalArray().get(k).getDoctorArray().size();i++){
//  
//            hashMap.put(str, str.getHospitalArray());
//        }
  
        return hashMap;
}
}