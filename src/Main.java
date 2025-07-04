

public class Main {
    public static void main(String[] args) {
        // Instead you should use the new keyword and initialize the foods array
        // with an empty with 3 spaces or an array with the length of 3

        String[] foods = new String[3];

        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";

        for (String food : foods) {
            System.out.println(food);
        }

        System.out.println(foods.length);
    }
}
