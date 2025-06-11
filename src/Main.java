import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // calculator program
        Scanner scanner = new Scanner(System.in);

        double firstNum;
        double secondNum;
        double result;
        String operator;
        String resultMsg = "Your result:";

        System.out.print("Enter the first number: ");
        firstNum = scanner.nextDouble();

        System.out.print("Enter an operator: ");
        operator = scanner.next();

        System.out.print("Enter the second number: ");
        secondNum = scanner.nextDouble();

        switch(operator) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
            case "*" -> result = firstNum * secondNum;
            case "/" -> result = firstNum / secondNum;
            default -> result = 0;
        }

        if(Double.isInfinite(result)) {
            resultMsg = "Cannot divide by zero!";
        }

        System.out.printf("%s %.2f", resultMsg, result);

        scanner.close();
    }
}
