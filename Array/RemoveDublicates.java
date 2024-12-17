package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveDublicates {

    public static int[] usingHashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] arrResult = new int[set.size()];

        int index = 0;
        for (int num : set) {
            arrResult[index++] = num;
        }

        return arrResult;
    }

    public static int[] usingAnotherArray(int[] arr) {
        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }

        int[] arrResult = Arrays.copyOf(temp, j);

        return arrResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the " + size + " elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + " Element");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Enter 1 to do it using SET else with new array method: ");
        int method = scanner.nextInt();

        int[] result;

        if (method == 1) {
            result = usingHashSet(myArray);
        } else {
            result = usingAnotherArray(myArray);
        }

        System.out.println("Array after removing dublicates: " + Arrays.toString(result));

        scanner.close();
    }

}
