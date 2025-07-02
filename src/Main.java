import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // arrays
        String[] fruits = { "banana", "apple", "orange"};
        Arrays.fill(fruits, "watermelon");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
