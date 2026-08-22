import java.util.*;

class Node {
    int val;
    Node left, right;
    int leftCount;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
        leftCount = 0;
    }
}

public class Main1 {

    // Put your BST methods here
    // countNodes()
    // getLeaves()
    // getNonLeaves()
    // SumValues()
    // etc.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Your BST creation/insertion code here

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1.Insert");
            System.out.println("2.Inorder");
            System.out.println("3.Preorder");
            System.out.println("4.Postorder");
            System.out.println("5.Level Order");
            System.out.println("6.Count");
            System.out.println("7.Leaf Nodes");
            System.out.println("8.Non Leaf Nodes");
            System.out.println("9.Sum");
            System.out.println("10.MinMax");
            System.out.println("11.LeftView");
            System.out.println("12.RightView");
            System.out.println("13.Boundary View");
            System.out.println("14.LCA");
            System.out.println("15.Zigzag");
            System.out.println("16.Validate BST");
            System.out.println("17.Kth Smallest");
            System.out.println("18.ArrayToBST");
            System.out.println("19.Delete Node");
            System.out.println("20.Serialize");
            System.out.println("21.Deserialize");
            System.out.println("22.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 6:
                    // countNodes
                    break;

                case 7:
                    // leaf nodes
                    break;

                // remaining cases...

                case 22:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}