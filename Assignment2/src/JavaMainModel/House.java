/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMainModel;

/**
 *
 * @author girish
 */
public class House {
    
    /* 
    This class contains details of the specific house
    of the person such as house num, street name
    and the community the person belongs to
    */

    private String HouseNum;
    private String Street;
    private Community Community_;
    
    public String getHouseNum() {
        return HouseNum;
    }

    public void setHouseNum(String HouseNum) {
        this.HouseNum = HouseNum;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public Community getCommunity_() {
        return Community_;
    }

    public void setCommunity_(Community Community_) {
        this.Community_ = Community_;
    }
}
