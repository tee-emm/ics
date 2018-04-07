/**
 * Created by thomassmuir on 2018-02-26.
 */
import java.util.Scanner;

public class SameSum {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int[] valA = new int[10];
        int[] valB = new int[10];

        System.out.println("Please enter 10 int: ");

        for (int i = 0; i < 10; i++){
            valA[i] = sc.nextInt();
        }

        System.out.print("valA: ");

        for (int i = 0; i <10; i++){
            System.out.print(valA[i] + " ");
        }

        System.out.println();
        System.out.print("valB: ");

        for (int i = 0; i < 10; i++){
            valB[i] = 25 - valA[i];
            System.out.print(valB[i] + " ");
        }

    }

}
