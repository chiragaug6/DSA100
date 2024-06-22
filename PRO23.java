/**
 * Write a program to insert a number in an array that is already sorted in an
 * ascending order.
 */
import java.util.Arrays;

public class PRO23 {
    public static void main(String[] args) {
        int[] nums = { 5, 9, 12, 15, 16, 18, 21, 29 };
        int target = 19;

        int index = binarySearch(nums, target);

        System.out.println(Arrays.toString(insertIntoArray(nums, index, target)));
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    static int[] insertIntoArray(int[] nums, int insertIndex, int number) {
        int[] temp = new int[nums.length + 1];

        for (int i = 0; i < insertIndex; i++) {
            temp[i] = nums[i];
        }

        temp[insertIndex] = number;

        for (int i = insertIndex; i < nums.length; i++) {
            temp[i + 1] = nums[i];
        }

        return temp;
    }
}