import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Temperature Converter

        // °C -> °F       (°C * 9/5) + 32
        // °F -> °C       (°F - 32) * 5/9
        Scanner scanner = new Scanner(System.in);

        double temp;
        double convertedTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (Press C or F): ");
        unit = scanner.next().toUpperCase();

        convertedTemp = unit.equals("C") ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("Converted temperature: %.2f", convertedTemp);

        scanner.close();
    }
}
