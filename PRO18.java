// Read n numbers in an array then read two different numbers, replace 1st 
// number with 2nd number in an array and print its index and final array.

import java.util.Scanner;

public class PRO18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter Number");
        int num = sc.nextInt();

        System.out.println("Enter update Number");
        int num2 = sc.nextInt();

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (nums[i] == num) {
                nums[i] = num2;
                index = i;
                break;
            }
        }

        System.out.println(index);

        sc.close();
    }
}
