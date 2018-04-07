/**
 * Name: Thomass Muir, ICS3U
 * File: notLetter.Java
 * Description: Returns true if char c is not a letter, otherwise returns false
 */
public class notLetter {

    public static void main(String[] args) {

        System.out.println(notLetter('c'));
        System.out.print(notLetter('1'));
    }

    public static boolean notLetter(char c) {

        //Return true if char c is a letter
        return (Character.isLetter(c));

    }
}
