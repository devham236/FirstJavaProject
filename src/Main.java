import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("What is the width of the rectangle:");
        width = scanner.nextDouble();

        System.out.print("What is the height of the rectangle:");
        height = scanner.nextDouble();

        area = width * height;

        System.out.print("Your area is: " + area);

        scanner.close();
    }

}
