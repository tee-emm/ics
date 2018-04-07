package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */

import java.util.Scanner;

public class Q7Java {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter side length one of your triangle:");
        double doubleS1 = sc.nextDouble();

        System.out.println("Please enter side length two of your triangle:");
        double doubleS2 = sc.nextDouble();

        double doubleHyp = Math.pow(doubleS1,2) + Math.pow(doubleS2,2);

        System.out.println("Your hypotenuse is: " + doubleHyp);


    }
}
