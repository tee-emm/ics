package sqrt;
import java.util.Scanner;

/**
 *
 * @author 324921162
 * Muir, Thomass
 * ICS3U || Jeganathan
 * December 07, 2017
 * Program to calculate the square root of any number to close accuracy
 *
 */
public class Sqrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Scanner
        Scanner sc = new Scanner (System.in);

        //Ask user for input
        System.out.println("Please input a number to calculate square root:");
        int intNumber = sc.nextInt();

        //Set First guess to 1.0
        double dblThisGuess = 1.0;

        //Counter to determine guess number
        int intCount = 1;

        //Declare variables for the difference, and the next guess
        double dblDifference;
        double dblNextGuess;

        //Print the first guess, which is always 1.0
        System.out.println("Guess " + intCount + ": " + dblThisGuess);

        //While loop to keep program running until it reaches 10
        //Calculate the next guess using the correct formula
        //Print each guess to keep trach
        //if sqrt is achieved, print the final guess
        while(intCount <= 10){
            intCount++;
            dblNextGuess = 0.5 * (dblThisGuess + (intNumber/dblThisGuess));
            dblDifference = dblNextGuess - dblThisGuess;
            if(dblDifference <= 0.001 && dblDifference >= 0 || dblDifference >=-0.001 && dblDifference <= 0){
                System.out.println("Guess " + intCount + ": " + dblNextGuess + "\n" + dblNextGuess + " is our final guess for the square root of " + intNumber);
                intCount = 11;
            }
            // if intCount ever reaches 10
            else if (intCount == 10){
                System.out.println("-1.0");
            }
            //if sqrt isn't achieved, calculate the next ThisGuess number
            //Print the guess number
            else {
                dblThisGuess = dblNextGuess;
                System.out.println("Guess " + intCount + ": " + dblThisGuess);
            }

        }

    }

}
