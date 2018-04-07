/**
 * Created by thomassmuir on 2018-02-22.
 */
import java.util.Scanner;
import java.util.Random;

public class IsItThereOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ranNum = new int[10];

        Random ran = new Random();

        for (int i = 0; i < 10; i++) {
            int x = 1 + ran.nextInt(100);
            ranNum[i] = x;
            System.out.println("Slot " + i + " contains a " + ranNum[i]);
        }

        System.out.print("Enter an integer :");
        int userInput = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (ranNum[i] == userInput) {
                System.out.print(userInput + " is in the array");
            }


        }
    }
}