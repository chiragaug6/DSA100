/**
 * . Write a program to swap two numbers using user-defines method.
 */
public class PRO33 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int[] res = swap(num1, num2);

        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    static int[] swap(int num1, int num2) {
        return new int[] { num2, num1 };
    }
}