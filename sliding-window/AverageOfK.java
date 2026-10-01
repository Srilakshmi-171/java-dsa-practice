public class AverageOfK {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};
        int k = 3;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += numbers[i];
        }

        System.out.println("Average: " + (double) windowSum / k);

        for (int i = k; i < numbers.length; i++) {

            windowSum += numbers[i];
            windowSum -= numbers[i - k];

            double average = (double) windowSum / k;

            System.out.println("Average: " + average);
        }
    }
}
