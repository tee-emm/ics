import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by thomassmuir on 2019-02-18.
 */
public class BoardCreator {

    static Integer[][] board = new Integer[9][9];


    public static void generateBoard(){

        for (int i = 0; i < 9; i ++){
            Arrays.fill(board[i], 0);
        }


        fillBoard();
        for (int i = 0; i < 9; i ++){
            System.out.println(Arrays.toString(board[i]));
        }

    }

    public static void fillBoard(){

        CoordinatePair newCell = findLowestCandidates();

        if (newCell == null){
            //throw new RuntimeException("Error.");
            try {
                fillBoard();
            }
            catch (StackOverflowError e){
                generateBoard();
            }
            return;
        }


        if (newCell.x == -1){
            return;
        }

        LinkedList<Integer> candidates = countCandidates(newCell.x, newCell.y);

        board[newCell.x][newCell.y] = candidates.get((int)(Math.random()*candidates.size()));

        fillBoard();

    }

    public static LinkedList<Integer> countCandidates(int x, int y){

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 9; i > 0; i--){
            numbers.add(i);
        }

        if(board[x][y] != 0){
            numbers.add(10);
            return numbers;
        }

        for (int row = 0; row < 9; row++){
            if (numbers.contains(board[row][y])){
                numbers.remove(board[row][y]);
            }
        }

        for (int column = 0; column < 9; column++){
            if (numbers.contains(board[x][column])){
                numbers.remove(board[x][column]);
            }
        }

        int offsetX = x/3*3;
        int offsetY = y/3*3;

        for (int row = offsetX; row < offsetX + 3; row++){
            for (int column = offsetY; column < offsetY + 3; column++){
                if (numbers.contains(board[row][column])){
                    numbers.remove(board[row][column]);
                }
            }
        }

        if (numbers.size() == 0){
            return null;
        }

        return numbers;
    }

    public static CoordinatePair findLowestCandidates(){

        LinkedList<CoordinatePair> finalCandidates = new LinkedList<>();

        //Create new array to count the number of possible candidates for each cell
        int[][] candidates = new int[9][9];

        //Fill array with the ints that countCandidates return
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (countCandidates(x, y) == null) {
                    return null;
                }
                candidates[x][y] = countCandidates(x, y).size();
            }
        }

        int lowestNumber = 9;

        for (int y = 0; y < 9; y ++){
            for (int x = 0; x <9; x++){
                if (candidates[x][y] == lowestNumber){
                    finalCandidates.add(new CoordinatePair(x, y));
                }
                else if (candidates[x][y] < lowestNumber){
                    finalCandidates.clear();
                    finalCandidates.add(new CoordinatePair(x, y));
                    lowestNumber = candidates[x][y];
                }
            }
        }

        if (finalCandidates.size() == 0){
            return new CoordinatePair(-1, -1);
        }

        return finalCandidates.get((int)(Math.random()*finalCandidates.size()));
    }

    public static class CoordinatePair{

        int x, y;

        public CoordinatePair(int x, int y){

            this.x = x;
            this.y = y;
        }

    }


}
