package arrays.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    public void returns_proper_window_when_min_number_and_max_value_is_at_the_edge() {
        int[] numbers = {3, 7, 5, 6, 9};
        int[] numbersExpected = {1, 3};
        int[] result = Solution.locateSmallestWindowToBeSorted(numbers);

        assertArrayEquals(result, numbersExpected);
    }

    @Test
    public void returns_proper_window_when_min_number_and_max_value_is_not_at_the_edge() {
        int[] numbers = {7, 5, 6, 9, 13, 17, 15, 12, 16, 19, 3};
        int[] numbersExpected = {0, 10};
        int[] result = Solution.locateSmallestWindowToBeSorted(numbers);

        assertArrayEquals(result, numbersExpected);
    }
}