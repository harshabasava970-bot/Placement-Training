//Throw
import java.util.Scanner;
class Day_14_11 {
    public static void main(String[] args) {

        try {

            int age = 15;

            if (age < 18) {
                throw new Exception("Not eligible to vote");
            }

            System.out.println("Eligible to vote");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
