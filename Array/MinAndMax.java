package Array;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter the elements of " + size + " size array: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println(" ");

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
            if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }

        System.out.println("Max value in given Array is " + maxValue + " and min value is " + minValue);

        scanner.close();
    }

}
