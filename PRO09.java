
/**
 * WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS
 * [e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].
 */

import java.util.Scanner;

public class PRO09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total Seconds");
        int tseconds = sc.nextInt();

        int hours = tseconds / 3600;

        int remaningSec = tseconds % 3600;

        int minutes = remaningSec / 60;

        int seconds = remaningSec % 60;

        System.out.println(hours + "hours" + minutes + "min" + seconds + "sec");

        sc.close();
    }
}