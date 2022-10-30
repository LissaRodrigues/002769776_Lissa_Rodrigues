/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author girish
 */
public class Patient {
        
    private Person person;
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    Map<Integer,EncounterHistory> patient=new HashMap<>();

    public Map<Integer, EncounterHistory> getPatient() {
        return patient;
    }

    public void setPatient(Map<Integer, EncounterHistory> patient) {
        this.patient = patient;
    }
}
