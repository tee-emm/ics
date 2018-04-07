/**
 * Created by thomassmuir on 2017-12-07.
 */
import java.util.Scanner;

/**
 *
 * @author 324921162
 * Muir, Thomass
 * ICS3U || Jeganathan
 * December 07, 2017
 * A program that takes a 9-digit integer as a command line argument, computes the checksum, and prints out the 10-
    digit ISBN number. It's ok if you don't print out any leading 0s.
 *
 */


public class Checksum {

        public static void main(String[] args) {
            //Declare Scanner
            Scanner sc = new Scanner (System.in);

            //Ask for user input
            System.out.print("Enter 9 digits of an ISBN: ");
            int intISBN= sc.nextInt();

            //Determine the place number of the user-inputed ISBN
            int intd1 = intISBN / 100000000;
            int remainingDigits = intISBN % 100000000;
            int intd2 = remainingDigits / 10000000;
            remainingDigits %= 10000000;
            int intd3 = remainingDigits / 1000000;
            remainingDigits %= 1000000;
            int intd4 = remainingDigits / 100000;
            remainingDigits %= 100000;
            int intd5 = remainingDigits / 10000;
            remainingDigits %= 10000;
            int intd6 = remainingDigits / 1000;
            remainingDigits %= 1000;
            int intd7 = remainingDigits / 100;
            remainingDigits %= 100;
            int intd8 = remainingDigits / 10;
            remainingDigits %= 10;
            int intd9 = remainingDigits;

            //Calculate d10
            int intd10 = (intd1 + intd2 * 2 + intd3 * 3 + intd4 * 4 + intd5 * 5
                    + intd6 * 6 + intd7 * 7 + intd8 * 8 + intd9 * 9) % 11;

            //Print ISBN number
            if (intd10 == 10) {
                System.out.println("The ISBN-10 number is " + intd1 + intd2 + intd3 + intd4 + intd5
                        + intd6 + intd7 + intd8 + intd9 + "X");
            }
            else {
                System.out.print("The ISBN-10 number is " + intd1 + intd2 + intd3 + intd4 + intd5
                        + intd6 + intd7 + intd8 + intd9 + intd10);
            }
        }

    }

