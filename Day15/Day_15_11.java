//palindrome check
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Day_15_11 {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(10);

        first.next = second;
        second.next = third;
        third.next = fourth;

        int[] a = new int[4];

        Node temp = first;
        int i = 0;

        while (temp != null) {
            a[i] = temp.data;
            i++;
            temp = temp.next;
        }

        boolean palindrome = true;

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            if (a[left] != a[right]) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
