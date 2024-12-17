package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PairSum {

    public static int[] findPairsUsingMap(int[] arr, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];

            if (map.containsKey(complement)) {
                int[] indexResult = { map.get(complement), i };
                int[] valueResult = { complement, arr[i] };

                System.out.println("Index Pair: " + Arrays.toString(indexResult) + " Values pair: "
                        + Arrays.toString(valueResult));
                return valueResult;
            }

            map.put(arr[i], i);
        }

        return new int[] {};

    }

    public static int[] findPairsUsingSet(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = sum - arr[i];

            if (set.contains(complement)) {
                return new int[] { complement, arr[i] };
            }

            set.add(arr[i]);
        }

        return new int[] {};
    }

    public static int[] findPairsUsingLoop(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    int[] resultValue = { arr[i], arr[j] };
                    int[] resultIndex = { i, j };
                    System.out.println("Value Pairs: " + Arrays.toString(resultValue) + " and Index Pairs: "
                            + Arrays.toString(resultIndex));
                    return resultValue;
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Method: 1) Map 2) Set or default-> nested loop : ");
        int choosen = scanner.nextInt();

        int[] myArray = { 1, 2, 3, 4, 5, 6 };
        int k = 10;

        int[] resultArray;

        if (choosen == 1) {
            resultArray = findPairsUsingMap(myArray, k);

        } else if (choosen == 2) {
            resultArray = findPairsUsingSet(myArray, k);
        } else {
            resultArray = findPairsUsingLoop(myArray, k);
        }
        System.out.println("Pairs: " + Arrays.toString(resultArray));

        scanner.close();
    }
}
