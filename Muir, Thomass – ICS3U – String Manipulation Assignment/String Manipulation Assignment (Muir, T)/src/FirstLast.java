import java.util.Scanner;

/**
 * File: FirstLast
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that prints out the 1st and last character
 * of a string entered by the user. (method charAt)
 *
 */
public class FirstLast {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;

        //Ask user for string
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();

        //Print first and last character of the String
        System.out.println("The first character of the String is: " + userInput.charAt(0) +
                            "\nThe last character of the String is: " + userInput.charAt(userInput.length() - 1));

    }
}
