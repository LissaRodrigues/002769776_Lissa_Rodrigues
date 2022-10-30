/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

import java.util.Date;

/**
 *
 * @author girish
 */
public class VitalSigns {
    
    private int BloodPressure;
    private int Pulse;
    private int Temperature;
    private Date DateOfVitals;

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int Temperature) {
        this.Temperature = Temperature;
    }

    public Date getDateOfVitals() {
        return DateOfVitals;
    }

    public void setDateOfVitals(Date DateOfVitals) {
        this.DateOfVitals = DateOfVitals;
    }
}
