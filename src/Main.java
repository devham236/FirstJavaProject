import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Math Exercise
        // Hypothenuse --> c = Math.sqrt(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);
        double sideA;
        double sideB;
        double result;

        System.out.print("Enter length of side A: ");
        sideA = scanner.nextDouble();

        System.out.print("Enter length of side B: ");
        sideB = scanner.nextDouble();

        result = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        System.out.println("Your Hypotenuse is: " + result);

        scanner.close();
    }
}
