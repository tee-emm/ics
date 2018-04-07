package primecounter;

/**
 *
 * @author 324921162
 * Muir, Thomass
 * ICS3U || Jeganathan
 * December 07, 2017
 * Read a positive integer n from the user and count the number of prime
 * numbers less than or equal to n
 *
 *
 */

import java.util.Scanner;

public class PrimeCounter {

    public static void main(String[] args) {
        //Declare Scanner
        Scanner sc = new Scanner(System.in);

        //Ask user for input
        //Declare variables
        System.out.println("Enter a number:");
        int intN = sc.nextInt();
        int intPrimeCount = 0; //Variable for prime count
        int intPrime; //Variable to check if prime number
        int i, j;

        for (i = 2; i < intN; i++) {
           intPrime = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    intPrime = 1; //Not a prime
                }
                if (intPrime == 0) {
                    intPrimeCount++; //Add to prime count
                }
            }
            System.out.println("Number of primes before N: " + intPrimeCount);
        }

    }



