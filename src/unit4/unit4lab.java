/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4;

import java.util.Scanner;

/**
 *
 * @author Kristy
 */
public class unit4lab {
    
    public static void main(String[] args) {
        //challenge1(); //roman numerals
        //challenge2(); // time calculator
        //challenge3(); // test scores
        //challenge7(); //fat grams
        challenge8(); //running the race
    }
    
    //1 Roman Numerals
    public static void challenge1(){
        Scanner keyboard = new Scanner(System.in);
        
        //user enters a number between 1 and 10
        System.out.print("Please enter a number between 1 and 10: ");
        int number = keyboard.nextInt();
        keyboard.nextLine();
        
        //switch statement checks number and returns roman numeral
        switch(number){
            case 1:
                System.out.println("Roman numeral is: I");
                break;
            case 2:
                System.out.println("Roman numeral is: II");
                break;
            case 3:
                System.out.println("Roman numeral is: III");
                break;
            case 4:
                System.out.println("Roman numeral is: IV");
                break;
            case 5:
                System.out.println("Roman numeral is: V");
                break;
            case 6:
                System.out.println("Roman numeral is: VI");
                break;
            case 7:
                System.out.println("Roman numeral is: VII");
                break;
            case 8:
                System.out.println("Roman numeral is: VIII");
                break;
            case 9:
                System.out.println("Roman numeral is: IX");
                break;
            case 10:
                System.out.println("Roman numeral is: X");
                break;
            default:
                System.out.println("That number is not between 1 and 10");
                break;
        }
    }
    
    //time calculator
    public static void challenge2(){
        Scanner keyboard = new Scanner(System.in);
        
        //user enters number of seconds
        System.out.print("Please enter the number of seconds: ");
        int seconds = keyboard.nextInt();
        keyboard.nextLine();
        
        //if check seconds
        if(seconds >= 86400){
            System.out.println("" + seconds/86400 + " days");
        } 
        else if(seconds >= 3600){
            System.out.println("" + seconds/3600 + " hours");
        }
        else if(seconds >= 60){
            System.out.println("" + seconds/60 + " minutes");
        }
    }
    
    //testScores - has class
    public static void challenge3(){
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
        
        double average = testScores.averageTestScores();
        
        System.out.println("Letter grade: " + testScores.getLetterGrade(average));
    }
    
    //fat gram class - has class
    public static void challenge7(){
       //user enters number of calories
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Please enter number of calories: ");
       int calories = keyboard.nextInt();
       keyboard.nextLine();
       
       //user enters grams of fat
       System.out.print("Please enter grams of fat: ");
       int gramsFat = keyboard.nextInt();
       keyboard.nextLine();
       
       //display % of calories from fat
       fatGram fatgram1 = new fatGram(calories, gramsFat);
       
       fatgram1.setCaloriesFromFat();
       fatgram1.calcCaloriesFromFat();
       if(fatgram1.checkCalories()){
           if(fatgram1.getTotal() < 30.0){
                System.out.println( "" + fatgram1.getTotal() + "% "
                        + "This is a low fat food.");
           }else{
               System.out.println( "" + fatgram1.getTotal() + "%");
           }
       }else{
           System.out.println( "Calories from fat cannot be more "
                   + "than total number of calories." );
       }
       
       
       //if less than 30% = low fat
    }
    
    //running the race - has class
    public static void challenge8(){
        String firstPlace, secondPlace, thirdPlace;
        
        Runner runner1 = new Runner("Tim", 5.23);
        Runner runner2 = new Runner("John", 7.41);
        Runner runner3 = new Runner("Ruth", 4.21);
        
        //new test - added something more complicated
        System.out.println("" + Runner.getResults(runner1, runner2, runner3));



        //original work
        if(runner1.getMinutes() < runner2.getMinutes()) {
            if(runner1.getMinutes() < runner3.getMinutes()){
                firstPlace = runner1.getName();
                if(runner2.getMinutes() < runner3.getMinutes()){
                    secondPlace = runner2.getName();
                    thirdPlace = runner3.getName();
                }else{
                    secondPlace = runner3.getName();
                    thirdPlace = runner2.getName();
                }
            }else{
                firstPlace = runner3.getName();
                secondPlace = runner1.getName();
                thirdPlace = runner2.getName();
            }
        }else{
            if(runner2.getMinutes() < runner3.getMinutes()){
                firstPlace = runner2.getName();
                if(runner1.getMinutes() < runner3.getMinutes()){
                    secondPlace = runner1.getName();
                    thirdPlace = runner3.getName();
                }else{
                    secondPlace = runner3.getName();
                    thirdPlace = runner1.getName();
                }
            }else{
                firstPlace = runner3.getName();
                if(runner1.getMinutes() < runner2.getMinutes()) {
                    secondPlace = runner1.getName();
                    thirdPlace = runner2.getName();
                }else{
                    secondPlace = runner2.getName();
                    thirdPlace = runner1.getName();
                }
            }
        }
        
        System.out.println("First place:\t" + firstPlace);
        System.out.println("Second place:\t" + secondPlace);
        System.out.println("Third place:\t" + thirdPlace);
    }

    
}

    
