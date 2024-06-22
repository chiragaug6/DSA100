import java.util.*;

public class PRO22 {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 6, 8, 9, 3, 5, 7 };

        int index = 5;

        for (int i = index; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[arr.length - 1] = -1;
                break;
            }

            arr[i] = arr[i + 1];
        }

        System.out.println(Arrays.toString(arr));

    }
}
