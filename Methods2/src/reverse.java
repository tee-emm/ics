/**
 * Name: Thomass Muir, ICS3U
 * File: reverse.java
 * Description: Returns a string whose value is the reverse of s.
 *
 */
public class reverse {

    public static void main (String[] args){

        System.out.print(reverse("hello"));
    }

    public static String reverse (String s){

        //Empty string to add on to
        String reverse = "";

        //Change String s to Char Array
        //Using for loop, create new string of reversed Chars
        s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i --){
            reverse = reverse + s.charAt(i);
        }
        //Returns reversed string
        return reverse;

    }

}
