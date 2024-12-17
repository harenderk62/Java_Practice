package String;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount {

    public static HashMap<Character, Integer> charCountUsingMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(Character.toLowerCase(str.charAt(i)))) {
                map.put(Character.toLowerCase(str.charAt(i)), map.get(Character.toLowerCase(str.charAt(i))) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        return map;
    }

    public static Integer countSpecificChar(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String myString = scanner.nextLine();

        System.out.println("want to count specific char? y/n: ");
        char opt = scanner.next().charAt(0);

        if (opt == 'y') {
            System.out.println("Which Char? ");
            char ch = scanner.next().charAt(0);

            int result = countSpecificChar(myString, ch);

            System.out.println("Character " + ch + " occured " + result + " times");
        } else {
            HashMap<Character, Integer> result = charCountUsingMap(myString);

            result.forEach((key, value) -> {
                System.out.println("Char: " + Character.toUpperCase(key) + " has occured " + value + " times");

            });
        }

        scanner.close();
    }
}
