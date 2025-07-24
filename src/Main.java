import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Quiz Game

        // Create an array of questions
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was facebook launched?", "" +
                              "Who is known as the father of computers?",
                              "What was the first programming language?"};

        // Create a 2-dimensional array of options
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                             {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                             {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                             {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                             {"1. Cobol", "2. C", "3. Fortran", "4. Assembly"}};

        // Declare all necessary variables
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        // Print a welcome message
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        // Loop over arrays and display contents
            // display options
            // get a guess from the user
            // check the guess

        // Display final score

        scanner.close();
    }
}
