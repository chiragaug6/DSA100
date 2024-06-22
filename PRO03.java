import java.util.Scanner;

/**
 * Write a program to determine whether the entered character is vowel or not.
 */
public class PRO03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char");

        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("Not Vowel");
        }

        sc.close();
    }
}