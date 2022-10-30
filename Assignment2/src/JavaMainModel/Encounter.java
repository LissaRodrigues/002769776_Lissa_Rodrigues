/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author girish
 */
public class Encounter {
    
    Map<Date, VitalSigns> PtnEncounter = new HashMap<>();

    public Map<Date, VitalSigns> getPtnEncounter() {
        return PtnEncounter;
    }

    public void setPtnEncounter(Map<Date, VitalSigns> PtnEncounter) {
        this.PtnEncounter = PtnEncounter;
    }   
    
}
