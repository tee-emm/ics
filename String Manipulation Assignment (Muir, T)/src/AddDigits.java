import java.util.Scanner;

/**
 * File: AddDigits
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that outputs the sum of each digit in a number
 * entered by the user.
 *
 */
public class AddDigits {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        int userInput;
        int addToTotal = 0;

        //Ask user for int
        System.out.println("Please enter a number:");
        userInput = sc.nextInt();

        //Repeat until the User Input == 0
        while (userInput!= 0){
            addToTotal += userInput % 10; //Finds last digit in current number, adds it to sum
            userInput/= 10; //Gets rid of last digit in current number
        }
        System.out.println("The sum of each digit in your number is: " + addToTotal);

    }
}
