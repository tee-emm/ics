/**
 * Created by thomassmuir on 2018-02-26.
 */
import java.util.Scanner;

public class SelfReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the size of the array?");
        int arraySize = sc.nextInt();

        int [] array = new int[arraySize];

        System.out.println("Please enter the required amt of ints:");

        for (int i = 0; i < arraySize; i++){
            array [i] = sc.nextInt();
        }

        int[] newArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++){
            newArray [i] = array[arraySize - 1 - i];
        }

        System.out.print("Reverse Array: ");

        for (int i = 0; i < arraySize; i++){
            System.out.print(newArray[i] + " ");
        }




    }
}
