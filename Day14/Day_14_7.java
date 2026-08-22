//Exception handling
import java.util.Scanner;
class Day_14_7 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }
    }
}
