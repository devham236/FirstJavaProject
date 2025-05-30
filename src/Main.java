import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // printf

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        // %[flags] --> formats numbers to show more information

        // + = adds a plus before the double
        // , = seperates every 1000 place with a comma
        // ( = negative numbers are closes in ()
        // space = display minus if negative, space if positive

        System.out.printf("% .1f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .3f\n", price3);

    }
}
