import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Random numbers
        Random random = new Random();

        boolean isHeads;

        isHeads = random.nextBoolean();

        // value is true or false

        System.out.print(isHeads);
    }
}
