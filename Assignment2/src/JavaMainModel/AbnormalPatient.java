/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

/**
 *
 * @author girish
 */
public class AbnormalPatient {
    
    private int PatientID;
    private String PatientName;
    private VitalSigns VitalSigns;
    private int Age;
   
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public VitalSigns getVitalSigns() {
        return VitalSigns;
    }

    public void setVitalSigns(VitalSigns VitalSigns) {
        this.VitalSigns = VitalSigns;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }   
}
