import java.util.Scanner;
import java.util.Arrays;

/**
 * Read two matrices, first 3x2 and second 2x3, perform multiplication operation
 * and store result in third matrix and print it.
 */

public class PRO31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for matrix 1
        System.out.print("How many Rows in Matrix 1: ");
        int rows = sc.nextInt();
        System.out.print("How many Cols in Matrix 1: ");
        int cols = sc.nextInt();

        // Input for matrix 2
        System.out.print("How many Rows in Matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("How many Rows in Matrix 2: ");
        int cols2 = sc.nextInt();

        if (rows != cols2) {
            System.out.println("Rows of Matrix one and Cols of Matrix two should be equals");
            sc.close();
            return;
        }

        // creating both matrix
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows2][cols2];
        int[][] result = new int[rows][cols2];

        // taking number input for matrix
        System.out.println("Matrix 1 Input:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter Number row " + i + " col " + j + "::");
                mat1[i][j] = sc.nextInt();
            }
        }

        // taking number input for matrix
        System.out.println("Matrix 2 Input:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter Number row " + i + " col " + j + "::");
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.println("ok");
            }
        }

        // printing matrix 1
        System.out.println("MATRIX 1:");
        for (int[] row : mat1) {
            System.out.println(Arrays.toString(row));
        }

        // printing matrix 2
        System.out.println("MATRIX 2:");
        for (int[] row : mat2) {
            System.out.println(Arrays.toString(row));
        }
        // printing result matrix
        System.out.println("Result Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
}
