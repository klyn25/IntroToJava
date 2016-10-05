/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3HW;

import java.util.Scanner;

/**
 *
 * @author Kristy
 */
public class unit3HomeWork {
    
    public static void main(String[] args) {
        //challenge6();//Payroll Class
        //challenge7();//Widget Factory
        //challenge8();//TestScores Class
    }
    
    //6. Payroll Class 
    public static void challenge6(){
        
        Payroll emp1Payroll = new Payroll("Jayne Douqh", 54896);
        
        emp1Payroll.setHourlyPay(10.0);
        emp1Payroll.setHoursWorked(25.0);
        
        System.out.println("Gross pay for " + emp1Payroll.getName()+ ": "
        + emp1Payroll.grossPay());
    }
    
    //7. Widget Factory
    public static void challenge7(){
        Widget widget1 = new Widget();
        
        widget1.setWidgets(800);
        System.out.println("" + widget1.productionDays());
    }
    
    //8. TestScores Class
    public static void challenge8(){
        Scanner keyboard = new Scanner(System.in);
        TestScores testScores = new TestScores();
        
        System.out.print("Enter test score 1: ");
        double testScore1 = keyboard.nextDouble();
        keyboard.nextLine();
        testScores.setTestScore1(testScore1);
        
        System.out.print("Enter test score 2: ");
        double testScore2 = keyboard.nextDouble();
        keyboard.nextLine();
        testScores.setTestScore2(testScore2);
        
        System.out.print("Enter test score 3: ");
        double testScore3 = keyboard.nextDouble();
        keyboard.nextLine();
        testScores.setTestScore3(testScore3);
        
        System.out.println("Average test score: " + testScores.averageTestScores());
        
        
        
        
    }
}
