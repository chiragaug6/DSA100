import java.util.Arrays;
import java.util.Scanner;

public class PRO32 {
    public static void main(String[] args) {
        System.out.print("Enter size :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] words = new String[size];

        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter word::");
            words[i] = sc.next();
        }

        System.out.println(Arrays.toString(words));

        int randomIndex = (int) (Math.random() * size);

        System.out.print("Enter anagram for :: " + words[randomIndex] + " ::");
        String str = sc.next();

        if (isAnagram(words[randomIndex], str)) {
            System.out.println("Congratulations! You guessed the correct anagram.");
        } else {
            System.out.println("Oops! The entered word is not an anagram.");
        }

        sc.close();
    }

    static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if (!word2.contains(Character.toString(c))) {
                return false;
            }
        }
        return true;
    }
}
