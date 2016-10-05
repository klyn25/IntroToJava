/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

/**
 *
 * @author Kristy
 */
public class ProgrammingChallenges {
    
    public static void main(String[] args) {
        challenge1();
        challenge2();
        challenge3();
        //challenge4();
        challenge5();
    }
    
    public static void challenge1(){
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        emp1.setName("Susan Meyers");
        emp1.setIdNumber(47899);
        emp1.setDepartment("Accounting");
        emp1.setPosition("Vice President");
        
        emp2.setName("Mark Jones");
        emp2.setIdNumber(39119);
        emp2.setDepartment("IT");
        emp2.setPosition("Programmer");
        
        emp3.setName("Joy Rogers");
        emp3.setIdNumber(81774);
        emp3.setDepartment("Manufacturing");
        emp3.setPosition("Engineer");
        
        System.out.println("" + emp1.getName() + "\t" + emp1.getIdNumber() + "\t" 
        + emp1.getDepartment() + "\t" + emp1.getPosition());
        
        System.out.println("" + emp2.getName() + "\t" + emp2.getIdNumber() + "\t" 
        + emp2.getDepartment() + "\t\t" + emp2.getPosition());
        
        System.out.println("" + emp3.getName() + "\t" + emp3.getIdNumber() + "\t" 
        + emp3.getDepartment() + "\t" + emp3.getPosition());
    }
    
    public static void challenge2(){
        Car car1 = new Car(1966, "Ford");
        
        car1.accelerate();
        System.out.println(car1.getSpeed());
        car1.accelerate();
        System.out.println(car1.getSpeed());
        car1.accelerate();
        System.out.println(car1.getSpeed());
        car1.accelerate();
        System.out.println(car1.getSpeed());
        car1.accelerate();
        System.out.println(car1.getSpeed());
        
        car1.brake();
        System.out.println(car1.getSpeed());
        car1.brake();
        System.out.println(car1.getSpeed());
        car1.brake();
        System.out.println(car1.getSpeed());
        car1.brake();
        System.out.println(car1.getSpeed());
        car1.brake();
        System.out.println(car1.getSpeed());
    }
    
    public static void challenge3(){
        //String name, String address, int age, String phoneNumber
        
        PersonalInfo mine = new PersonalInfo("Kristy", "123 Salsbury Hill", 89, "KL5-6678");
        PersonalInfo yours = new PersonalInfo("Milo", "456 Yellow Brick Road", 33, "KL5-8909");
        PersonalInfo jenny = new PersonalInfo("Jenny", "435 Some Place", 12, "867-5309");
        
        System.out.println("" + mine.getName() + " " + mine.getAddress() + " " 
        + mine.getAge() + " " + mine.getPhoneNumber());
        System.out.println("" + yours.getName() + " " + yours.getAddress() + " " 
        + yours.getAge() + " " + yours.getPhoneNumber());
        System.out.println("" + jenny.getName() + " " + jenny.getAddress() + " " 
        + jenny.getAge() + " " + jenny.getPhoneNumber());
    }
    
    public static void challenge4(){
        //did in class
    }
    
    public static void challenge5(){
        RetailItem item1 = new RetailItem();
        RetailItem item2 = new RetailItem();
        RetailItem item3 = new RetailItem();
        
        item1.setDescription("Jacket");
        item1.setUnitsOnHand(12);
        item1.setPrice(59.95);
        
        item2.setDescription("Designer Jeans");
        item2.setUnitsOnHand(40);
        item2.setPrice(34.95);
        
        item3.setDescription("Shirt");
        item3.setUnitsOnHand(20);
        item3.setPrice(24.95);
        
        System.out.println("" + item1.getDescription() + "\t\t" 
        + item1.getUnitsOnHand() + " \t" + item1.getPrice());
        System.out.println("" + item2.getDescription() + "\t" 
        + item2.getUnitsOnHand() + " \t" + item2.getPrice());
        System.out.println("" + item3.getDescription() + "\t\t" 
        + item3.getUnitsOnHand() + " \t" + item3.getPrice());
    }
    
}
