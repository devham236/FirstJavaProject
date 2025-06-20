import java.util.Scanner;
import java.util.Random;

public class Main {
    // Java prefers variables with local scope, that is why 1 and 2 gets
    // printed to the console.

    // class scope
    static int x = 3;

    public static void main(String[] args) {
        // local scope
        int x = 1;

        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        // local scope
        int x = 2;

        System.out.println(x);
    }
}
