
/**
 * Write a program to determine if an input character string is of the form
 * a^ib^i
 * where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’
 */

import java.util.Stack;

public class PRO40 {
    public static void main(String[] args) {
        System.out.println(checkFormate("ab"));
        System.out.println(checkFormate("aabb"));
        System.out.println(checkFormate("aaabbb"));
        System.out.println(checkFormate("abab"));
        System.out.println(checkFormate("abababaabbaabbaaabbb"));

        System.out.println(checkFormate("aaabbbb"));
        System.out.println(checkFormate("aaa"));

    }

    static boolean checkFormate(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                stack.push(c);
            } else if (c == 'b') {
                if (stack.isEmpty() || stack.pop() != 'a') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}