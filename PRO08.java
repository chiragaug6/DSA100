/**
 * Write a program to check whether a number is prime or not.
 */
public class PRO08 {
    public static void main(String[] args) {
        int num = 97;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}