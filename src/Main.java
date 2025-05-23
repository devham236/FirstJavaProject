import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // Shopping Cart Program
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int amount;
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        amount = scanner.nextInt();

        total = price * amount;

        System.out.print("\nYou have bought " + amount + " " + item + "/s");
        System.out.print("\nYour total is $" + total);

        scanner.close();
    }

}
