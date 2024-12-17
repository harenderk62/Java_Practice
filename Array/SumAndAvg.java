package Array;

import java.util.Arrays;

public class SumAndAvg {

    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Elements in an Array are " + Arrays.toString(myArray));

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        if (myArray.length > 0) {
            System.out.println("Sum of all the elements is " + sum + " and avg is " + (double) sum / myArray.length);
        } else {
            System.out.println("Please Enter atleast one element in an array");
        }

    }

}
