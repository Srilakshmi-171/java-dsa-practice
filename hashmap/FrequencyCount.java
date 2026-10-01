import java.util.HashMap;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {

            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.get(number) + 1);
            } else {
                frequency.put(number, 1);
            }
        }

        System.out.println(frequency);
    }
}
