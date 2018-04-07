/**
 * Name: Thomass Muir, ICS3U
 * File: alarm.java
 * Description: Prints "Alarm!" several times on separate lines,
 * and prints an error message if the parameter is less than 1.
 */
public class Alarm {

    public static void main (String[] args){

        alarm(0);

    }

    public static void alarm (int howMany) {

        //print Alarm! for int howMany number of times
        if (howMany > 1){
            for (int i = 0; i < howMany; i++) {
                System.out.println("Alarm!");
            }
        }
        //otherwise, print Error
        else {
            System.out.println("Error");
        }
    }

}
