import java.util.Arrays;
import java.util.HashMap;
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

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);

            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);

            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) - 1);

                if (freq.get(c) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}

/**
 * Method 1: Sorting
 * Approach:
 * 
 * Convert both strings to character arrays.
 * Sort both character arrays.
 * Compare the sorted arrays.
 * 
 * Time Complexity: O(n log n), where n is the length of the strings (due to
 * sorting).
 * Space Complexity: O(n), where n is the length of the strings (due to creating
 * character arrays).
 */

/**
 * Method 2: Counting Characters with HashMap
 * Approach:
 * 
 * Use a hash map to count the frequency of each character in the first string.
 * Decrement the count for each character in the second string.
 * Check if all counts are zero.
 * 
 * Time Complexity: O(n), where n is the length of the strings (one pass through
 * each string).
 * Space Complexity: O(1), since the map will have at most 26 keys (assuming
 * only lowercase English letters).
 */