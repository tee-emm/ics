/**
 * Created by thomassmuir on 2018-02-22.
 */

import java.util.Random;

public class LocatingLargest {

    public static void main (String[] args){

        Random ran = new Random();

        int [] ranNum = new int[10];
        int largerNum = 0;
        int slot = 0;

        System.out.print("Array: ");

        for (int i = 0; i < 10; i++){
            int x = 1 + ran.nextInt(100);
            ranNum[i] = x;
            System.out.print(ranNum[i] + " ");
        }

        for (int i = 0; i < 10; i++){
            if(ranNum[largerNum] < ranNum[i]){
                largerNum = i;
                slot = i;
            }
        }

        System.out.println("");
        System.out.println("The largest value is: " + ranNum[largerNum]);
        System.out.println("It is in slot: " + slot);
    }

}
