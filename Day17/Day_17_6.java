//Stack using two queues
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Day_17_6 {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void push(int value) {

        q2.add(value);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    static void pop() {

        if (q1.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Removed: " + q1.remove());
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        pop();
        pop();
    }
}
