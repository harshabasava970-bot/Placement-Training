//Array Exception
import java.util.Scanner;
class Day_14_8 {
    public static void main(String[] args) {
        try {
            int[] a = {10, 20, 30};

            System.out.println(a[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");
        }
    }
}
