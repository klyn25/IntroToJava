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
public class Unit4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        int b=7;
        int c=a;
        int d=1;
        int e=0;
        String aa = "AA";
        String bb = "BB";
        
        //1
        if((a > b) && (a > c)){
            System.out.println("Yep");
        }else{
            System.out.println("Nope");
        }
        
        //2
        if((a >b) && (a <c)){
            System.out.println("Yep");
        }else{
            System.out.println("Nope");
        }
        
        //3
        if((a == b) || (a == c)){
            System.out.println("Yep");
        }else{
            System.out.println("Nope");
        }
        
        //4
        if((a > b+c) && (a > d+e)){
            System.out.println("Yep");
        }else{
            System.out.println("Nope");
        }
        
        //5
        if(aa.equals(bb)) {
            System.out.println("Yep");
        }else{
            System.out.println("Nope");
        }
        
        //6
        int highest = 0;
        char which = ' ';
        
        highest = a > highest ? a : highest;
        highest = b > highest ? b : highest;
        highest = c > highest ? c : highest;
        highest = d > highest ? d : highest;
        highest = e > highest ? e : highest;
        
        switch (highest){
            case 0: 
                System.out.println("yep e");
                break;
            case 1: 
                System.out.println("yep d");
                break;
            case 7: 
                System.out.println("yep b");
                break;
            case 5: 
                System.out.println("yep a and c tied");
                break;
	    default:
		System.out.println("none");
		break;
        }
        
        //7
        if(a+b == 10){
            System.out.println("yep ab");
        }
        if(a+c == 10){
            System.out.println("yep ac");
        }
        if(a+d == 10){
            System.out.println("yep ad");
        }
        if(a+e == 10){
            System.out.println("yep ae");
        }
        if(b+c == 10){
            System.out.println("yep bc");
        }
        if(b+d == 10){
            System.out.println("yep bd");
        }
        if(b+e == 10){
            System.out.println("yep be");
        }
        if(c+d == 10){
            System.out.println("yep cd");
        }
        if (c + e == 10){
            System.out.println("yep ce");
        }
        if(d+e == 10){
            System.out.println("yep de");
        }
        
        //8
        e = a < b ? a : b;
        System.out.println(e);
        
        //9
        switch (a){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("idk");
                break;
        }
        
        //10 true
        System.out.println( a==b || b>c );//t
        
        //11 false
        System.out.println( a<b ^ b>c);//f
        
        //12 nope
        if (c-a > e){
            System.out.println("Yep");
        }else{
            System.out.println("Nope"); //this
        }
        
        //13 none - nope
        if(a<e)
            System.out.println("13 Yep");
            System.out.println("13 Nope");
        
        
        //14 ok
        if (e>10) {
            if (a==5)System.out.println("Yep");
            else System.out.println("Nope");
            
        }
        System.out.println("OK");


    }
    
}
