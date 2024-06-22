// Write a program to find position of the smallest number & the largest number 
// from given n numbers.

public class PRO16 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 9, 7, 6, 8 };

        int small = arr[0];
        int large = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }

            if (arr[i] > large) {
                large = arr[i];
            }
        }

        System.out.println(small);
        System.out.println(large);

    }
}
