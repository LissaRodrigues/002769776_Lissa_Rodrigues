/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ui;

import JavaMainModel.Encounter;
import JavaMainModel.EncounterHistory;
import JavaMainModel.Patient;
import JavaMainModel.PatientDirectory;
import JavaMainModel.Person;
import JavaMainModel.PersonDirectory;
import JavaMainModel.VitalSigns;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author girish
 */
public class PatientPastEncounter extends javax.swing.JPanel {

    /**
     * Creates new form PatientPastEncounter
     */
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    public PatientPastEncounter(PatientDirectory patientDirectory,PersonDirectory personDirectory) {
        initComponents();
        this.patientDirectory=patientDirectory;
        this.personDirectory=personDirectory;
        DisplayData(patientDirectory.getPatients());
        PtnHistoryDetails.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPtnHist = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentHistory = new javax.swing.JTable();
        btnViewPtnHistory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PtnHistoryDetails = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(180, 207, 234));
        setForeground(new java.awt.Color(180, 207, 234));

        lblPtnHist.setBackground(new java.awt.Color(17, 12, 102));
        lblPtnHist.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblPtnHist.setForeground(new java.awt.Color(17, 12, 102));
        lblPtnHist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPtnHist.setText("Patient History");
        lblPtnHist.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AppointmentHistory.setBackground(java.awt.Color.white);
        AppointmentHistory.setForeground(new java.awt.Color(0, 0, 0));
        AppointmentHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Appointment Date", "Recent VitalSigns", "Test Undertaken Date"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(AppointmentHistory);

    btnViewPtnHistory.setBackground(new java.awt.Color(17, 12, 102));
    btnViewPtnHistory.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
    btnViewPtnHistory.setForeground(new java.awt.Color(255, 255, 255));
    btnViewPtnHistory.setText("View Patient History");
    btnViewPtnHistory.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnViewPtnHistoryActionPerformed(evt);
        }
    });

    PtnHistoryDetails.setBackground(java.awt.Color.white);
    PtnHistoryDetails.setColumns(20);
    PtnHistoryDetails.setForeground(new java.awt.Color(0, 0, 0));
    PtnHistoryDetails.setRows(5);
    jScrollPane2.setViewportView(PtnHistoryDetails);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(lblPtnHist, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(492, 492, 492)
                    .addComponent(btnViewPtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(lblPtnHist)
            .addGap(39, 39, 39)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37)
            .addComponent(btnViewPtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(42, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPtnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPtnHistoryActionPerformed
        PtnHistoryDetails.setVisible(true);
        int rowIndex=AppointmentHistory.getSelectedRow();
        if(rowIndex<0)
        {
        JOptionPane.showMessageDialog(this,"Please select the entry you wish to Update");
        }
        else
        {
            var patientId=(AppointmentHistory.getValueAt(rowIndex, 0).toString());
            for (Patient patient : patientDirectory.getPatients()) {
                for (Map.Entry<Integer, EncounterHistory> pair : patient.getPatient().entrySet())
                {
                    if(pair.getKey()==Integer.parseInt(patientId))
                    {
                        check(patient);
                        return;
                    }
                }

            }

    }//GEN-LAST:event_btnViewPtnHistoryActionPerformed
    }

    private void DisplayData(Set<Patient> patients) {
        try{
        DefaultTableModel model =(DefaultTableModel) AppointmentHistory.getModel();
        model.setRowCount(0);
        if(patients!=null && !patients.isEmpty())
        {
            patients.stream().map(patient -> {
                int patientID=0;
                String patientName="";
                Date appointmentDate=new Date();
                Map<String,Integer> recentVitalSigns=new HashMap<>();
                Date testUnderTakenDate=new Date();
                for (Map.Entry<Integer, EncounterHistory> pair : patient.getPatient().entrySet())
                {
                    patientID= pair.getKey();
                    for(Map.Entry<Date,VitalSigns> x : pair.getValue().getPtnEncounterHistory().get(pair.getValue().getPtnEncounterHistory().size()-1).getPtnEncounter().entrySet())
                    {
                        appointmentDate= x.getKey();
                        recentVitalSigns.put("Pulse",  x.getValue().getPulse());
                        recentVitalSigns.put("Blood Pressure",  x.getValue().getBloodPressure());
                        recentVitalSigns.put("Temperature",  x.getValue().getTemperature());
                        testUnderTakenDate=x.getValue().getDateOfVitals();
                    }
                }
                for(Person person:personDirectory.getPersonDirectory())
                {
                    if(person.getPatientID()==(patientID))
                    {
                        patientName=person.getName();
                    }

                }
                model.addRow(new Object[]
                {patientID,patientName,appointmentDate,recentVitalSigns,testUnderTakenDate});
                return patient;
            }).forEachOrdered(_item -> {
                AppointmentHistory.setModel(model);
            });
        }
        else{
             JOptionPane.showMessageDialog(this,"No Appointment to View");
             return;
        }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Please Create an appointment before displaying");
        }

    }
    
    private void check(Patient patient)
    {
        int key=0;
        String x="";
        EncounterHistory value=new  EncounterHistory();
        for(Map.Entry<Integer, EncounterHistory> patienEntry : patient.getPatient().entrySet())
        {
            key=patienEntry.getKey();
            value=patienEntry.getValue();
        }
        x=x+"Patient Id: "+key+""+System.lineSeparator()+System.lineSeparator();
        for(Encounter encounter:value.getPtnEncounterHistory())
        {
            for (Map.Entry<Date, VitalSigns> entry : encounter.getPtnEncounter().entrySet()) {
               x=x+"Doctor Visit Date: "+entry.getKey()+System.lineSeparator()+
                       "Pulse Rate : "+entry.getValue().getPulse()+" "+ "Blood Pressure: "+entry.getValue().getBloodPressure()+" "+ "Temperature : "+entry.getValue().getTemperature()+System.lineSeparator()
                       +"Test Taken Date: "+entry.getValue().getDateOfVitals()+
                       System.lineSeparator()+System.lineSeparator();
            }
        }
        PtnHistoryDetails.setText(x);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentHistory;
    private javax.swing.JTextArea PtnHistoryDetails;
    private javax.swing.JButton btnViewPtnHistory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPtnHist;
    // End of variables declaration//GEN-END:variables
}
