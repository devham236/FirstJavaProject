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
        while (balance > 0) {
            // Enter bet amount
            System.out.println("Current balance: " + balance + "€");
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            // Verify if bet > balance
            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            }
            // Verify if bet > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            }
            // Subtract bet from balance
            else {
                balance -= bet;
            }

            // Spin row of symbols
            System.out.println("Spinning...");
            spinRow();
        }






        // Print row of symbols

        // Get payout

        // Ask to play again

        // Display exit message

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍇","🍉","🍋","🍍","🍓"};
        String[] row = new String[3];

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
           row[i] = symbols[random.nextInt(0 ,symbols.length)];
        }

        return row;
    }
}
