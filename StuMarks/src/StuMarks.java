/**
 * Thomass Muir
 * Thursday, March 22, 2018
 * StuMarks.java
 * A program that asks the user for the number of students in a class.
 * The program will the prompt the user for their student numbers, as well as all of their marks.
 * If the student user cannot be found, tell the user that the student does not exist.
 *
 */
import java.util.Scanner;

public class StuMarks {

    public static void main (String[] args){

        //Import Scanner
        Scanner sc = new Scanner (System.in);

        //Prompt user for number of students
        //Input into variable
        System.out.print("How many students are in your class? ");
        int numOfStudents = sc.nextInt();

        //Initialize array with the number of students
        int[] stuNum = new int[numOfStudents];

        //Prompt user for student numbers
        System.out.println("Enter 4-digit student numbers: ");

        //For loop to input each student number into a variable
        for (int i = 0; i < numOfStudents; i++){
            stuNum [i] = sc.nextInt();
        }

        //Prompt user for student marks
        System.out.println("You will now be prompted to enter their marks: ");

        //Initialize array for student marks
        int[] marks = new int[numOfStudents];

        //For loop to input each student mark into a variable
        for (int i = 0; i < numOfStudents; i++){
            System.out.println("Student with student number " + stuNum[i] + " has a mark of: ");
            marks[i] = sc.nextInt();
        }

        //Prompt user to enter a student number
        System.out.print("Enter a student number: ");
        int userInput = sc.nextInt();

        //For loop to determine if student number exists, and then output a percentage
        for (int i = 0; i <numOfStudents; i++){
            if (stuNum[i] == userInput){
                System.out.print("A student with student number " + userInput + " has obtained " +  marks[i] + "%.");
            }
            else if (i == numOfStudents - 1 && stuNum[i] != userInput){
                System.out.print("Sorry, the student does not exist.");
            }
        }



    }

}

