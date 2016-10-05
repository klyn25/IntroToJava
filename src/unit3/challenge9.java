/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

import java.util.Scanner;

/**
 *
 * @author Kristy
 */
public class challenge9 {
    
        public static void main(String[] args) {
            //prompt the user for the radius
            Scanner keyboard = new Scanner(System.in);
            
            //System.out.print("Enter the radius: ");
            //double radius = keyboard.nextDouble();
            //keyboard.nextLine();//use for all number input
            
            //construct a circle
            //Circle circle = new Circle(radius);
            
            //output area, diameter, circumference
            //System.out.println("Area = " + circle.getArea());
            //System.out.println("Diameter = " + circle.getDiameter());
            //System.out.println("Circumference = " + circle.getCircumference());
            
            System.out.print("Enter fahrenheit: ");
            //Scanner keyboard = new Scanner(System.in);
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            
            Temperature temp = new Temperature(fahrenheit);
            
            System.out.println("The Temperature in Fahrenheit is " + temp.getFahrenheit());
            System.out.println("The Temperature in Celcius is " + temp.getCelcius());
            System.out.println("The Temperature in Kelvin is " + temp.getKelvin());
            
        }
}
