/**
 * Name: Thomass Muir, ICS3U
 * File: perfectSquare.java
 * Description: returns true if its non-negative integer parameter is a perfect square.
 *              Otherwise, it should return false.
 *
 */

public class perfectSquare {

    public static void main(String[] args) {

        System.out.println(perfectSquare(9));
        System.out.print(perfectSquare(12));

    }

    public static boolean perfectSquare(int n) {

        //return false if int n is less than 0
        //and therefore cannot have a perfect square
        if (n < 0)
            return false;

        //Assign the squareroot of int n to new variable int sqrt
        int sqrt = (int) Math.sqrt(n);

        //if int sqrt multiplied by itself is the same as int n
        //n is a perfect square number
        //and return true
        return(sqrt * sqrt == n);




    }
}
