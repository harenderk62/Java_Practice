package Array;

import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {

    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] resultArr = new int[(arr1.length + arr2.length)];
        int i = 0, j = 0, z = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                resultArr[z++] = arr1[i];
                i++;
            } else {
                resultArr[z++] = arr2[j];
                j++;
            }
        }

        while (i < arr1.length) {
            resultArr[z++] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            resultArr[z++] = arr2[j];
            j++;
        }

        return resultArr;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of 1st array: ");
        int size1 = scanner.nextInt();

        int[] myArray1 = new int[size1];

        System.out.println("Enter the elements of 1st array: ");
        for (int i = 0; i < size1; i++) {
            System.out.println((i + 1) + " Element");
            myArray1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of 2nd array: ");
        int size2 = scanner.nextInt();

        int[] myArray2 = new int[size2];
        System.out.println("Enter the elements of 2nd array: ");
        for (int i = 0; i < size2; i++) {
            System.out.println((i + 1) + " Element");
            myArray2[i] = scanner.nextInt();
        }

        System.out.println("1st Array: " + Arrays.toString(myArray1) + " and 2nd array: " + Arrays.toString(myArray2));

        int[] arrResult = mergeSortedArray(myArray1, myArray2);

        System.out.println("Merged sorted Array result: " + Arrays.toString(arrResult));

        scanner.close();
    }
}
