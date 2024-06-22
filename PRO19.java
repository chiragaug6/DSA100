/**
 * WAP to print Pascal triangle.
 */
public class PRO19 {
    public static void main(String[] args) {
        print(7);
    }

    static void print(int rows) {
        for (int i = 1; i <= rows; i++) {
            int k = 1;
            int r = 0;
            for (int j = 1; j <= (rows * 2) - 1; j++) {
                if (j >= rows - i + 1 && j <= rows + i - 1 && k == 1) {
                    System.out.print(" " + combi(i - 1, r));
                    k = 0;
                    r++;
                } else {
                    System.out.print("  ");
                    k = 1;
                }
            }
            System.out.println();
        }

    }

    static int combi(int n, int r) {
        int high = fact(n);
        int low = fact(r) * fact(n - r);
        return high / low;
    }

    static int fact(int num) {
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }
}