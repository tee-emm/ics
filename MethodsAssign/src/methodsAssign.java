/*
 * File: methodsAssign.java
 * Date: 04/09/18
 * Name: Thomass Muir
 * Description: Methods Assignment for ICS3U; methods galore! :)
 */
import java.util.Scanner;

public class methodsAssign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Import Scanner
        Scanner sc = new Scanner(System.in);

        //Calling for interestBalance method + determining the parameters
        interestBalance(200, 12, 3);

        //calling for square method (method that prints @ in square pattern)
        square(2);

        //calling for square method (method that prints parameter 'a' in square pattern)
        square(2, 'a');

        //printing out return of compareSticks method + determining parameters
        System.out.println(compareSticks(2, 3, 4));

        //printing out return of writeArea method + determining parameters
        System.out.println("The area of this rectangle is: " + (writeArea(15, 17)));

        //printing out return of noVowels method + determining parameters
        System.out.println(noVowels("DAVID wears glasses"));

        //calling for height method + determining the parameters
        height(6);

        //printing out return of numberOfDays method + determining parameter
        System.out.println(numberOfDays(4));

        //printing out return of leapYear method + determining parameter
        System.out.println(leapYear(2020));

        //printing out return of dayNumber method + determining parameters
        System.out.print(dayNumber(2004, 3, 1));

    }

    /*
     * void interestBalance method that accepts 3 parameters:
     * balance amount, current interest rate, and num. of years for saving;
     * Outputs the interest paid for the year, and the new balance
    */
    public static void interestBalance(double balAmt, double intRate, int yearsSave) {

        //Calculates the interest
        double interest = balAmt * (intRate / 100) * yearsSave;

        //Creates dbl variable newBal, which adds balAmt and Interest
        double newBal = balAmt + interest;

        //Prints the interest
        System.out.println("Your interest is: " + interest);

        //Prints the newBal
        System.out.println("Your new balance is: " + newBal);

    }

    /*
    * void square method that accepts 1 parameter:
    * int n, the dimensions of the square
    * Outputs a square with specified dimensions, with each char in square being '@'
    */
    public static void square(int n) {

        //nested for loop to print the square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    /*
    * void square method that accepts 2 parameters:
    * int n, the dimensions of the square; and char c, the character the square should print
    * Outputs a square with specified dimensions, with each char in square being char c
    */
    public static void square(int n, char c) {

        //nested for loop to print the square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    /*
    * compareSticks method that accepts 3 parameters:
    * the length of each stick (int stick1, int stick2, and int stick3)
    * returns String that states whether or not these sticks can form a triangle or not
    */
    public static String compareSticks(int stick1, int stick2, int stick3) {

        // if statement to determine if the length of two smaller sticks is greater than the final stick length
        if ((stick1 + stick2) < stick3 || (stick2 + stick3) < stick1 || (stick3 + stick1) < stick2) {
            return "The length of your sticks can form a triangle."; // returns String to confirm that it can form a triangle
        } else {
            return "The length of your sticks can't form a triangle."; // returns String to confirm that it can't form a triangle
        }
    }

    /*
    * writeArea method that accepts 2 parameters:
    * int length, the length of the rectangle; and int width, the width of the rectangle
    * calculates area of rectangle and returns it as an int
    */
    public static int writeArea(int length, int width) {

        //area of rectangle is calculated (length * width)
        int area = length * width;

        //returns area of rectangle
        return area;
    }

    /*
    * noVowels method that accepts 1 parameter:
    * String s, a parameter earlier determined in the code ("DAVID wears glasses")
    * Determines if there are vowels in the String, returns a new String without any of the original vowels
    */
    public static String noVowels(String s) {

        //Changes String s to Character Array
        s.toCharArray();

        //Creates new String woVow, sets it to nothing
        String woVow = "";

        //Determines if there are any vowels in the specified String
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a'
                    && s.charAt(i) != 'A'
                    && s.charAt(i) != 'e'
                    && s.charAt(i) != 'E'
                    && s.charAt(i) != 'i'
                    && s.charAt(i) != 'I'
                    && s.charAt(i) != 'o'
                    && s.charAt(i) != 'O'
                    && s.charAt(i) != 'u'
                    && s.charAt(i) != 'U') {
                woVow += s.charAt(i); //if character is not a vowel, add it to variable woVow
            }
        }

        //Returns String with woVow
        return "Your new String is: " + woVow;

    }

    /*
    * void height method that accepts 1 parameter:
    * int a, which outputs a triangle of asterisks based on the a value passed on
    * returns the printed triangle
    */
    public static void height (int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++){
                 System.out.print('*');
            }
            System.out.println("");
        }
    }

    /*
    * numberOfDays method that accepts 1 parameter:
    * int month, which determines what month it is in the year
    * returns the number of days in the specified month as an int
    */
    public static int numberOfDays (int month){

        //Creates new int variable numDays, sets it to 0
        int numDays = '0';

        //Switch statement to determine how many days are in each month
        switch (month){
            case 1: numDays = 31; break;
            case 2: numDays = 28; break;
            case 3: numDays = 31; break;
            case 4: numDays = 30; break;
            case 5: numDays = 31; break;
            case 6: numDays = 30; break;
            case 7: numDays = 31; break;
            case 8: numDays = 31; break;
            case 9: numDays = 30; break;
            case 10: numDays = 31; break;
            case 11: numDays = 30; break;
            case 12: numDays = 31; break;
        }

        //Returns number of days in specified month
        return numDays;

    }

    /*
    * leapYear method that accepts 1 parameter:
    * int year, the year that is specified earlier in the code (2020)
    * determines if year is a leap year and returns a boolean based on if it's true or false
    */
    public static boolean leapYear (int year){

        //if statement to determine if year is divisible by 100 but not divisible by 400
        if (year % 100 == 0 && year % 400 != 0){
            return false; //false; not a leap year
        }
        // else if year is perfectly divisible by 4
        else if (year % 4 == 0) {
            return true; //true; a leap year
        }
        else {
            return false; //false; otherwise, not a leap year
        }

    }

    /*
    * dayNumber method that accepts 3 parameters:
    * int month, which determines what month it is in the year (3 – March)
    * int year, the year that is specified earlier in the code (2004)
    * calculates the amount of days leading up to specified date
    * returns the number as an int
    */
    public static int dayNumber (int year, int month, int day){

        //if statement to determine if any of the parameters isn't valid
        // returns an Error message if it's not.
        if (day < 0 || month < 0 || month > 12 || year < 0 || day > 31) {
            System.out.println("Error.");
            return 0;
        }

        //creates new variable dayInYear, sets to 0
        int dayInYear = 0;

        //in line if statement to add on an extra day if it is, in fact, a leap year
        day = (leapYear(year) && month > 2)? day+1 : day;

        //for loop to determine up number of days, and add it to variable dayInYear
        for (int i = 1; i < month; i++){
            dayInYear += numberOfDays(i);
        }

        //adds on the extra day if it is a leap year
        //leaves the same if it's not
        dayInYear += day;

        //return dayInYear variable
        return dayInYear;

    }

}


