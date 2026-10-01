public class PairWithGivenSum {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                System.out.println(
                    "Pair: " + numbers[left] + " + " + numbers[right]
                );
                break;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
