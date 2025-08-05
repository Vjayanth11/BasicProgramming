package logicalproblems;
public class MissingInApFinder {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }
        int d = (max - min) / (n - 1);
        int expectedSum = (n * (2 * min + (n - 1) * d)) / 2;
        return expectedSum - sum;
    }
}
