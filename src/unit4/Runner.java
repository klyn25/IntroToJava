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
public class Runner {
    private String name;
    private double minutes;
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;
    
    public Runner (String name, double minutes){
        this.name = name;
        this.minutes = minutes;
        
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }
    public double getMinutes(){
        return minutes;
    }
    
}
