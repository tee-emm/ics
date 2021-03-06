import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

/**
 * Created by thomassmuir on 2019-02-12.
 */
public class Sudoku extends Canvas implements Runnable {

    Image testImage;
    private Thread thread;
    public static boolean running = false;

    public Sudoku()  {
        BoardCreator.generateBoard();
        addMouseListener(new MouseClick());
        addMouseMotionListener(new MouseMovement());
        new Window(640, 480, this);
        try{
            testImage = ImageIO.read(Sudoku.class.getResource("sudoku.png"));
        }catch (Exception e){
            e.printStackTrace();

        }

    }

    public static void main (String[] args) {

        new Sudoku();

    }


    public void run() {
        // Most common game loop, renders and does one tick every TICK_RATE a
        // second
        long lastTime = System.nanoTime();
        double amountOfTicks = 60;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;

        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }

            if (running)
                render();

        }
        stop(); // Exit the program if running is set to false
    }

    private void tick(){

    }

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }


        Graphics g = bs.getDrawGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 640, 480);
        g.drawImage(testImage, 0, 0, null);

        g.setColor(Color.BLACK);

        g.setFont(new Font("Calibri", Font.PLAIN, 30));

        for (int y = 0; y < 9; y ++){
            for (int x = 0; x < 9; x ++){
                g.drawString(BoardCreator.board[x][y] + "", x*43 + 45, y*43 + 93);
            }
        }

        g.dispose();
        bs.show();

    }

    public synchronized void start() {
        // start new thread, set program to running
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        // Exit program
        try {
            thread.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
