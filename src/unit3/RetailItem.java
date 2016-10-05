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
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    
    public void setDescription(String desc){
        description = desc;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setUnitsOnHand(int units){
        unitsOnHand = units;
    }
    
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
}
