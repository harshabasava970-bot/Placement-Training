//Deque
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Day_17_4 {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(20);
        dq.addFirst(10);

        dq.addLast(30);

        System.out.println(dq);

        dq.removeFirst();

        dq.removeLast();

        System.out.println(dq);
    }
}
