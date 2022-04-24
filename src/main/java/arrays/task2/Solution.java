package arrays.task2;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution {

    public static int[] locateSmallestWindowToBeSorted(int[] numbers) {
        int left = 0, right = 0;
        int min_seen = Integer.MAX_VALUE;
        int max_seen = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            max_seen = max(max_seen, numbers[i]);
            if (numbers[i] < max_seen) {
                right = i;
            }
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            min_seen = min(min_seen, numbers[i]);
            if (numbers[i] > min_seen) {
                left = i;
            }
        }

        return new int[]{left, right};
    }

}