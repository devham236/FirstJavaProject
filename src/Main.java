import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enter user input into an array
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int quantity = 3;

        System.out.print("Enter the # of food items: ");
        quantity = scanner.nextInt();
        scanner.nextLine();
        foods = new String[quantity];

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
