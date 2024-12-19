// Count Vowels and Consonants
// Problem: Write a program to count the number of vowels and consonants in a string.
// Steps:
// Loop through the string and check if each character is a vowel or consonant.
// Use Character.toLowerCase() to handle both uppercase and lowercase letters.

package String;

public class VowelsAndConsonants {

    public static int[] countVowelsAndConsonantsUsingContains(String str) {
        int vowelsCount = 0;
        int consonantCount = 0;
        String vowelsString = "aeiou";

        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelsString.contains(String.valueOf(ch))) {
                    vowelsCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return new int[] { vowelsCount, consonantCount };
    }

    public static int[] countVowelsAndConsonantsUsingIndexOf(String str) {
        int vowelsCount = 0;
        int consonantCount = 0;
        String vowelsString = "aeiou";

        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelsString.indexOf(ch) != -1) {
                    vowelsCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return new int[] { vowelsCount, consonantCount };
    }

    public static void main() {
        String myString = "TheresiNemaHksAnsio";

        // int[] result = countVowelsAndConsonantsUsingIndexOf(myString);
        int[] result = countVowelsAndConsonantsUsingContains(myString);

        int vowels = result[0];
        int consonants = result[1];

        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }
}
