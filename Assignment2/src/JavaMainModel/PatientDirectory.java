/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author girish
 */
public class PatientDirectory {
    
    Set<Patient> Patients = new HashSet<>();
    
    public PatientDirectory() {
        Patient Patient_=new Patient();
        EncounterHistory encounterHistory=new EncounterHistory();
        Encounter encounter=new Encounter();
        
        VitalSigns vitalSign_1=new VitalSigns();
        vitalSign_1.setBloodPressure(100);
        vitalSign_1.setPulse(50);
        vitalSign_1.setTemperature(102);
        vitalSign_1.setDateOfVitals(new Date());
        
        VitalSigns vitalSigns_2=new VitalSigns();
        vitalSigns_2.setBloodPressure(130);
        vitalSigns_2.setPulse(80);
        vitalSigns_2.setTemperature(105);
        vitalSigns_2.setDateOfVitals(new Date());  
        
        Map<Date,VitalSigns> EncounterMap=new HashMap<>();
        
        EncounterMap.put(new Date(), vitalSign_1);
        encounter.setPtnEncounter(EncounterMap);
        
        EncounterMap.put(new Date(), vitalSigns_2);
        encounter.setPtnEncounter(EncounterMap);
        
        encounterHistory.setPtnEncounterHistory(encounter);
        Map<Integer,EncounterHistory> encounterHistoryMapping =new HashMap<>();
        encounterHistoryMapping.put(1234, encounterHistory);
        Patient_.setPatient(encounterHistoryMapping);
        Patients.add(Patient_);
    }
    
    public Set<Patient> getPatients() {
        return Patients;
    }

    public void setPatients(Patient patients) {
        this.Patients.add(patients);
    }
    
}
