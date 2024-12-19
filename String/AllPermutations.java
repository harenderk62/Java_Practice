// Find All Permutations of a String
// Problem: Write a program to print all permutations of a given string.
// Steps:
// Use recursion to generate all permutations of the string.
// Keep track of the characters used and avoid duplicates.

package String;

import java.util.HashSet;
import java.util.Set;

public class AllPermutations {

    public static void generatePermutation(String prefix, String remaining, Set<String> permutations) {
        int size = remaining.length();

        if (size == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < size; i++) {
                generatePermutation(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1), permutations);
            }
        }
    }

    public static Set<String> getAllPermutations(String str) {
        Set<String> permutations = new HashSet<>();
        generatePermutation("", str, permutations);

        return permutations;
    }

    public static void main() {
        String myString = "ABC";

        Set<String> result = getAllPermutations(myString);

        for (String ch : result) {
            System.out.println(ch);
        }
    }
}
