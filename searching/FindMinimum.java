public class FindMinimum {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 7, 89, 23};

        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        System.out.println("Minimum element: " + minimum);
    }
}
