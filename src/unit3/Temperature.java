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
public class Temperature {
    
    private double ftemp;
    
    public Temperature (double t){
        ftemp = t;
    }
    
    public void setFahrenheit (double t){
        ftemp = t;
    }
    
    public double getFahrenheit (){
        return ftemp;
    }
    
    public double getCelcius(){
        return (5.0/9) * (ftemp - 32);
    }
    
    public double getKelvin(){
        return getCelcius() + 273;
    }
}
