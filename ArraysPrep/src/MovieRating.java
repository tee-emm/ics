/**
 * Created by thomassmuir on 2018-02-25.
 */
import java.util.Scanner;

public class MovieRating {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

            int[][] movie = {{4, 6, 2, 5}, {7, 9, 4, 8}, {6, 9, 3, 7}};

            System.out.println("Which movie are you interested in? (Choose from movie 0, 1, 2, 3)");
            int userInput = sc.nextInt();

            int sum = 0;

            for (int i = 0; i < 3; i ++){
                sum += movie[i][userInput];
            }

            System.out.print("The movie " + userInput + " has an average rating of " + sum/3);



    }

}
