// String Compression
// Problem: Write a program that compresses a string by converting consecutive characters to the character followed by the count of repetitions.
// Steps:
// Traverse the string and check consecutive characters.
// If a character repeats, append the count; otherwise, append the character.
package String;

public class StringCompression {
    public static String getStringCompression(String str) {

        if (str == null || str.isEmpty()) {
            return " ";
        }

        StringBuilder result = new StringBuilder();

        char currentChar = str.charAt(0);
        int count = 1;

        for (char c : str.toCharArray()) {
            if (c == currentChar) {
                count++;
            } else {
                result.append(currentChar);
                result.append(count);
                currentChar = c;
                count = 1;
            }
        }

        result.append(currentChar);
        result.append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        String myString = "aabbcdddee";

        String result = getStringCompression(myString);

        System.out.println("String Compression: " + result);
    }
}
