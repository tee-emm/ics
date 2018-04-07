import java.util.Scanner;

/**
 * File: HiddenPassword
 * Created: February 12, 2018
 * Author: Thomass Muir
 *
 * A program that accepts a String of characters and
 * prints out a String with the same number of characters,
 * with all characters except the space, replaced by the given character.
 *
 */
public class HiddenPassword {

    public static void main(String[] args) {

        //Import scanner
        Scanner sc = new Scanner(System.in);

        //Declare variables
        String userInput;
        char userChar;
        char[] wordArray;

        //Ask user for String
        System.out.println("Please enter a String:");
        userInput = sc.nextLine();
        wordArray = userInput.toCharArray(); //Make String into char Array

        //Ask user for char
        System.out.println("Please enter a character:");
        userChar = sc.next().charAt(0);

        //for loop to replace each character with given char
        //leaves spaces as is
        for (int i = 0; i < userInput.length(); i++) {
            if (wordArray[i] == ' '){
                System.out.print(" ");
            }
            else {
                System.out.print(userChar);
            }
        }
    }
}
