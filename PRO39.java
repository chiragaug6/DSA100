
/**
 * How stack can be used to recognize strings aca, bcb, abcba, abbcbba? Write a 
 program to solve the above problem.
 */

import java.util.Stack;

public class PRO39 {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("aca"));
        System.out.println(checkPalindrom("bcb"));
        System.out.println(checkPalindrom("abcba"));
        System.out.println(checkPalindrom("abbcbbaa"));
    }

    static boolean checkPalindrom(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }
        }

        return true;
    }
}
