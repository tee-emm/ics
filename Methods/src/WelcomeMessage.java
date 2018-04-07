/**
 * Name: Thomass Muir, ICS3U
 * File: welcomeMessage.java
 * Description: Returns welcome message that includes user's name and visitor number.
 *
 */

public class WelcomeMessage {

    public static void main(String[] args){

        System.out.print(welcomeMessage("Joe", 5));

    }

    public static String welcomeMessage (String name, int visitorNum){

        //Return String that will call on name variable declared earlier in the main method
        // As well as the visitorNum variable
        return "Welcome " + name + "! You are visitor number " + visitorNum + ".";
    }

}
