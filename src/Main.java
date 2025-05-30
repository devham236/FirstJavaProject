import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // printf

        // %[width] --> align numbers with different number of digits

        // 0x = zero padding, followed by hoch much zero padding --> 04 = 0001
        // number = right justified padding, so that the numbers align on the righ side
        // negative number = left justified padding, so numbers align on left side

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
