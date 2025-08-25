import java.util.Scanner;

public class UpperCaseConversion {

    // Method to convert text to uppercase manually using ASCII values
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Convert using built-in method
        String builtInUpper = input.toUpperCase();

        // Convert using manual method
        String manualUpper = manualToUpperCase(input);

        // Compare results
        boolean isEqual = compareStrings(builtInUpper, manualUpper);

        // Display results
        System.out.println("Original Text      : " + input);
        System.out.println("Built-in Uppercase : " + builtInUpper);
        System.out.println("Manual Uppercase   : " + manualUpper);
        System.out.println("Are both equal?    : " + isEqual);

        sc.close();
    }
}
