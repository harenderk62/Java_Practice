package Array;

import java.util.Arrays;

public class MoveZero {

    public static int[] moveZeroes(int[] arr) {

        int allNonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[allNonZeroIndex++] = arr[i];
            }
        }

        for (int i = allNonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 9, 0, 4, 0, 3, 2, 0 };

        int[] resultArray = moveZeroes(arr);

        System.out.println("Array after all the zeroes in the end: " + Arrays.toString(resultArray));
    }
}