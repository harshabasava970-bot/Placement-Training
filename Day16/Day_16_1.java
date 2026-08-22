//Stack ADT
import java.util.Stack;
class Day_16_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top: " + stack.peek());
        stack.pop();
        System.out.println("After Pop: " + stack);
    }
}
