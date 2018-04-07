/**
 * Name: Thomass Muir, ICS3U
 * File: SumRange.java
 * Description: Accepts two integer parameters that represent a range such as 50 to 75.
 *              Issues an error message and return zero if the second parameter is less than the first.
 *              Otherwise, the method should return the sum of the integers in that range (inclusive).
 */
public class SumRange {

    public static void main(String[] args) {

        System.out.print(sumRange(2, 4));

    }

    public static int sumRange(int low, int high) {

        //Declare int variable sum
        int sum = 0;

        //if int high is greater than int low, add i to sum
        if (high > low) {
            for (int i = low; i <= high; i++) {
                sum += i;
            }
        } else { //otherwise, print Error
            System.out.print("Error lol.");
        }
        //return variable sum
        return sum;


    }
}