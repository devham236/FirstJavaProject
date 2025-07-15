import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5};
        boolean isFound = false;
        String[] fruits = {"apple", "kiwi", "banana"};

        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

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
