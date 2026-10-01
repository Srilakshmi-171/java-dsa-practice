import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println(uniqueNumbers);
    }
}
