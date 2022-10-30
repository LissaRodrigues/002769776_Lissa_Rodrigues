/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaMainModel;

/**
 *
 * @author girish
 */
public class Person {
    
    
    /* 
    Creating a person class which takes 
    the basic information of a person like
    Name, height, weight.. etc.
    */
    private String Name;
    private float Height;
    private float Weight;
    private int Age;
    private String Email;
    private House House_;  //This data comes from the House class
    private Long cellPhoneNumber;
    private int PatientID;
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public House getHouse() {
        return House_;
    }

    public void setHouse(House House) {
        this.House_ = House;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(Long cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }
    
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }
}
