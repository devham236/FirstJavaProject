public class Main {

    public static void main(String[] args){
        // Arithmetic Operators
        int x = 7;
        int y = 2;

        // result = x + y;
        // result = x - y;
        // result = x * y;
        // result = x / y;

        // result = x % y;


        // Order of Operations --> "P-E-M-D-A-S"

        double result = 3 + 4 * (7 - 5) / 2.0;

        // 1. P = Parenthesis       3 + 4 * 2 / 2.0
        // 2. E = Exponent          3 + 4 * 2 / 2.0 --> no exponent
        // 3. M = Multiplication    3 + 8 / 2.0
        // 4. D = Division          3 + 4
        // 5. A = Addition          7
        // 6. S = Substraction      7 --> no substraction

        System.out.println(result);
    }

}
