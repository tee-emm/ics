package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */


import java.util.Scanner;

public class Q2Java {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the radius of your circle:");
    double doubleR = sc.nextInt();

    double doubleCirc = 2 * Math.PI * doubleR;

    System.out.println("The circumference of your circle is: " + doubleCirc);

    double doubleArea = Math.PI * Math.pow(doubleR,2);

    System.out.println("The area of your circle is: " + doubleArea);



    }
}
