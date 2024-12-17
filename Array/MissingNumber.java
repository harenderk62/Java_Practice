package Array;

import java.util.Scanner;

public class MissingNumber {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sumOfN = n * (n + 1) / 2;

        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return sumOfN - arrSum;
    }

    public static int findMissingNumberUsingXOR(int[] arr) {
        int n = arr.length + 1;

        int xor1 = 0;
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        int xor2 = 0;
        for (int num : arr) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to user XOR method else anything to use sum method: ");
        int methodUse = scanner.nextInt();

        int[] arr = { 1, 2, 4, 5, 6 };

        int result;

        if (methodUse == 1) {
            result = findMissingNumberUsingXOR(arr);
        } else {

            result = findMissingNumber(arr);
        }

        System.out.println("Missing number is " + result);

        scanner.close();
    }
}
