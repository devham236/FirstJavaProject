import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // varargs = variable arguments
        // allows method to accept varying numbers of arguments
        // arguments get packed into an array
        // remove the need to create multiple identical methods with added parameters
        System.out.println(average(1, 2, 3, 4, 5));
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static int average(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
