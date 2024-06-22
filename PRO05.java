/**
 * Write a program to find factorial of a number. (Using Recursion)
 */
public class PRO05 {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

    static int factorial(int num) {
        if (num <= 1)
            return 1;
        return num * factorial(num - 1);
    }
}