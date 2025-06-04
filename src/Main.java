import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ternary operator

        int score = 50;
        String passOrFail = score > 60 ? "Pass": "Fail";

        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        int hours = 11;
        String timeOfDay = (hours < 12) ? "AM" : "PM";

        int income = 30000;
        double taxRate = income >= 40000 ? 0.25 : 0.15;

        System.out.println(taxRate);
    }
}
