/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalWorkArea.Hospitals;

import userinterface.SystemWorkArea.Hospital.*;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.Hospital;
import model.HospitalDirectory;
import userinterface.SystemWorkArea.Patient.*;

/**
 *
 * @author Tejas
 */
public class HospitalCreateHospital extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    HospitalDirectory hospitalDirectory;
    boolean validationCheck = true;
    boolean emptyValidationStatus = true;
            
    public HospitalCreateHospital(HospitalDirectory hospitalDirectory) {
        initComponents();
        initCityCmbx();
        this.hospitalDirectory = hospitalDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHospName = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        lblHospitalAddress = new javax.swing.JLabel();
        txtHospAddress = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        btnCreateHospital = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        comboCommunity = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(191, 172, 224));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Hospital");

        lblHospName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHospName.setText("Hospital Name :");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        lblHospitalAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHospitalAddress.setText("Hospital Address :");

        txtHospAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospAddressActionPerformed(evt);
            }
        });

        lblContactNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContactNo.setText("Contact Number :");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCommunity.setText("Community :");

        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCity.setText("City :");

        comboCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCityItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblHospitalAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHospName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(txtHospAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(btnCreateHospital)
                            .addComponent(comboCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHospName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(comboCommunity))
                .addGap(18, 18, 18)
                .addComponent(btnCreateHospital)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtHospAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospAddressActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:

        try{
                
            if(EmpytyFieldValidation()){
            
                if(RegexValidation()){
                 
                    Random random=new Random();
                    int hospitalId = random.nextInt((9999 - 100) + 1) + 10;
                    String hospitalName = txtHospitalName.getText();
                    String hospitalAddress = txtHospAddress.getText();
                    long contactNo = Long.parseLong(txtContactNo.getText());
                    String city = comboCity.getSelectedItem().toString();
                    String community = comboCommunity.getSelectedItem().toString();
                    
                    Hospital hospital = new Hospital();
                    hospital.setHospitalID(hospitalId);
                    hospital.setHospitalName(hospitalName);
                    hospital.setHospitalAddress(hospitalAddress);
                    hospital.setContactNumber(contactNo);
                    
                    Map<String, String> communityMap = new HashMap<>();
                    communityMap.put(city,community);
           
                    Community c = new Community();
                    c.setCommunity(communityMap);
                    
                    hospital.setCommunity(c);                 
                    hospitalDirectory.setHospitals(hospital);
                    
                    JOptionPane.showMessageDialog(this,"Hospital Registered Successfully. New Hospital ID Id is:"+hospitalId+",Please save this Hospital Id for furture appointments.");
                }

                else{
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Some Error in entered data. Please check over the red fields to know more.");
                emptyValidationStatus=true;
            
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Patient not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
            if(hospitalDirectory.getHospitals().size()>0){
                hospitalDirectory.getHospitals().remove(hospitalDirectory.getHospitals().size() - 1);
            }
        }
        
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void comboCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCityItemStateChanged
        // TODO add your handling code here:
       initCommunityCmbx();
    }//GEN-LAST:event_comboCityItemStateChanged
    
    private void initCommunityCmbx() {
        comboCommunity.removeAllItems();
        int count = 0;
        var selectedCity=comboCity.getSelectedItem().toString();
        City city=City.valueOf(selectedCity);
        Community community=new Community();
        community.setLstCommunity();
        String[] communities=community.getLstCommunity().get(city);
            for (String community_ : communities) {
                comboCommunity.addItem(communities[count++]);
            }
    }
    
    private void initCityCmbx() {
       comboCity.removeAllItems();
       int count = 0;
        City[] cities = City.values();
        for (City city_ : cities) {
            comboCity.addItem(cities[count++].toString());
        }
       initCommunityCmbx();
    }
    
    private boolean RegexValidation() {
        if(!txtHospitalName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospitalName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtHospitalName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
        }
        
//        if(!txtHospAddress.getText().matches("^[a-zA-Z ]+$"))
//        {
//            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
//            txtHospAddress.setToolTipText("Please enter only characters and space.");
//            validationCheck=false;
//        }
//        
//        if(txtHospAddress.getText().matches("^[a-zA-Z ]+$"))
//        {
//            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
//        }
        
        if(!txtContactNo.getText().matches("^[0-9]{10}$"))
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtContactNo.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }
        
        if(txtContactNo.getText().matches("^[0-9]{10}$"))
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(txtHospitalName.getText().equals(null) || txtHospitalName.getText().trim().isEmpty() )
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospitalName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtHospitalName.getText().equals(null) && !txtHospitalName.getText().trim().isEmpty() )
        {
            txtHospitalName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(txtHospAddress.getText().equals(null) || txtHospAddress.getText().trim().isEmpty() )
        {
            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospAddress.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtHospAddress.getText().equals(null) && !txtHospAddress.getText().trim().isEmpty() )
        {
            txtHospAddress.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(txtContactNo.getText().equals(null) || txtContactNo.getText().trim().isEmpty())
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtContactNo.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtContactNo.getText().equals(null) && !txtContactNo.getText().trim().isEmpty())
        {
            txtContactNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblHospName;
    private javax.swing.JLabel lblHospitalAddress;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtHospAddress;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables
}
