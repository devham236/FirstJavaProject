import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while loops

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while(!response.equals("Q")){
            System.out.print("You are playing a game");
            System.out.print("\nPress Q to quit: ");

            response = scanner.nextLine().toUpperCase();
        }

        System.out.println("You have quit the game.");

        scanner.close();
    }
}
