import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double amount;

    public static void main(String[] args) {
        // Banking Program

        int choice;
        boolean isRunning = true;
        double balance = 100;

        while(isRunning) {
            System.out.println("\nBANKING PROGRAM");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice!");
            }
        }


        scanner.close();
    }

    static double deposit(double balance) {
        System.out.print("Enter an amount to be deposited (€): ");
        amount = scanner.nextDouble();
        return balance + amount;
    }

    static double withdraw(double balance) {
        System.out.print("Enter an amount to be withdrawn (€): ");
        amount = scanner.nextDouble();
        return balance - amount;
    }

    static void showBalance(double balance) {
        System.out.printf("Your current balance: %.2f", balance);
    }
}
