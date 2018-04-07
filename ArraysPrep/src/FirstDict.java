/**
 * Created by thomassmuir on 2018-02-22.
 */

import java.util.Scanner;

public class FirstDict {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstString;
        String[] wordArray = new String[4];

        System.out.println("Enter 4 words:");
        wordArray[0] = sc.nextLine().toLowerCase();
        wordArray[1] = sc.nextLine().toLowerCase();
        wordArray[2] = sc.nextLine().toLowerCase();
        wordArray[3] = sc.nextLine().toLowerCase();

        firstString = wordArray[0];

        for (int i = 1; i < wordArray.length; i++) {
            if (firstString.compareTo(wordArray[i]) > 0) {
                firstString = wordArray[i];
            }
        }
        System.out.print(firstString);
    }
}

