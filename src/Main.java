import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // weight converter
        Scanner scanner = new Scanner(System.in);
        int option;
        double weight;
        double result;

        System.out.println("Weight Conversion Programm");
        System.out.println("1: Convert lbs to kg");
        System.out.println("2: Convert kg to lbs");

        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if(option == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            result = weight / 2.205;
        }
        else if (option == 2) {
            System.out.print("Enter the weight in kg: ");
            weight = scanner.nextDouble();
            result = weight * 2.205;
        }
        else {
            System.out.println("No valid option");
            result = 0;
        }

        System.out.printf("Your option is %d and your converted weight is: %.2f", option, result);

        scanner.close();
    }
}
