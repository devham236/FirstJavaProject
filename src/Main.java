import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // enhanced switch statemtents (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("What day is it today?: ");
        day = scanner.nextLine();

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.printf("%s is not a day", day);
        }
    }
}
