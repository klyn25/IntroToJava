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
    
    /**
     *
     * @param runner1
     * @param runner2
     * @param runner3
     * @return
     */
    public static String getResults(Runner runner1, Runner runner2, Runner runner3){
        //initialized cuz netbeans was bein a punk
        String finishers = "";
        String first;
        String second;
        String third;
        if((runner1.minutes < runner2.minutes) && (runner1.minutes < runner3.minutes)){
            first = runner1.name;
            if(runner2.minutes < runner3.minutes){
                second = runner2.name;
                third = runner3.name;
            }else{
                second = runner3.name;
                third = runner2.name;
            }
        } else if(runner2.minutes < runner3.minutes){
            first = runner2.name;
            if(runner1.minutes < runner3.minutes){
                second = runner1.name;
                third = runner3.name;
            }else{
                second = runner3.name;
                third = runner1.name;
            }
        } else {
            first = runner3.name;
            if(runner1.minutes < runner2.minutes){
                second = runner1.name;
                third = runner2.name;
            }else{
                second = runner2.name;
                third = runner1.name;
            }
        }
        finishers += "First place:\t" + first + "\n";
        finishers += "Second place:\t" + second + "\n";
        finishers += "Third place:\t" + third + "\n";
        
        return finishers;
    }
    
}
