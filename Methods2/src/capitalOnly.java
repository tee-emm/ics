/**
 * Name: Thomass Muir, ICS3U
 * File: capitalOnly.java
 * Description: Returns a string whose value is the same as the value in String s
 *              but with capital letters only.
 *
 */
public class capitalOnly {

    public static void main (String[] args){

        System.out.print(capitalOnly("EVAN Z. Must Wear Glasses!"));
    }

    public static String capitalOnly (String s){

        //Declare variable empty String onlyCaps
        String onlyCaps = "";

        //Turn String s to Char Array
        s.toCharArray();

        //Use for loop to determine if char at i is capitalized
        //If so, add to variable onlyCaps
        for (int i = 0; i < s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                onlyCaps = onlyCaps + s.charAt(i);
            }
        }

        //Return String onlyCaps
        return onlyCaps;


    }

}
