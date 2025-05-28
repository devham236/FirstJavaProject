import  java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Random numbers
        Random random = new Random();

        double number;

        number = random.nextDouble();

        // without specified origin and bound, it generates
        // a random double between 0 and 1


        System.out.print(number);
    }
}
