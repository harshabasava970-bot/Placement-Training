//Priority queue
import java.util.Scanner;
import java.util.PriorityQueue;
class Day_17_7 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);

        System.out.println("Removed: " + pq.poll());
        System.out.println("Removed: " + pq.poll());
    }
}
