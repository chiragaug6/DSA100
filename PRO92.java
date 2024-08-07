// 92. Write a program to implement Bubble using Array. 

import java.util.Arrays;

public class PRO92 {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < test.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < test.length - 1 - i; j++) {
                if (test[j + 1] < test[j]) {
                    isSwap = true;
                    int temp = test[j + 1];
                    test[j + 1] = test[j];
                    test[j] = temp;
                }
            }

            if (!isSwap) {
                break;
            }
        }

        System.out.println(Arrays.toString(test));
    }
}
