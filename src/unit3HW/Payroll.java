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
public class Payroll {
    
    private String name;
    private int employeeId;
    private double hourlyPay;
    private double hoursWorked;
    
    public Payroll(String name, int employeeId){
    
        this.name = name;
        this.employeeId = employeeId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setHourlyPay(double hourlyPay){
        this.hourlyPay = hourlyPay;
    }
    public double getHourlyPay(){
        return hourlyPay;
    }
    
    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public double grossPay(){
        return hoursWorked * hourlyPay;
    }
    
}
