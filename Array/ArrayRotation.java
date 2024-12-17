package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void reverse(int[] arr, int start, int end) {
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }

    }

    public static void rotateArray(int[] myArray, int k) {

        reverse(myArray, 0, myArray.length - 1);
        reverse(myArray, 0, k - 1);
        reverse(myArray, k, myArray.length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of an Array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " element: ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the k, from which you want to rotate the array: ");
        int k = scanner.nextInt() % size;

        rotateArray(myArray, k);

        System.out.println("Result: " + Arrays.toString(myArray));

        scanner.close();
    }
}
