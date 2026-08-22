//Circular linked list
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Day_15_3 {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        third.next = first;

        Node temp = first;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != first);
    }
}
