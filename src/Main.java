import  java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Random numbers
        Random random = new Random();

        int number;

        number = random.nextInt(1, 6);
        // origin is inclusive --> number 1 can be the ranodm number
        // bound is exclusive --> number 6 will be excluded

        System.out.print(number);
    }
}
