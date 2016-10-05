/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3HW;

/**
 *
 * @author Kristy
 */
public class Widget {
    
    private int widgets;
    
    
    
    //# widgets needed
    public void setWidgets(int widgets){
        this.widgets = widgets;
    }
    
    //days to produce widgets(10 widgets per hour - 16hrs per day)
    public double productionDays(){
        return widgets / (16 * 10);
    }
    //
    
}
