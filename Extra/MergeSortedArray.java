package Extra;

/**
 * Write a program to merge two sorted arrays.
 */

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9, 11 };

        int[] arr2 = { 2, 4, 6, 8, 10, 12 };

        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    static int[] mergeArray(int[] arr1, int[] arr2) {
        int[] finalArray = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;

        int index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                finalArray[index] = arr1[i];
                i++;
            } else {
                finalArray[index] = arr2[j];
                j++;
            }
            index++;
        }

        while (i < arr1.length) {
            finalArray[index] = arr1[i];
            index++;
            i++;
        }

        while (j < arr2.length) {
            finalArray[index] = arr2[j];
            index++;
            j++;
        }

        return finalArray;
    }

    // Without extra space // https://leetcode.com/problems/merge-sorted-array/

}