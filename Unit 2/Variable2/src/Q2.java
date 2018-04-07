import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by thomassmuir on 2017-10-14.
 */
public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Please enter any number of dollars from 15 to 1000:");
        double doubleDol = sc.nextDouble();

        double doubleNoT = doubleDol / 83.99;
        double doubleChg = doubleDol % 83.99;

        System.out.println("With $" + df.format(doubleDol) + ", you can purchase " + Math.floor(doubleNoT) + " ticket(s).");
        System.out.println("Your change is: $" + df.format(doubleChg) + ".");

    }
}
