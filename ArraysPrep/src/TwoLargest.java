/**
 * Created by thomassmuir on 2018-02-26.
 */
import java.util.Random;

public class TwoLargest {

    public static void main (String[] args){

        int [] ranNum = new int[10];

        Random ran = new Random();

        for (int i = 0; i < 10; i++){
            int x = 1 + ran.nextInt(100);
            ranNum [i] = x;
            System.out.print(ranNum[i] + " ");
        }

        int largestElement = 0;
        int nextElement = 0;

        for (int i = 0; i < 10; i++){
            if (ranNum[i] > largestElement){
                largestElement = ranNum[i];
            }
        }

        for (int i = 0; i < 10; i++){
            if (ranNum[i] > nextElement && ranNum[i] != largestElement){
                nextElement = ranNum[i];
            }
        }

        System.out.println();
        System.out.println("Largest element: " + largestElement);
        System.out.print("Second largest element: " + nextElement);
    }

}
