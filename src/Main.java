import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // printf

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        // %[precision] --> defines how many digits the double show show,
        // placed between placeholder % and specified character
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

    }
}
