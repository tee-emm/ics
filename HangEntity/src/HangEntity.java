import java.util.Random;
import java.util.Scanner; //for user input
import java.util.ArrayList;
import javax.swing.JOptionPane; // Allows options for ending buttons (yes/no/cancel || used for replay)
import java.awt.GridLayout; // Divides opening pop up box into half
import javax.swing.JFrame; // Allows for formatting of opening pop up box
import javax.swing.JButton; // Allows for editing of buttons
import javax.swing.text.html.Option;
import java.awt.event.ActionEvent; // Allows for event options for opening pop up box
import java.awt.event.ActionListener; // Allows for event options for opening pop up box

/**
 *
 * Thomass Muir
 * 02/01/18
 * ICS3U
 *
 */

public class HangEntity extends JFrame implements ActionListener { //Opens up box, implements action listener to

    //ALL THE VARIABLES (or, most of them)
    //Made "public static" to allow access within different methods
    public static final long serialVersionUID = 1L; // not mandatory, universal version identifier for a Serializable class
    public static Scanner sc = new Scanner(System.in);
    public static char newGuess; //variable for user input guesses
    public static String mysteryWord; // //variable for random mystery word (String)
    public static char[] randomizedWord; //variable for random mystery word (characters)
    public static char[] guessArray; //
    public static boolean wordCorrectlyGuessed = false; // boolean
    public static int limbsLeft = 5; //how many chances you get to guess the word
    public static boolean correctLetter; //variable to prevent limbs from being lost
    public static ArrayList<Character> guessedBefore; //ArrayList to determine if character has already been played
    public static char category; // game categories for user to choose
    public static String guessWord; //variable for user input guesses

    //Opening Play Box
    public HangEntity() {
        setVisible(true);
        super.setTitle("HangEntity by Thomass Muir");
        super.setSize(500, 300);
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new GridLayout());
        JButton button = new JButton("Play Game");
        button.setActionCommand("start");
        button.addActionListener(this);
        add(button);
        JButton button2 = new JButton("Rules");
        button2.setActionCommand("info");
        button2.addActionListener(this);
        add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = e.getActionCommand();
        if (name.equals("start")) { // If user clicks start, what will happen
            System.out.println("Welcome to HangEntity! Your game will now begin!\n");
            super.setVisible(false);
            Options();
        } else if (name.equals("info")) {  //If user clicks info, what will happen
            super.setVisible(false);
            System.out.println("Here are the rules:");
            System.out.println("\nThis game is a classic version of hangman. " +
                    "\nIf you accept to play, a word will be randomly selected from a premade list." +
                    "\nAnd your game will begin!" +
                    "\nYou will have 5 chances to guess the word." +
                    "\nYou may only guess character by character." +
                    "\nIf you get a character wrong, you will lose a 'limb.'" +
                    "\n(Don't worry, it's not graphic.)" +
                    "\nIf you lose all your limbs, you will die." +
                    "\nKthxbye, let's just play.");
            System.out.println();
            System.out.println("Play HangEntity? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("\nWelcome to HangEntity! Your game will now begin!");
                Options();
                // Brings up game runner
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("\nOh, that's too bad.");
                System.out.println("I guess this is goodbye!");
                System.exit(0);
            } else { // If someone enters something other than 'y' or 'n'
                System.out.println("Sorry, you can't do that. Redirecting back to start menu.");
                super.setVisible(true);
            }
        } // ends else if (name.equals("info"))
    } //end actionperformed

    public static void main(String[] args) {
        new HangEntity();
    }

    //Provides options for playing the game
    public static void Options() {

        System.out.println("There are three categories of words to choose from:\n");
        System.out.println("Animals (a),\nMovies (m) and,\nMisc (x)");
        System.out.println("Please choose a category (a, m, x):");
        category = sc.next().charAt(0);

        if (category == 'a'){
            System.out.println("\nAlright, your game will now begin.");
            Runner1();
        }
        else if (category == 'm') {
            System.out.println("\nAlright, your game will now begin.");
            Runner2();
        }
        else if (category == 'x') {
            System.out.println("\nAlright, your game will now begin.");
            Runner3();
        }
        else {
            System.out.println("\nSorry, you can't do that.\nRedirecting back to the options. . .");
            Options();
        }
    }

    //Runner method that chooses word and sets game in motion (animals)
    public static void Runner1() {

        System.out.println("A new word will be generated for you.\n");
        String[] dictionary = { //initializes string array for dictionary
                "cat",
                "dog",
                "penguin",
                "giraffe",
                "hippopotamus",
                "bat",
                "pelican",
                "turtle",
                "wolf"
        };
        int idx = new Random().nextInt(dictionary.length); //selects random word from dictionary
        mysteryWord = (dictionary[idx]); //turns it into string
        randomizedWord = mysteryWord.toCharArray(); //turns word into individual characters
        guessArray = new char[randomizedWord.length]; //array for guess letters

        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = '_'; //hides characters in mystery word array
        }

        wordCorrectlyGuessed = false;
        guessedBefore = new ArrayList<Character>(); //rests guessedBefore array list

        limbsLeft = 5;

        Game();
    }

    //Runner method that chooses word and sets game in motion (movies)
    public static void Runner2() {

        System.out.println("A new word will be generated for you.\n");
        String[] dictionary = { //initializes string array for dictionary
                "casablanca",
                "jaws",
                "scarface",
                "goofellas",
                "rocky",
                "clueless",
                "braveheart",
                "vertigo",
                "babe",
                "psycho",
                "amadeus",
                "batman",
                "spartacus",
                "persona"
        };
        int idx = new Random().nextInt(dictionary.length); //selects random word from dictionary
        mysteryWord = (dictionary[idx]); //turns it into string
        randomizedWord = mysteryWord.toCharArray(); //turns word into individual characters
        guessArray = new char[randomizedWord.length]; //array for guess letters

        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = '_'; //hides characters in mystery word array
        }

        wordCorrectlyGuessed = false;
        guessedBefore = new ArrayList<Character>(); //rests guessedBefore array list

        limbsLeft = 5;

        Game();
    }

    //Runner method that chooses word and sets game in motion (misc)
    public static void Runner3() {

        System.out.println("A new word will be generated for you.\n");
        String[] dictionary = { //initializes string array for dictionary
                "seventeen",
                "ics",
                "wizard",
                "tranquilizer",
                "cremate",
                "idealistic",
                "fantasy",
                "phone",
                "bubble",
                "tree",
                "waterbottle"
        };
        int idx = new Random().nextInt(dictionary.length); //selects random word from dictionary
        mysteryWord = (dictionary[idx]); //turns it into string
        randomizedWord = mysteryWord.toCharArray(); //turns word into individual characters
        guessArray = new char[randomizedWord.length]; //array for guess letters

        //Initializing
        for (int i = 0; i < guessArray.length; i++) {
            guessArray[i] = '_'; //hides characters in mystery word array
        }

        wordCorrectlyGuessed = false;
        guessedBefore = new ArrayList<Character>(); //rests guessedBefore array list

        limbsLeft = 5;

        Game();
    }

    //Method for actual game mechanics
    public static void Game() {

        //While word is not correctly guessed and there are still limbs left, run
        while (!wordCorrectlyGuessed && limbsLeft > 0) {

            //Prints guess array for mystery word with blank underscores (and spaces)
            for (int i = 0; i < guessArray.length; i++) {
                System.out.print(guessArray[i] + " ");
            }

            //Prints out how many limbs are left at the beginning of each turn
            System.out.println("\n\nYou have " + limbsLeft + " guess(es) left.");
            System.out.println("Please enter a letter or word:");

            //Scanner for user input; allows users to guess a letter
            guessWord = sc.next();

            //Variable to prevent limbs from being lost
            correctLetter = false;

            //Check if string equals word; win the game
            if (guessWord.equals(mysteryWord)) {
                wordCorrectlyGuessed = true;
                System.out.print("\nYou have successfully guessed the word, congrats!\n");
                PlayAgain(); // Call up PlayAgain() method
            }
            else if (guessWord.length() == 1){
                newGuess = guessWord.charAt(0);
            }

            //Checks if the player already tried using that letter
            if(!guessedBefore.contains(newGuess)){
                guessedBefore.add(newGuess);
            }
            else if (guessedBefore.contains(newGuess) && guessWord.length() ==1){
                System.out.println("\nSorry mate, you already guessed that one. Try again.\n");
                correctLetter = true;
            }

            //For loop; correct guess
            for (int i = 0; i < randomizedWord.length; i++) {
                if (randomizedWord[i] == newGuess) {
                    guessArray[i] = newGuess;
                    correctLetter = true;
                }
            } //Win the game
            if (isCorrectWord(guessArray)) {
                wordCorrectlyGuessed = true;
                System.out.print("\nYou have successfully guessed the word, congrats!\n");
                PlayAgain(); // Call up PlayAgain() method

            } //Lose the game
            else if (!correctLetter && limbsLeft == 1) { //User input (newGuess) is not in the word, PlayAgain
                System.out.println("\nSorry, that is not a letter in the word.\n" +
                        "You have lost all your limbs. You are dead :(\n"+
                        "The word was:\n");
                System.out.println(randomizedWord);
                limbsLeft--;
                PlayAgain(); // Call up PlayAgain() method

            } //Lose the life
            else if(!correctLetter){//User input (newGuess) is not in the word, but still continue to play
                System.out.print("\nSorry, that is not a letter in the word or the word itself." +
                        "\nPlease try again!\n\n");
                limbsLeft--;

            }

        }

    }

    //Helper method to check if word is complete; allows user to win
    public static boolean isCorrectWord(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_') return false;
        }
        return true;
    }

    //Helper method for users to choose to play again or not
    public static void PlayAgain() {

        System.out.println("\nThanks for playing!");
        int input = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
        if (input == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Good luck! :)");
            System.out.println("\nLoading new game. . . \n");
            limbsLeft = 5;
            Options();
        } else if (input == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "\nThanks for playing!");
            JOptionPane.showMessageDialog(null, "Goodbye!");
            System.exit(0);
            Options();
        } else if (input == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Okay then! By default, we'll just have to say goodbye...");
            JOptionPane.showMessageDialog(null, "Goodbye!");
            System.exit(0);

        }
    }


}