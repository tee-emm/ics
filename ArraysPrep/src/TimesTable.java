
import java.util.Scanner;

public class TimesTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] timesTable = new int[13][13];

        for(int i = 1; i < 13; i++){
            timesTable[i][0] = i;
            timesTable[0][i] = i;
            for(int j = 1; j < 13; j++){
                timesTable[i][j] = j*i;
            }
        }

        for(int i = 0; i < 13; i++){
            for(int j = 0; j < 13; j++){
                System.out.print(timesTable[i][j] != 0 ? timesTable[i][j] + "\t" : " \t");
            }
            System.out.println();
        }

    }


}
