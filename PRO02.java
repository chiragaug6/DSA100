import java.util.Scanner;

/**
 * Write a program to find whether a number is odd or even
 */
public class PRO02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int num = sc.nextInt();

        // Using Ternary Operator
        String res = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + res);

        // Using Bitwise AND Operator

        sc.close();
    }
}