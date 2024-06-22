package Extra;
public class ReplaceVowel {
    public static void main(String[] args) {
        String name = "chirag";

        System.out.println("replace all vowel in string with #" + name);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char letter = Character.toLowerCase(name.charAt(i));
            if (letter == 'a' || letter == 'i' || letter == 'o' || letter == 'e' || letter == 'u') {
                sb.append("#");
            } else {
                sb.append(letter);
            }

        }

        System.out.println(sb.toString());
    }
}
