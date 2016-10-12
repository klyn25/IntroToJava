/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWunit4;

import java.util.Scanner;

/**
 *
 * @author Kristy
 */
public class HWunit4 {

    /**
     *
     */
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        //challenge13(); //body mass index
        //challenge14(); //days in a month
        //challenge15(); //book club points
        challenge16(); //magic date
    }
    
    //body mass index
    public static void challenge13(){
        System.out.print("Please enter your height(in inches): ");
        double height = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Please enter your weigh(in pounds): ");
        double weight = keyboard.nextInt();
        keyboard.nextLine();
        
        double bmi = weight * (703/(height*height));
        
        if(bmi < 18.5){
            System.out.println("You need to eat a cheeseburger.");
        } else if((bmi > 18.5) && (bmi < 25.0)){
            System.out.println("You are at an optimal weight.");
        } else if (bmi > 25.0){
            System.out.println("You need to change your sustenance.");
        }
    }
    
    //days in a month - has class
    public static void challenge14(){
        System.out.print("Enter a month (1-12): ");
        int month = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Enter a year: ");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        
        MonthDays numDays = new MonthDays(month, year);
        
        System.out.println(numDays.getNumberOfDays(month, year));
    }
    
    //book club points
    public static void challenge15(){
        System.out.print("How many books did you purchase this month: ");
        int numBooks = keyboard.nextInt();
        
        switch(numBooks){
            case 0:
                System.out.println("You earned 0 points.");
                break;
            case 1:
                System.out.println("You earned 5 points.");
                break;
            case 2:
                System.out.println("You earned 15 points.");
                break;
            case 3:
                System.out.println("You earned 30 points.");
                break;
            default:
                System.out.println("You earned 60 points.");
                break;
                
            
        }
    }
    
    //magic date - has class
    public static void challenge16(){
        System.out.print("Enter a month (1-12): ");
        int month = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Enter a day: ");
        int day = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Enter a 2 digit year (ie: 1960 = 60): ");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        
        MagicDate magicDate = new MagicDate(month, day, year);
        
        if(magicDate.isMagic(month, day, year)){
            System.out.println("Magic");
        }else{
            System.out.println("Not magic");
        }
    }
}
