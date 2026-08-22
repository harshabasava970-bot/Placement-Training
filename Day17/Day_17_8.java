//Sliding window
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
class Day_17_8 {
    public static void main(String[] args) {
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < a.length; i++) {

            // Remove elements outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) {
                dq.removeLast();
            }
            dq.addLast(i);

            // Print maximum
            if (i >= k - 1) {
                System.out.print(a[dq.peekFirst()] + " ");
            }
        }
    }
}
