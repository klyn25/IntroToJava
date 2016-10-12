/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4;

/**
 *
 * @author Kristy
 */
public class fatGram {
    private int calories;
    private int fatGrams;
    private double calsFromFat;
    private double total;
    
    public fatGram (int calories, int fatGrams){
        this.calories = calories;
        this.fatGrams = fatGrams;
        
    }
    
    public void setCaloriesFromFat(){
        calsFromFat = fatGrams * 9;
    }
    public boolean checkCalories(){
        if (calsFromFat < calories){
            return true;
        }else{
            return false;
        }
    }
    public double getTotal(){
        return total * 100;
    }
    
    public void calcCaloriesFromFat(){
        total = calsFromFat / calories;
    }
    
}
