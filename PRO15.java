import java.util.Scanner;

public class PRO15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();

        int avg = ((n * (n + 1)) / 2) / n;

        System.out.println(avg);

        sc.close();
    }
}
