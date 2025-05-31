import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // String methods
        String name = "Hamza Mirza";

        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("a");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("a", "e");

        System.out.println(name.isEmpty());
    }
}
