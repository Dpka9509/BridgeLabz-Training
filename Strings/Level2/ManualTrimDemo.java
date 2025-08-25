import java.util.Scanner;

public class ManualTrimDemo {

    // Method to find leading and trailing space indexes
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
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

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        // Get trim indexes
        int[] indexes = findTrimIndexes(input);

        // Trim using manual method
        String manualTrimmed = manualSubstring(input, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrimmed = input.trim();

        // Compare both
        boolean isEqual = compareStrings(manualTrimmed, builtInTrimmed);

        // Display result
        System.out.println("\nOriginal String   : [" + input + "]");
        System.out.println("Manual Trimmed    : [" + manualTrimmed + "]");
        System.out.println("Built-in Trimmed  : [" + builtInTrimmed + "]");
        System.out.println("Are both equal?   : " + isEqual);

        sc.close();
    }
}
