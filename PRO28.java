
/**
 * Suppose you are senior developer for an Relational Database Management System
 * named "Array Database" where everything is implemented using only array,
 * today
 * your task is to implement aggregate function like sum, min, max, avg. For
 * simplicity,
 * assume that your database can only store integers.
 */
import java.util.Arrays;

public class PRO28 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        ArrayDatabase arrayDB = new ArrayDatabase(arr);

        arrayDB.printArray();
        System.out.println(arrayDB.sum());
        System.out.println(arrayDB.avg());
        System.out.println(arrayDB.min());
        System.out.println(arrayDB.max());
    }
}

class ArrayDatabase {
    private int[] nums;

    ArrayDatabase(int[] arr) {
        this.nums = arr;
    }

    public void printArray() {
        System.out.println(Arrays.toString(this.nums));
    }

    public int sum() {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return sum;
    }

    public int avg() {
        return sum() / nums.length;
    }

    public int min() {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int max() {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}