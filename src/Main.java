import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // if statements
        int age = -1;

        if (age >= 18){
            System.out.println("You are an adult.");
        } else if (age < 0) {
            System.out.println("You havent been born yet.");
        } else {
            System.out.println("You are a child");
        }
    }
}
