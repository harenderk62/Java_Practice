package String;

import java.util.Scanner;

public class ReverseString {

    public static String usingLoop(String str) {

        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        return reverseStr;
    }

    public static String usingStringBuilder(String str) {
        StringBuilder myString = new StringBuilder(str);

        myString.reverse();
        return myString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String myString = scanner.nextLine();

        System.out.println("Enter 1 to use Loop method else StringBuilder method: ");
        int way = scanner.nextInt();

        String reverseStr;
        if (way == 1) {
            reverseStr = usingLoop(myString);
        } else {
            reverseStr = usingStringBuilder(myString);
        }

        System.out.println("Reversed String: " + reverseStr);

        scanner.close();
    }
}