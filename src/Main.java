import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2D Arrays = An array where each element is an array

        // Seperate 1-Dimensional arrays
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        // 2-Dimensional array containing all the arrays above
        String[][] foods = {fruits, vegetables, meats};

        for (String[] food : foods){
            for (String element : food){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
