import java.util.Scanner;

// WAP to replace lowercase characters by uppercase & vice-versa in a user specified string. 

public class PRO27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String ::");
        String str = sc.next();

        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLowerCase(charArr[i])) {
                charArr[i] = Character.toUpperCase(charArr[i]);
            } else if (Character.isUpperCase(charArr[i])) {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
        }
        // Method 1: Using String Constructor
        System.out.println(new String(charArr));

        // Method 2: Using String.valueOf
        System.out.println(String.valueOf(charArr));

        // Method 3: Using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (char c : charArr) {
            sb.append(c);
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
