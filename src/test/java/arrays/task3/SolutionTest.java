package arrays.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    public void returns_proper_maximum_subarray_sum_with_six_numbers() {
        int[] numbers = {34, -50, 42, 14, -5, 86};
        int numbersExpected = 137;
        int result = Solution.calculateMaximumSubarraySum(numbers);

        assertEquals(numbersExpected, result);
    }

    @Test
    public void returns_proper_maximum_subarray_sum_with_four_numbers() {
        int[] numbers = {-5, -1, -8, -9};
        int numbersExpected = 0;
        int result = Solution.calculateMaximumSubarraySum(numbers);

        assertEquals(numbersExpected, result);
    }
}