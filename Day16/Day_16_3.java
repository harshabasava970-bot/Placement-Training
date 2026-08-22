//Stack using Linked list
import java.util.Scanner;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Day_16_3 {

    static Node top = null;

    static void push(int value) {

        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
    }

    static void pop() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped: " + top.data);

        top = top.next;
    }

    static void peek() {

        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top: " + top.data);
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
