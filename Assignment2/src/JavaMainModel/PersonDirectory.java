/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author girish
 */

public class PersonDirectory {
    
    /*
    Person Directory contains an ArrayList of all the Person_.
     */
    List<Person> persons = new ArrayList<>();

    //Adding dummy data for testing purpose
    public PersonDirectory() {
        Person Person_ = new Person();
        Person_.setName("Miss Test Patient");
        Person_.setHeight((float) 5.9);
        Person_.setWeight((float) 64);
        Person_.setAge(45);
        Person_.setEmail("abc@xyz.com");
        Person_.setPatientID(1234);
        Person_.setCellPhoneNumber((long) 1234567890);
             
        House House_ = new House();
        Community Community_ = new Community();
        Map<String, String> CityCommunityMap = new HashMap<>();
        CityCommunityMap.put("Boston", "Prudential");
        Community_.setCommunity(CityCommunityMap);
        
        House_.setCommunity_(Community_);
        House_.setHouseNum("75");
        House_.setStreet("Saint Alphonsus Street");

        Person_.setHouse(House_);
        persons.add(Person_);
    }
    
    public List<Person> getPersonDirectory() {
        return persons;
    }
    
    public void setPersonDirectory(List<Person> persons) {
        this.persons = persons;
    }
    
    public Person addNewPerson()
    {
        Person Person_=new Person();
        persons.add(Person_);
        return Person_;
    }   
}
