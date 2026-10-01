public class MoveZeroes {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 0, 3, 12};

        int position = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != 0) {

                int temp = numbers[position];
                numbers[position] = numbers[i];
                numbers[i] = temp;

                position++;
            }
        }

        System.out.print("Result: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
