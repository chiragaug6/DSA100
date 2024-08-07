// 93. Write a program to implement Insertion Sort using Array.

import java.util.Arrays;

public class PRO93 {
    public static void main(String[] args) {
        int[] array = { 4, 3, 2, 1, 5, 7, 6, 9, 8 };

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
