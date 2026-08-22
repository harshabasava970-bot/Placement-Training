//Queue using two stacks
import java.util.Scanner;
import java.util.Stack;
class Day_17_5 {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enqueue(int value) {
        stack1.push(value);
    }

    static void dequeue() {

        if (stack2.empty()) {

            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.empty()) {
            System.out.println("Removed: " + stack2.pop());
        }
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        dequeue();
        dequeue();
    }
}
