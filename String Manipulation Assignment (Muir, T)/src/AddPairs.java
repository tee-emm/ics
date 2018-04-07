import java.util.Scanner;

/**
 * File: AddPairs
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that divides a number entered by the users into a
 * set of two digits numbers (if the number has odd number of digits, the last number is
 * only one digit), then outputs the sum of the set of numbers.
 *
 */
public class AddPairs {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;
        int interval = 2;
        int possibleStrings;
        int place = 0;
        int sum = 0;

        //Ask user for String
        System.out.println("Please enter a number:");
        userInput = sc.nextLine();

        //Parses String into int
        int userInt = Integer.parseInt(userInput);

        //Determine how many pairs of numbers there are in digit
        possibleStrings = userInput.length() / interval;

        //Repeat until there are no pairs of numbers left
        //Add pairs
        while (possibleStrings != 0) {
            String newPair = userInput.substring(place, place + 2);
            sum += Integer.parseInt(newPair);
            place += 2;
            possibleStrings--;
        }
        //If there's an odd number of digits, add last number and print sum
        //Else, just pring sum
        if (userInput.length() % 2 != 0) {
            sum += userInt % 10;
            System.out.println("\nThe sum of each digit in your number is: " + sum);
        } else {
            System.out.println("\nThe sum of each digit in your number is: " + sum);
        }
    }
}

