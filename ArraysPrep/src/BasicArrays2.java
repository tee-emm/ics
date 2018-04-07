/**
 * Created by thomassmuir on 2018-02-22.
 */

import java.util.Random;

public class BasicArrays2 {

    public static void main (String[] args){

        int[] ranNum = new int [10];

        Random ran = new Random();

        for (int i = 0; i < 10; i ++){
            int x = 1+ran.nextInt(100);
            ranNum[i] = x;
            System.out.println("Slot " + i + " contains a " + ranNum[i]);

        }

    }
}
