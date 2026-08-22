//BST Search
import java.util.Scanner;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
class Day_18_7 {

    static Node insert(Node root, int value) {

        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    static boolean search(Node root, int value) {

        if (root == null)
            return false;

        if (root.data == value)
            return true;

        if (value < root.data)
            return search(root.left, value);

        return search(root.right, value);
    }
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        int value = 40;
        if (search(root, value))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}