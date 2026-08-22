//Next Greater Element
import java.util.Scanner;
import java.util.Stack;
class Day_16_6 {

    public static void main(String[] args) {

        int[] a = {4, 5, 2, 10};

        Stack<Integer> stack = new Stack<>();

        int[] result = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {

            while (!stack.empty() && stack.peek() <= a[i]) {
                stack.pop();
            }

            if (stack.empty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(a[i]);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
