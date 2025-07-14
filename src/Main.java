import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // If the array is empty, "adding" values by selecting an index is not possible
        // as the arrays length is 0, meaning there is no index you can select

        String[] foods = {};

        foods[0] = "Pizza";


        System.out.println(foods.length);
    }
}
