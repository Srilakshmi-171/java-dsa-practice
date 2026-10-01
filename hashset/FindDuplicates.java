import java.util.HashSet;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 5, 4};

        HashSet<Integer> seen = new HashSet<>();

        for (int number : numbers) {

            if (!seen.add(number)) {
                System.out.println("Duplicate: " + number);
            }
        }
    }
}
