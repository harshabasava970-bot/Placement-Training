import java.util.Scanner;
class Accenture_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int count = 0;

        for (int i = 0; i < rows; i++) {
            int[] arr = new int[cols];

            for (int j = 0; j < cols; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < cols; j++) {
                for (int k = j + 1; k < cols; k++) {
                    if (arr[j] > arr[k]) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
