import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // calculator program
        Scanner scanner = new Scanner(System.in);

        double firstNum;
        double secondNum;
        double result = 0;
        char operator;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        firstNum = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        secondNum = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if(secondNum == 0) {
                    System.out.print("Cannot divide by zero! ");
                    validOperation = false;
                }
                else {
                    result = firstNum / secondNum;
                }
            }
            case '^' -> result = Math.pow(firstNum, secondNum);
            default -> {
                System.out.print("Invalid operator!");
                validOperation = false;
            }
        }

        if(validOperation) {
            System.out.printf("Your result: %.2f", result);
        }

        scanner.close();
    }
}
