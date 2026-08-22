//Infix to Postfix Conversion
import java.util.Stack;
class Day_16_5 {
    static int priority(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        return 0;
    }
    public static void main(String[] args) {
        String infix = "A+B*C";
        Stack<Character> stack = new Stack<>();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {

                while (!stack.empty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }

                stack.pop();
            }

            // Operator
            else {

                while (!stack.empty() &&
                       priority(stack.peek()) >= priority(ch)) {

                    postfix += stack.pop();
                }

                stack.push(ch);
            }
        }

        while (!stack.empty()) {
            postfix += stack.pop();
        }

        System.out.println("Postfix: " + postfix);
    }
}
