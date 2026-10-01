public class FindMaximum {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 23};

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Maximum element: " + maximum);
    }
}
