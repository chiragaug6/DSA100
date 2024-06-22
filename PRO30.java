
/**
 * Read two 2x2 matrices and perform addition of matrices into third matrix and
 * print it
 */

import java.util.Scanner;
import java.util.Arrays;

public class PRO30 {
    public static void main(String[] args) {
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] result = new int[2][2];

        Scanner sc = new Scanner(System.in);

        // take input for matrix 1
        System.out.println("Enter Matrix 1 Numbers");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter Number::");
                mat1[i][j] = sc.nextInt();
            }
        }

        // take input for matrix 2
        System.out.println("Enter Matrix 2 Numbers");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter Number::");
                mat2[i][j] = sc.nextInt();
            }
        }

        // Print matrix 1
        System.out.println("Matrix 1");
        for (int[] row : mat1) {
            System.out.println(Arrays.toString(row));
        }

        // Print matrix 2
        System.out.println("Matrix 2");
        for (int[] row : mat2) {
            System.out.println(Arrays.toString(row));
        }

        // result matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Print result matrix
        System.out.println("Matrix 1 + Matrix 2 :");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
}