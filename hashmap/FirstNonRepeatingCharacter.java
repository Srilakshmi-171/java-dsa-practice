import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "swiss";

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (frequency.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
