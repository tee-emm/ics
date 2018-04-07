package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */

import java.util.Scanner;

public class Q3Java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a degree in Celsius:");
        double doubleC = sc.nextDouble();

        double doubleF = doubleC * 9 / 5 + 32;

        System.out.println("This temperature in fahrenheit is: " + doubleF + "°F.");


    }


}
