public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 4, 1, 2};

        for (int i = 1; i < numbers.length; i++) {

            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {

                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = current;
        }

        System.out.print("Sorted array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
