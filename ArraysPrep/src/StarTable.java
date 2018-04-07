/**
 * Created by thomassmuir on 2018-03-21.
 */
import java.util.Scanner;

public class StarTable {

    public static void main (String[] args){

        Scanner sc  = new Scanner (System.in);
        //int input = sc.nextInt();
        char[][] stars = new char[sc.nextInt()][sc.nextInt()];
        for(int i = 0; i < stars.length; i++){
            for(int j = 0; j < stars[0].length; j++) {
                stars[i][j] = '*';
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }

    }

}
