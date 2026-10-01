public class FindDuplicates {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 9, 5};

        for (int i = 0; i < numbers.length; i++) {

            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("Duplicate: " + numbers[i]);
            }
        }
    }
}
