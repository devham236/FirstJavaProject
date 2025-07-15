import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 9;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
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
