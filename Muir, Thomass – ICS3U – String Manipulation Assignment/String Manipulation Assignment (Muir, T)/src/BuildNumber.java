import java.util.Scanner;

/**
 * File: BuildNumber
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that “builds” a new number by joining two
 * numbers entered by the user,
 * then outputs the result of the new number.
 *
 */
public class BuildNumber {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String number1;
        String number2;

        //Ask user for two numbers
        System.out.println("Please enter a number:");
        number1 = sc.nextLine();
        System.out.println("Please enter another number:");
        number2 = sc.nextLine();

        //Print new "built" number
        System.out.println("Your new number is: " + number1 + number2);
    }
}
