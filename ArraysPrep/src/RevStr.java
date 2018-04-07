/**
 * Created by thomassmuir on 2018-02-22.
 */

import java.util.Scanner;

public class RevStr {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Please enter a sentence: ");
        String sentence = sc.nextLine();

        String[] wordArray = sentence.split(" ");

        for (int i = wordArray.length - 1; i >= 0; i--){
            System.out.print(wordArray[i] + " ");
        }

    }
}

