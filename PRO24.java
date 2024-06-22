
/**
 * Write a program to delete a number from an array that is already sorted in an
 * ascending order.
 */

import java.util.Arrays;

public class PRO24 {
    public static void main(String[] args) {
        int[] nums = { 5, 9, 12, 15, 16, 18, 21, 29 };
        int target = 29;

        int index = binarySearch(nums, target);

        if (index != -1) {
            System.out.println(Arrays.toString(deleteElement(nums, index, index)));
        } else {
            System.out.println("Element Not Present In Array");
        }
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

        return -1;
    }

    static int[] deleteElement(int[] nums, int deleteIndex, int number) {
        int[] temp = new int[nums.length - 1];

        for (int i = 0; i < deleteIndex; i++) {
            temp[i] = nums[i];
        }

        for (int i = deleteIndex + 1; i < nums.length; i++) {
            temp[i - 1] = nums[i];
        }

        return temp;
    }
}