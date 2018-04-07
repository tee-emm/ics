package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */

import java.util.Scanner;

public class Q4Java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a distance in kilometers:");
        double doubleK = sc.nextInt();

        double doubleM = doubleK/1.609344;

        System.out.println("This distance in miles is: " + doubleM + " miles.");

    }
}
