/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3usep25variabledemo;

/**
 *
 * @author Nanthi
 */
public class ICS3USep25VariableDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaring an Integer Variable 
        int age ; //age is declared as an Integer
        // variable
        //assigning value to the variable age
        age = 4;//age is assigned a value of 4
        System.out.println("age :"+ age);
        age = 10; 
        System.out.println("age :"+ age);
        
        //How larger an Integer is???
        int worldpopulation = 2147483647;
        int largestnegative = -2147483648;
        
        //If we have multiple variable
        // with same data type we can declare them
        //commoa separated in the same line
        int a,b,c,d,e,f;
        //Naming convention for variable******
        //declare an integer variable to
        // store number of students in a class
        int intNumOfStudents;
        /**
         * int inta = 10;
         * int intb = 20;
         * inta = intb;
         * intb = inta;
         */
        
        //Declaring a Double Data Type in Java
        double dblPrice = 13.99;
        
        //the double data type can store an Integer
        //but not otherway around
        double dblHST = 13;
        System.out.println("HST: "+dblHST);
        
        //We can convert a double variable into 
        // integer variable this process is called
        //Type Casting
         int intSalesTax = (int)(13.99);
         //Type Casting won't do any rounding at all
         //Tyepcast from double to into simply
         //truncate the decimal portion
         System.out.println(intSalesTax);
         
         //Declaring a Variable to Store Strings
         String strName = "James Gosling";
         
        
    }
    
}
