import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Rock Paper Scissors Game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")){
            System.out.print("Invalid choice");
        }

        scanner.close();
    }
}
