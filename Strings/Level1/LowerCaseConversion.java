import java.util.Scanner;

public class LowerCaseConversion {

    // Method to convert text to lowercase manually using ASCII values
    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char)(ch + 32);
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
        String builtInLower = input.toLowerCase();

        // Convert using manual method
        String manualLower = manualToLowerCase(input);

        // Compare results
        boolean isEqual = compareStrings(builtInLower, manualLower);

        // Display results
        System.out.println("Original Text      : " + input);
        System.out.println("Built-in Lowercase : " + builtInLower);
        System.out.println("Manual Lowercase   : " + manualLower);
        System.out.println("Are both equal?    : " + isEqual);

        sc.close();
    }
}
