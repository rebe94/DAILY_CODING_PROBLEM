package arrays.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void returnProductOfNumbersWithDivision() {
        int[] numbers = {1,2,3,4,5};
        int[] numbersExpected = {120,60,40,30,24};
        int[] result = Solution.processWithDivision(numbers);

        assertArrayEquals(numbersExpected,result);
    }

    @Test
    void returnProductOfNumbersWithoutDivision() {
        int[] numbers = {1,2,3,4,5};
        int[] numbersExpected = {120,60,40,30,24};
        int[] result = Solution.processWithoutDivision(numbers);

        assertArrayEquals(numbersExpected,result);
    }

    @Test
    void returnArraysWithZerosWhenOneOfNumbersIsZero() {
        int[] numbers = {1,0,3,4,5};
        int[] numbersExpected = {0,0,0,0,0};
        int[] result = Solution.processWithDivision(numbers);

        assertArrayEquals(numbersExpected,result);
    }
}