// Write a program to calculate area of a Circle (A = πr2).

import java.util.Scanner;

public class PRO01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float pi = 3.14f;

        System.out.println("Enter radius");
        double r = sc.nextDouble();
        float area = (float) (Math.PI * r * r);
        System.out.println(area);

        sc.close();
    }
}