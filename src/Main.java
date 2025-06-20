import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name
        //                      but different parameters
        //                      signature = name + parameters
        // Java takes the method with the matching parameters when two methods
        // have the same name.

        String pizza = bakePizza("Flat bread", "mozzarella");
        System.out.println(pizza);
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
}
