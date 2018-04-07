/**
 * Name: Thomass Muir, ICS3U
 * File: sameReverse.java
 * Description: Returns true if the value of String s and the "reversed" value of s are the same.
 *              Otherwise, it returns false.
 *
 */
public class sameReverse {

    public static void main (String[] args){

        System.out.println(sameReverse("boo"));
        System.out.print(sameReverse("ooo"));

    }

    public static boolean sameReverse (String s){

        //Empty string to add on to
        String reverse = "";

        //Change String s to Char Array
        //Using for loop, create new string of reversed Chars
        s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i --){
            reverse = reverse + s.charAt(i);
        }

        //Return true if reversed String is the same as original String
        return (reverse.equals(s));

    }

}
