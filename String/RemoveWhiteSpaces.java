package String;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static String usingStringBuilder(String str) {
        StringBuilder myStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                myStr.append(str.charAt(i));
            }
        }

        return myStr.toString();
    }

    public static String usingRegex(String str) {
        return str.replaceAll("\\s+", "");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String myString = scanner.nextLine();

        System.out.println("Using StringBuilder choose 1 or for using regex choose other number: ");
        int option = scanner.nextInt();

        String result;
        if (option == 1) {
            result = usingStringBuilder(myString);
        } else {
            result = usingRegex(myString);
        }

        System.out.println("String after removing all the Blank spaces: " + result);

        scanner.close();
    }
}
