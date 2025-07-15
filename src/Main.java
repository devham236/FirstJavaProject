import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"apple", "kiwi", "banana"};
        String target = "pineapple";
        boolean isFound = false;

        // String elements cant be compared using "target==fruits[i]" as this would
        // compare the memory addresses of both strings
        // to compare two string values you have to use the string method "equals()"
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.printf("Element found at index: %d", i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Element not found in the array");
        }
    }
}
