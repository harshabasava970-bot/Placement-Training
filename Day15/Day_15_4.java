//Insertion in Linkedlist
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class Day_15_4 {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(30);

        first.next = second;

        // Insert 20
        Node newNode = new Node(20);

        newNode.next = first.next;
        first.next = newNode;

        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
