//Multiplecatch
import java.util.Scanner;
class Day_14_9 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic error");

        } catch (Exception e) {

            System.out.println("Some other error");
        }
    }
}
