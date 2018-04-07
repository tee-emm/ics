package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */

import java.util.Scanner;

public class Q8Java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter side length one of your triangle:");
        double doubleL1 = sc.nextDouble();

        System.out.println("Please enter side length two of your triangle:");
        double doubleL2 = sc.nextDouble();

        System.out.println("Please enter side length three of your triangle:");
        double doubleL3 = sc.nextDouble();

        double doubleS = (doubleL1 + doubleL2 + doubleL3) / 2;
        double doubleArea = Math.sqrt(doubleS*(doubleS - doubleL1)*(doubleS - doubleL2)*
                (doubleS - doubleL3));

        System.out.println("The area of your triangle is: " + doubleArea);


    }
}
