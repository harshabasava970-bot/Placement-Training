//Balanced Parentheses
import java.util.Scanner;
import java.util.Stack;
class Day_16_4 {
    public static void main(String[] args) {

        String str = "(a+b)";

        Stack<Character> stack = new Stack<>();

        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);

            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.empty()) {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {

                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.empty()) {
            balanced = false;
        }

        if (balanced)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
