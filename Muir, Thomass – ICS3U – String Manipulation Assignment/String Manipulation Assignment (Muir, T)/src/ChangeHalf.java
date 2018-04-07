import java.util.Scanner;

/**
 * File: ChangeHalf
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that interchanges the first and the second half of
 * the string entered by user. If the string has even length,
 * the middle character does not move.
 *
 */
public class ChangeHalf {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;
        String firstHalf, secondHalf;
        int midOfStr;
        char middleLetter;

        //Ask user for String
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();

        //If userInput does not have an even amount of Characters
        //Leave the middle char alone
        //Switch the first and second half of the String
        if (userInput.length() % 2 != 0){
            middleLetter = userInput.charAt(userInput.length()/2);
            midOfStr = userInput.length() / 2;
            firstHalf = userInput.substring(0, midOfStr);
            secondHalf = userInput.substring(midOfStr + 1);
            System.out.print(secondHalf + middleLetter + firstHalf);
        }
        else { //If userInput has an even amount of characters, only switch the halves
            midOfStr = userInput.length() / 2;
            firstHalf = userInput.substring(0, midOfStr);
            secondHalf = userInput.substring(midOfStr);
            System.out.print(secondHalf + firstHalf);
        }
    }
}
