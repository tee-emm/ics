import java.util.Scanner;

/**
 * File: AddUnicodes
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program which prompts the user for a String and then
 * prints out the sum of the Unicodes of each of the characters.
 *
 */
public class AddUnicodes {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;
        int numberCount = 0;

        //Ask user for String
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();

        //Adds each individual character according to Unicode
        for (int i = 0; i < userInput.length(); i++) {
            numberCount += (userInput.charAt(i));
        }
        System.out.print("The sum of the Unicodes for each of the characters is: " + numberCount);
    }
}
