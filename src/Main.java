import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enter user input into an array
        String[] foods = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter the foods you want: ");
            foods[i] = scanner.next();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
