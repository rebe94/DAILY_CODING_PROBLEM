package arrays.task3;

import static java.lang.Math.max;

public class Solution {

    public static int calculateMaximumSubarraySum(int[] numbers) {
        int max_ending_here = 0; // to dotychczas zapisana suma kolejno dodawanych
                                // liczb iterując od lewej do prawej,
                                // czyli po każdej iteracji dodajemy kolejną liczbę do tej zmiennej
        int max_so_far = 0;     // to największa zauważona suma, dla nieprzerwanego ciągu liczb
        for (int number : numbers) {
            max_ending_here = max(number, (max_ending_here + number));
            max_so_far = max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}