/**
 * Created by thomassmuir on 2018-02-25.
 */
import java.util.Random;

public class SortArrays {

    public static void main(String[] args){

        int[] ranNum = new int [10];

        Random ran = new Random();

        System.out.print("before: [");

        for (int i = 0; i < 10; i ++){
            int x = 1+ran.nextInt(100);
            ranNum[i] = x;
            System.out.print(ranNum[i] + (i == 9? "": ", "));
        }
        System.out.println("]");

        while(true){
            for (int i = 0; i < ranNum.length; i++){

            }
        }

    }
}
