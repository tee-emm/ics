package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */

import java.util.Scanner;

public class Q6Java {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number of minutes:");
        int intM = sc.nextInt();

        int intD = intM / 1440;
        int intH = (intM % 1440) / 60;
        int intRem = (intM % 1400) % 60;

        System.out.println("That is: " + intD + " day(s), " + intH +
                " hour(s), and " + intRem + " minute(s).");



    }

}
