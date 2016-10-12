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
public class MonthDays {
    private int month;
    private int year;
    
    public MonthDays(int month, int year){
        this.month = month;
        this.year = year;
    }
    
    public int getNumberOfDays(int month, int year){
        int days = 0;
        
        if(month%2 == 0){//if mo is even
            if(month == 2){//if it is feb
                if(year%100 == 0){
                    if(year%400 == 0){
                        days = 29;
                    }else{
                        days=28;
                    }
                    
                }else if(year%4 == 0){
                    days = 29;
                }else{
                    days=28;
                }
            }else{//if it is not feb
               days = 30; 
            }
            
        }else{//if it is odd
            days = 31;
        }
        
        return days;
    }
    
}
