import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // switch statemtents

        String day = "Pizza";

        switch(day) {
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.printf("%s is not a day", day);
        }
    }
}
