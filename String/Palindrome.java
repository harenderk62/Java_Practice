package String;

public class Palindrome {

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String myString = "Hello";

        boolean isPalindrome = checkPalindrome(myString);

        if (isPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome string");
        }
    }

}
