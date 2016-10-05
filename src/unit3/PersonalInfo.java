/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

/**
 *
 * @author Kristy
 */
public class PersonalInfo {
    
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    
    public PersonalInfo(String name, String address, int age, String phoneNumber){
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
