import java.util.Scanner;

/**
 * File: Encrypt
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that encrypts user-inputed Strings to match the following criteria:
 * first and last character of each string are exchanged.
 * middle characters of each string are shifted to the character two after it in the ASCII
 * table (works for non-letters as well.)
 * spaces are left alone
 *
 *
 */
public class Encrypt {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;
        String[] wordArray;

        //Ask user for String
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();

        //Split String according to how many words there are
        wordArray = userInput.split(" ");

        //Nested for loop through each word then perform encryption
        for(int i = 0; i < wordArray.length; i++) {

            //Variables to determine first and last char of String
            char firstLetter;
            char lastLetter;

            firstLetter = wordArray[i].charAt(0);
            lastLetter = wordArray[i].charAt(wordArray[i].length() - 1);

            //Variable for middle chars
            //Set String to nothing
            String midChars = "";

            //Encrypt middle chars
            for (int j = 1; j < wordArray[i].length() - 1; j++){
                midChars += (char)(wordArray[i].charAt(j) + 2);
            }

            //Print out encryption
            System.out.print(lastLetter + midChars + firstLetter + " ");

        }
    }
}
