// Substring Search
// Problem: Write a program to check if one string is a substring of another.
// Steps:
// Use the contains method or indexOf to check if the substring exists within the main string.

package String;

public class SubString {

    public static boolean isSubStringUsingContain(String str, String subStr) {
        if (str == null || subStr == null) {
            return false;
        }

        return str.toLowerCase().contains(subStr.toLowerCase());

    }

    public static boolean isSubStringUsingIndexOf(String str, String subString) {
        return str.toLowerCase().indexOf(subString.toLowerCase()) != -1;
    }

    public static void main() {
        String myString = "Hello";
        String subStr = "llo";

        boolean result = isSubStringUsingContain(myString, subStr);

        System.out.println("Is it sub string:" + result);
    }
}
