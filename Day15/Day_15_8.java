//Floyds algorithm
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Day_15_8 {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // Create cycle
        third.next = second;

        Node slow = first;
        Node fast = first;

        boolean cycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle)
            System.out.println("Cycle Found");
        else
            System.out.println("No Cycle");
    }
}
