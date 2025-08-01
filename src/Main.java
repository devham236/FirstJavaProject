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

        do {
            System.out.print("\nEnter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.print("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You win!");
            } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.print("Thanks for playing!");

        scanner.close();
    }
}
