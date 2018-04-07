/**
 * Name: Thomass Muir, ICS3U
 * File: evenlyDivisible.java
 * Description: Method that accepts two integer parameters and returns true if the
 *              first parameter can be evenly divided by the second, or vice verse,
 *              and false if it can't be. Return false if either parameter is zero.
 */
public class evenlyDivisible {

    public static void main (String[] args){

        System.out.print(evenlyDivisible(4, 2));

    }

    public static boolean evenlyDivisible (int arg1, int arg2){

        return (arg1 % arg2 ==  0 || arg2 % arg1 == 0) && (arg1 != 0 && arg2 != 0);

    }

}
