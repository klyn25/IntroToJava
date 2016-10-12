/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWunit4;

/**
 *
 * @author Kristy
 */
public class MagicDate {
    private int month, day, year;
    
    public MagicDate(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public boolean isMagic(int month, int day, int year){
        
        if(month*day == year){
            return true;
        }else{
            return false;
        }
    }
}
