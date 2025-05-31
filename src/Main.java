import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // substrings
        String email = "hamzamirza74@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(13, email.length());

        System.out.println(username); // --> hamzamirza74
        System.out.println(domain); // --> gmail.com


    }
}
