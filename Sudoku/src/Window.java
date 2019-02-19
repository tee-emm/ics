import javax.swing.*;
import java.awt.*;

/**
 * Created by thomassmuir on 2019-02-12.
 */
public class Window {

    public Window(int width, int height, Sudoku sudoku){

        JFrame frame = new JFrame("Sudoku");
        JTextArea loading = new JTextArea("Loading...");
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(loading);
        frame.add(sudoku);
        frame.setVisible(true);
        sudoku.start();


    }
}
