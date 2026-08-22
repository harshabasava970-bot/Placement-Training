//Queue Using Linked List
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class Day_17_3 {

    static Node front = null;
    static Node rear = null;
    static void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Removed: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    static void display() {

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);

        dequeue();

        display();
    }
}
