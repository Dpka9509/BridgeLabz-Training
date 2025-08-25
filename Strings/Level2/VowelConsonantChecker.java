import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check character type: Vowel, Consonant, or Not a Letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII (+32)
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check consonants
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // Not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to analyze string and return 2D array of character + type
    public static String[][] analyzeString(String text) {
        int length = text.length(); // here we can use built-in length() safely
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); // store character
            result[i][1] = checkCharType(ch);  // store type
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Analyze
        String[][] analysis = analyzeString(input);

        // Display
        displayResult(analysis);

        sc.close();
    }
}
