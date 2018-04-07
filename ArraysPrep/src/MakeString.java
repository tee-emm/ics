/**
 * Created by thomassmuir on 2018-02-22.
 */
import java.util.Scanner;

public class MakeString {

    public static void main(String[] args) {

    String beginning, middle, end;

    Scanner sc = new Scanner(System.in);


    System.out.println("Please enter 3 words: ");

    beginning = sc.nextLine();
    middle = sc.nextLine();
    end = sc.nextLine();

    System.out.println(beginning.substring(0, beginning.length()/2) +
            middle.charAt(middle.length()/2) +
            end.substring(end.length()/2));


}
}
