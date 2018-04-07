import java.util.Scanner;

/**
 * File: Half
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A programs that asks the user for a String and breaks it in half,
 * printing the first half on one line and the last half on another.
 * (method: substring)
 *
 */
public class Half {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;
        int midOfStr;

        //Ask user for string
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();

        //Determine the middle of the string
        midOfStr = userInput.length() / 2;

        //Print first half of String on one line
        //Print second half of String on next line
        System.out.println(" ");
        System.out.println(userInput.substring(0, midOfStr));
        System.out.println(userInput.substring(midOfStr));

    }
}