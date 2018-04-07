import java.util.Scanner;

/**
 * File: Reverse
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that prints the reverse String
 * of a String entered by the user.
 *
 */
public class Reverse {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;
        String reverseInput;

        //Ask user for string
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();

        //Reverse userInput
        reverseInput = new StringBuffer(userInput).reverse().toString();

        //Print reverse
        System.out.print(reverseInput);

        }
    }
