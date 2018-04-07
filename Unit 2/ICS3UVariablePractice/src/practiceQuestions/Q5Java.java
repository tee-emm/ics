 package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */

import java.util.Scanner;

public class Q5Java {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number of hours:");
        int intH = sc.nextInt();

        int intD = intH / 24;
        int intRem = intH % 24;

        System.out.println("That is: " + intD + " day(s), and " + intRem + " hour(s).");




    }
}
