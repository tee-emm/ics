/**
 * Name: Thomass Muir, ICS3U
 * File: mySubstring.java
 * Description: Does the same thing as Substring.
 *
 */
public class mySubstring {

    public static void main (String[] args){

        System.out.print(mySubstring("hello", 1, 3));
    }

    public static String mySubstring (String s, int start, int end){

        //Declares new Empty String variable
        String word = "";

        //for loop that replaces Substring
        for (int i = start; i < end; i++){
            word += s.charAt(i);
        }

        //returns word variable
        return word;

    }

    public static String mySubstring (String s, int start){

        //Declares new Empty String variable
        String word = "";

        //for loop that replaces Substring
        for (int i = start; i < s.length(); i++){
            word += s.charAt(i);
        }

        //returns word variable
        return word;

    }
}
