
// Write a program to insert a number at a given location in an array.
import java.util.*;

public class PRO21 {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 6, 8, 9, 3, 5, 7 };

        int index = 6;

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; index < i; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = 1000;

        System.out.println(Arrays.toString(arr));

    }
}
