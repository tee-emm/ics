/**
 * Thomass Muir
 * Thursday, March 22, 2018
 * NumWords2.java
 * A program that asks the user to enter a line of text, and then outputs the number of words in the line of text.
 */
import java.util.Scanner;

public class NumWords2 {

    public static void main(String[] args){

        //Import Scanner
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter a String
        //Store String into a variable
        System.out.print("Enter a line of text: ");
        String userInput = sc.nextLine();

        //Change user input to Char Array
        userInput.toCharArray();

        //Initialize variable for word count
        //Initialize variable for prev char
        int wordSum = 1;
        char prevChar = 'a';

        //For loop to determine how many words there are
        //If there are too many spaces, don't count it as a word
        for (int i = 0; i < userInput.length(); i++){
            if (prevChar == ' ' && userInput.charAt(1) == ' ') {
                System.out.println("The prev char was a space. This will not be counted as a word");
            }
            else if (userInput.charAt(i) == ' '){
                wordSum++;
            }
            else {
                prevChar = userInput.charAt(i);
            }
        }

        //Print out the number of words in the line of text.
        System.out.print("You have entered " + wordSum + " word(s).");

    }

}
