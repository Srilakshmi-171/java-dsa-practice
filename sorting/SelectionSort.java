public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {64, 25, 12, 22, 11};

        for (int i = 0; i < numbers.length - 1; i++) {

            int minimumIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minimumIndex];
            numbers[minimumIndex] = temp;
        }

        System.out.print("Sorted array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
