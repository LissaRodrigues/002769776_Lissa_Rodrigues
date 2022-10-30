/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

import java.util.ArrayList;

/**
 *
 * @author girish
 */
public class EncounterHistory {
    
    /*
    Encounter History maintains a record of
    all the Encounters/VitalSigns of the 
    patient and saves it a ArrayList.
    */
    
    ArrayList<Encounter> PtnEncounterHistory = new ArrayList<>();

    public ArrayList<Encounter> getPtnEncounterHistory() {
        return PtnEncounterHistory;
    }

    public void setPtnEncounterHistory(Encounter PtnEncounterHistory) {
        this.PtnEncounterHistory.add(PtnEncounterHistory);
    }    
}
