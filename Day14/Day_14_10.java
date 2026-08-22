//Finally
import java.util.Scanner;
class Day_14_10 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            System.out.println(a / b);
        } catch (Exception e) {

            System.out.println("Error");

        } finally {

            System.out.println("Finally block executed");
        }
    }
}
