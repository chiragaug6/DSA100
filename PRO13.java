
/**
 * . Write a program to read and display n numbers using an array.
 */

import java.util.Scanner;
import java.util.Arrays;

public class PRO13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(Arrays.binarySearch(arr, 5));

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}