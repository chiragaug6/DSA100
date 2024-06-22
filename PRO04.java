import java.util.Scanner;

/**
 * Write a program to find factorial of a number. (Using Loop)
 */
public class PRO04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);

        sc.close();
    }
}