package arrays.task1;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //int[] result = processWithoutDivision(array);
        int[] result = processWithDivision(array);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] processWithDivision(int[] array) {
        int[] resultArray = new int[array.length];
        int product = 1;

        for (int i : array) {
            product *= i;
        }

        for (int i = 0; i < array.length; i++) {
            int result = (int) (product * (1 / (float) array[i]));
            resultArray[i] = result;
        }

        return resultArray;
    }

    public static int[] processWithoutDivision(int[] array) {
        int[] resultArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int resultOfProduct = 1;
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                resultOfProduct *= array[j];
            }
            resultArray[i] = resultOfProduct;
        }

        return resultArray;
    }
}