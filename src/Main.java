

public class Main {
    public static void main(String[] args) {
        // Empty arrays should not be initialized with empty brackets
        // It doesnt mean you can add elements to it by selecting indeces
        // and setting it to some value
        // Empty brackets mean the arrays size is zero, which means you cannot assign
        // spaces/indeces in the array to a value

        String[] foods = {};

        foods[0] = "pizza";

        System.out.println(foods);
    }
}
