package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */

import java.util.Scanner;

public class Q9Java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter side length one of your triangle:");
        double doubleL1 = sc.nextDouble();

        System.out.println("Please enter side length two of your triangle:");
        double doubleL2 = sc.nextDouble();

        System.out.println("Please enter the contained angle:");
        double doubleCA = sc.nextDouble();

        double doubleL3 = Math.pow((Math.pow(doubleL1,2) + Math.pow(doubleL2 , 2)
                          - 2 * doubleL1 * doubleL2 * Math.cos(Math.toRadians(doubleCA))), 0.5);

        System.out.println("Your third side is: " + doubleL3);

    }
}
