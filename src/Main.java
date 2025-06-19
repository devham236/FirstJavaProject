import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // number guessing game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number guesing game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do {
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high! Try again");
            }
            else {
                System.out.printf("Correct! The number was %d", randomNumber);
                System.out.printf("\n# of attempts: %d", attempts);
            }

        } while(guess != randomNumber);

        scanner.close();

    }
}
