/**
 * Write a program to find power of a number using loop.
 */
public class PRO06 {
    public static void main(String[] args) {
        int num = 5;
        int power = 3;

        int ans = 1;

        for (int i = 0; i < power; i++) {
            ans = num * ans;
        }

        System.out.println(ans);
    }
}