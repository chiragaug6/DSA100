/**
 * WAP to find the sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …+(1+2+3+4+….+n).
 */
public class PRO11 {

    public static void main(String[] args) {

        int n = 5;

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (i * (i + 1)) / 2;
        }

        System.out.println(sum);

        // sum of n natural number (n*(n+1))/2
    }

}