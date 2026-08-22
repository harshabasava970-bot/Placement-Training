//Stack using Array
import java.util.Scanner;
class Day_16_2 {

    static int[] stack = new int[5];
    static int top = -1;

    static void push(int value) {

        if (top == 4) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
    }

    static void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + stack[top]);
        top--;
    }

    static void peek() {

        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top: " + stack[top]);
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        peek();

        pop();

        peek();
    }
}
