package Extra;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if ((num & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

        sc.close();
    }
}