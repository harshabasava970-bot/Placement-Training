import java.util.*;

class Accenture_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        char[] a = s.toCharArray();

        // Step 1: Find the first smaller digit from right
        int i = n - 2;

        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }

        // Step 2: Find the smallest greater digit on the right
        int j = n - 1;

        while (a[j] <= a[i]) {
            j--;
        }

        // Step 3: Swap
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        // Step 4: Reverse the remaining part
        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(a));
    }
}
