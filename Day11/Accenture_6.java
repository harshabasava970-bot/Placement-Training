import java.util.*;

class Accenture_6 {

    static int priority(char c) {
        if (c == '+' || c == '-')
            return 1;
        if (c == '*' || c == '/')
            return 2;
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Reverse
        String rev = new StringBuilder(s).reverse().toString();

        // Swap brackets
        rev = rev.replace('(', '#');
        rev = rev.replace(')', '(');
        rev = rev.replace('#', ')');

        Stack<Character> st = new Stack<>();
        String post = "";

        for (char c : rev.toCharArray()) {

            if (Character.isDigit(c)) {
                post += c;
            }
            else if (c == '(') {
                st.push(c);
            }
            else if (c == ')') {
                while (st.peek() != '(')
                    post += st.pop();
                st.pop();
            }
            else {
                while (!st.isEmpty() && st.peek() != '(' &&
                       priority(st.peek()) > priority(c)) {
                    post += st.pop();
                }
                st.push(c);
            }
        }

        while (!st.isEmpty())
            post += st.pop();

        // Reverse postfix = prefix
        String prefix = new StringBuilder(post).reverse().toString();

        System.out.println(prefix);
    }
}
