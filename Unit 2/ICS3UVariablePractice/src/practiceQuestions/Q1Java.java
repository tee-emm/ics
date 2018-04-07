package practiceQuestions;

/**
 * Created by thomassmuir on 2017-09-27.
 */
public class Q1Java {

    public static void main(String[] args){

        int intA, intB;

        intA = 17;
        intB = 13;

       int intSum = intA + intB;
       int intDiff = intA - intB;
       int intProd = intA * intB;
       int intMod = intA % intB;

        System.out.println("Integer 'a' is: " + intA);
        System.out.println("Integer 'b' is: " + intB);
        System.out.println("The sum of integers 'a' and 'b' is: " + intSum);
        System.out.println("The difference of integers 'a' and 'b' is: " + intDiff);
        System.out.println("The product of integers 'a' and 'b' is: " + intProd);
        System.out.println("The modulus of integers 'a' and 'b' is: " + intMod);

    }
}
