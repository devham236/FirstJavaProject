import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2D Arrays = An array where each element is an array

        // Seperate 1-Dimensional arrays
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        // 2-Dimensional array containing all the arrays above
        // 2D arrays are structured in rows and columns
        String[][] foods = {{"apple", "orange", "banana"},
                            {"potato", "onion", "carrot"},
                            {"chicken", "pork", "beef", "fish"}};

        // First index selects row, second index selects column
        foods[0][2] = "watermelon";
        foods[2][1] = "duck";

        for (String[] food : foods){
            for (String element : food){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
