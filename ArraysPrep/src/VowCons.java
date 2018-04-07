/**
 * Created by thomassmuir on 2018-02-22.
 */
import java.util.Scanner;

public class VowCons {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int vowelsCount = 0;
        int consCount = 0;

        System.out.println("Please enter a String:");

        String userInput = sc.nextLine().toLowerCase();

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                vowelsCount++;
            } else {
                consCount++;
            }
        }

        System.out.println(vowelsCount);
        System.out.print(consCount);

    }
}

