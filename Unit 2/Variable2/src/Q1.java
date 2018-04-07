import java.util.Scanner;

/**
 * Created by thomassmuir on 2017-10-14.
 */
public class Q1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any number of seconds from 999 to 9999:");
        int intSecs = sc.nextInt();

        int intHours = intSecs / 3600;
        int intMinutes = (intSecs % 3600) / 60;
        int intRem = (intSecs % 3600) % 60;

        System.out.println("The number of seconds is " + intSecs + ".");
        System.out.println("There are " + intHours + " hour(s), " + intMinutes + " minute(s), and " + intRem + " second(s).\n");

    }

    }
