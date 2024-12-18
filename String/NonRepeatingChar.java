// Find the First Non-Repeating Character
// Problem: Write a program to find the first non-repeating character in a string.
// Steps:
// Traverse the string and use a HashMap or array to store the frequency of characters.
// Return the first character with a frequency of 1.

package String;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.LinkedHashMap;

public class NonRepeatingChar {

    // Using HashMap and stream
    public static char firstNonRepeatingCharUsingStream(String str) {

        if (str == null || str.isEmpty()) {
            return '\0';
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                char ch = Character.toUpperCase(c);
                charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
            }
        }

        Optional<Character> result = str.chars().mapToObj(c -> (char) c).filter(c -> c != ' ')
                .filter(c -> charCounts.get(Character.toUpperCase(c)) == 1).findFirst();

        return result.orElse('\0');
    }

    // using Hashmap and loop
    public static char firstNonRepeatingCharUsingHashMap(String str) {

        if (str == null || str.isEmpty()) {
            return '\0';
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toUpperCase(str.charAt(i));

            if (c == ' ') {
                continue;
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char result = '\0';

        for (char c : str.toCharArray()) {
            if (map.get(Character.toUpperCase(c)) == 1) {
                result = c;
                break;
            }
        }

        return result;
    }

    // using loop only
    public static char firstNonRepeatingCharUsingLoop(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }
        String newString = str.toLowerCase();

        for (int i = 0; i < newString.length(); i++) {
            char c = newString.charAt(i);
            if (newString.indexOf(c) == newString.lastIndexOf(c)) {
                return c;
            }
        }

        return '\0';
    }

    // using Linked HashMap and stream;
    public static char firstNonRepeatingCharUsingLinkedHashMap(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            char ch = Character.toUpperCase(c);
            if (ch != ' ') {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        Optional<Character> result = charCount.entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey)
                .findFirst();

        return result.orElse('\0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you String: ");
        String myString = scanner.nextLine();

        // char result = firstNonRepeatingCharUsingHashMap(myString);
        // char result = firstNonRepeatingCharUsingStream(myString);
        // char result = firstNonRepeatingCharUsingLoop(myString);
        char result = firstNonRepeatingCharUsingLinkedHashMap(myString);

        System.out.println("First non repeating char is " + result);

        scanner.close();
    }
}