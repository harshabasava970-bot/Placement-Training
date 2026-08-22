//Circular Queue
import java.util.Scanner;
class Day_17_2 {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int value) {

        if ((rear + 1) % 5 == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % 5;
        queue[rear] = value;
    }

    static void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % 5;
        }
    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        dequeue();
        enqueue(40);
        enqueue(50);
        System.out.println("Queue:");
        System.out.println(queue[front]);
        System.out.println(queue[(front + 1) % 5]);
        System.out.println(queue[(front + 2) % 5]);
    }
}
