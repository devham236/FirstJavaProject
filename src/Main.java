import java.util.Random;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // Random numbers
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");

        double number;

        number = random.nextDouble();

        // without specified origin and bound, 'random.nextDouble()' generates
        // a random double between 0 and 1
        // with the 'DecimalFormat' class you can decide
        // how many decimals the double should have

        System.out.print(df.format(number));
    }
}
