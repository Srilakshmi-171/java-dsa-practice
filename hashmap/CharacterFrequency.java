import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        System.out.println(frequency);
    }
}
