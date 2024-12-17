package Array;

public class Palindrome {

    public static boolean checkPalindrome(int[] arr) {
        int j = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 3, 2, 1 };

        boolean check = checkPalindrome(arr);

        System.out.println("Is palindrome ? " + check);
    }
}
