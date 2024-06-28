import java.util.Stack;

public class PRO41 {
    public static void main(String[] args) {
        System.out.println(isValidParentheses("([{]})"));
        System.out.println(isValidParentheses("())"));
        System.out.println(isValidParentheses("([])"));
        System.out.println(isValidParentheses("({})[()]"));
        System.out.println(isValidParentheses("]]"));
    }

    static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && reverse(stack.peek()) == c) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        return stack.isEmpty();
    }

    static char reverse(char c) {
        if (c == '(') {
            return ')';
        } else if (c == '{') {
            return '}';
        } else if (c == '[') {
            return ']';
        } else {
            return 'x';
        }
    }
}
