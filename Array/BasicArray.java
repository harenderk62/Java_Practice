package Array;

import java.util.Scanner;

public class BasicArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        System.out.println("Enter " + size + " elements: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("The elements in the array are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Elements in the reverse order are: ");

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }

        scanner.close();
    }

}
