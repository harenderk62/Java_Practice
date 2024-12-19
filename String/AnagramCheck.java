// String Anagram Check
// Problem: Write a program to check if two strings are anagrams (i.e., both strings contain the same characters in the same frequency).
// Steps:
// Sort both strings and compare them.
// Alternatively, use a frequency array or HashMap to check if both strings have the same character frequencies.

package String;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class AnagramCheck {

    public static boolean checkAnagramUsingSort(String str1, String str2) {

        if (str1 == str2) {
            return true;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] sortedStr1 = str1.toCharArray();
        Arrays.sort(sortedStr1);

        char[] sortedStr2 = str2.toCharArray();
        Arrays.sort(sortedStr2);

        for (int i = 0; i < str1.length(); i++) {
            if (sortedStr1[i] != sortedStr2[i]) {
                return false;
            }
        }

        return true;

    }

    public static boolean checkAnagramUsingHashMap(String str1, String str2) {
        if (str1 == str2) {
            return true;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> countChar1 = new HashMap<>();
        Map<Character, Integer> countChar2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            countChar1.put(c1, countChar1.getOrDefault(c1, 0) + 1);
            countChar2.put(c2, countChar2.getOrDefault(c2, 0) + 1);
        }

        return countChar1.equals(countChar2);
    }

    public static void main(String[] args) {
        String myString1 = "abcsbs";
        String myString2 = "ssbabc";

        // boolean isAnagram = checkAnagramUsingSort(myString1, myString2);
        boolean isAnagram = checkAnagramUsingHashMap(myString1, myString2);

        System.out.println("Is the given Strings Anagram: " + isAnagram);

    }
}