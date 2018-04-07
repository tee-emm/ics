/*
 * File:
 * Date:
 * Name:
 * Description:
 */
import java.util.Scanner;

public class methodsAssign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        interestBalance(200, 12, 3);
        square(2);
        square(2, 'a');
        System.out.println(compareSticks(2, 3, 4));
        System.out.println("The area of this rectangle is: " + (writeArea(15, 17)));
        System.out.println(noVowels("DAVID wears glasses"));
        height(6);
        System.out.println(numberOfDays(4));
        System.out.println(leapYear(2020));
        System.out.print(dayNumber(2004, 3, 1));

    }

    public static void interestBalance(double balAmt, double intRate, int yearsSave) {

        double interest = balAmt * (intRate / 100) * yearsSave;

        double newBal = balAmt + interest;

        System.out.println("Your interest is: " + interest);

        System.out.println("Your new balance is: " + newBal);

    }

    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void square(int n, char c) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    public static String compareSticks(int stick1, int stick2, int stick3) {

        if ((stick1 + stick2) < stick3 || (stick2 + stick3) < stick1 || (stick3 + stick1) < stick2) {
            return "The length of your sticks can form a triangle.";
        } else {
            return "The length of your sticks can't form a triangle.";
        }
    }

    public static int writeArea(int length, int width) {

        int area = length * width;

        return area;
    }

    public static String noVowels(String s) {

        s.toCharArray();

        String woVow = "";

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
                woVow += s.charAt(i);
            }
        }

        return "Your new String is: " + woVow;

    }

    public static void height (int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++){
                 System.out.print('*');
            }
            System.out.println("");
        }
    }

    public static int numberOfDays (int month){

        int numDays = '0';
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

        return numDays;

    }

    public static boolean leapYear (int year){

        if (year % 100 == 0 && year % 400 != 0){
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public static int dayNumber (int year, int month, int day){

        if (day < 0 || month < 0 || month > 12 || year < 0 || day > 31) {
            System.out.println("Error.");
            return 0;
        }

        int dayInYear = 0;

        day = (leapYear(year) && month > 2)? day+1 : day;

        for (int i = 1; i < month; i++){
            dayInYear += numberOfDays(i);
        }

        dayInYear += day;

        return dayInYear;

    }

}


