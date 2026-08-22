import java.util.Scanner;

class Accenture_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] words = input.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
