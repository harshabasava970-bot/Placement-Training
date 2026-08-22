//Queue ADT
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
class Day_17_1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue: " + q);
        System.out.println("Front: " + q.peek());
        q.remove();
        System.out.println("After Dequeue: " + q);
    }
}
