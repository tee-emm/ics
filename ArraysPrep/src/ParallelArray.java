/**
 * Created by thomassmuir on 2018-02-25.
 */
import java.util.Scanner;

public class ParallelArray {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        String[] lastNames = {"Mitchell", "Odis", "Luu", "Zimmerman", "Brooks"};
        double [] gpa = {99.5, 78.5, 95.6, 96.8, 82.7};
        int [] studentNum = {123456, 813225, 823669, 307760, 82717};

        System.out.println("Values:");

        for (int i = 0; i < 5; i++){
            System.out.println("\t" + lastNames[i] + " " + gpa[i] + " " + studentNum [i]);
        }

        System.out.println();

        System.out.print("ID Number to find: ");
        int idNumber = sc.nextInt();

        System.out.println();

        for (int i = 0; i < 5; i++){
            if (studentNum[i] == idNumber){
                System.out.println("Found in slot " + i);
                System.out.println("\tName: " + lastNames[i]);
                System.out.println("\tAverage: " + gpa[i]);
                System.out.println("\tID: " + studentNum[i]);
            }
            else {
               idNumber = 0;
            }
        }
        if (idNumber == 0){
                System.out.println("Sorry, this ID number is not in the array.");
        }

    }


}
