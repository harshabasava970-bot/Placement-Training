//Min Stack Design
import java.util.Scanner;
import java.util.Stack;

class Day_16_7 {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    static void push(int value) {
        stack.push(value);
        if (minStack.empty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    static void pop() {

        int value = stack.pop();

        if (value == minStack.peek()) {
            minStack.pop();
        }
    }

    static void peek() {

        System.out.println("Top: " + stack.peek());
    }

    static void getMin() {

        System.out.println("Minimum: " + minStack.peek());
    }

    public static void main(String[] args) {

        push(5);
        push(3);
        push(7);
        push(2);

        peek();
        getMin();

        pop();

        getMin();
    }
}
