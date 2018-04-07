import java.util.Scanner;

/**
 * File: MakeUppercase
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program which changes a String to its upper case
 * equivalent.
 *
 */
public class MakeUppercase {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;

        //Ask user for String
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();

        //Make all characters in String UpperCase
        System.out.print(userInput.toUpperCase());
    }
}