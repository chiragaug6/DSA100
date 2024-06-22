/**
 * Write a program to find factors of a given number.
 */
public class PRO07 {
    public static void main(String[] args) {
        int num = 324;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
