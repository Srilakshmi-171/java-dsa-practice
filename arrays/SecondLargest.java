class Main {
    public static void main(String[] args) {

        int[] arr = {5, 5, 5, 5};

        int max = arr[0];
        int second = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int n : arr) {

            if (n > max) {
                second = max;
                max = n;
                foundSecond = true;
            }
            else if (n > second && n != max) {
                second = n;
                foundSecond = true;
            }
        }

        if (foundSecond) {
            System.out.println(second);
        } else {
            System.out.println("No second distinct largest value");
        }
    }
}
