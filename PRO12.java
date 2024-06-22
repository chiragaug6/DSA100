/**
 * WAP to print Armstrong number from 1 to 1000
 */
public class PRO12 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }

        // System.out.println(isArmstrongNumber(531));
    }

    static boolean isArmstrongNumber(int num) {
        int totalDigits = String.valueOf(num).length();
        int sum = 0;
        int temp = num;

        while (num != 0) {
            int lastDigit = num % 10;

            sum += Math.pow(lastDigit, totalDigits);

            num = num / 10;
        }

        return sum == temp;
    }
}