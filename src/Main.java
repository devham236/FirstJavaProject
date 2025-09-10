import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Slot Machine

        // Declare all Variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        // Display Welcome Message
        System.out.println("**********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍇🍉🍋🍍🍓");
        System.out.println("**********************");

        // Play if balance > 0
        while (balance > 0){
            // Enter bet amount
            System.out.println("Current balance: " + balance + "€");
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
        }


            // Verify if bet > balance

            // Verify if bet > 0

            // Subtract bet from balance

        // Spin row

        // Print row

        // Get payout

        // Ask to play again

        // Display exit message

        scanner.close();
    }
}
