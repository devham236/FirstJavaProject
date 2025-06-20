import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // methods
        String name = "Hamza";
        int age = 28;
        happyBirthday(name, age);
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
}
