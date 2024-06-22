// Write a program to find whether the array contains a duplicate number or not. 

import java.util.HashSet;
import java.util.Scanner;

public class PRO17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 7, 6, 8, 7 };
        int[] arr2 = { 1, 2, 3, 4, 5 };

        System.out.println(checkDuplicate(arr)); // true
        System.out.println(checkDuplicate(arr2)); // false
        sc.close();
    }

    // Method 1: Brute Force O(n2).
    // Method 2: Sorting
    // O(nlogn)

    static boolean checkDuplicate(int[] arr) {
        HashSet<Integer> myset = new HashSet<>();

        for (int i : arr) {
            if (myset.contains(i)) {
                return true;
            }
            myset.add(i);
        }

        return false;
    }
}
