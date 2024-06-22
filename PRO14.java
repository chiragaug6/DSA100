
/**
 * PRO14 Write a program to calculate sum of numbers from m to n.
 */
public class PRO14 {
    public static void main(String[] args) {
        // 10 to 20

        int m = 10;
        int n = 20;

        int ans = (m * (m + 1)) / 2 - (n * (n + 1)) / 2;

        System.out.println(ans);
    }
}