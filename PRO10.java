
/**
 * WAP to convert number of days into year, week & days [e.g. 375 days mean 1
 * year, 1 week and 3 days].
 */

import java.util.Scanner;;

public class PRO10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total days");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;

        int remaningDays = totalDays % 365;

        int weeks = remaningDays / 7;

        int days = remaningDays % 7;

        System.out.println(years + " " + weeks + " " + days);

        sc.close();
    }
}