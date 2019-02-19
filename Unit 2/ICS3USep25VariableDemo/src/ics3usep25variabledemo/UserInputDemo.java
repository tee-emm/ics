/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3usep25variabledemo;
import java.util.Scanner;
/**
 *
 * @author Nanthi
 */
public class UserInputDemo {
    public static void main(String [] args){
        //Declaring the Scanner to read inputs
     Scanner input = new Scanner(System.in);
     
     int intAge;
     double dblPrice;
     //Let's read an input from the user for both
     //intAge and dblPrice from the keyboard
     intAge = input.nextInt();
     dblPrice = input.nextDouble();
     
     System.out.println("intAge "+ intAge);
     System.out.println("dblPrice "+ dblPrice);
    }
}
