
/**
 * Write a program to delete duplicate numbers from an array.
 */
import java.util.HashSet;

public class PRO25 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 5 };

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set.toString());
    }
}

// another solution which is better is by sorting the array TC:O(nlogn) SC:O(1)