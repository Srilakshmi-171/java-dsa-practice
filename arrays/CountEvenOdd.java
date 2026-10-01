public class CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 8};

        int even = 0;
        int odd = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
