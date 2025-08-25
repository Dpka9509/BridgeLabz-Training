import java.util.Scanner;

public class SplitTextDemo {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end reached
        }
        return count;
    }

    // Method to split string into words manually
    public static String[] manualSplit(String text) {
        int length = findLength(text);

        // Step 1: Count spaces to determine number of words
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Number of words = spaces + 1
        String[] words = new String[spaceCount + 1];

        // Step 2: Extract words manually
        int start = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1; // next word starts after space
            }
        }
        // Last word after last space
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Built-in split
        String[] builtInSplit = input.split(" ");

        // Manual split
        String[] manualSplit = manualSplit(input);

        // Compare
        boolean isEqual = compareArrays(builtInSplit, manualSplit);

        // Display results
        System.out.println("\nBuilt-in Split:");
        for (String w : builtInSplit) {
            System.out.println(w);
        }

        System.out.println("\nManual Split:");
        for (String w : manualSplit) {
            System.out.println(w);
        }

        System.out.println("\nAre both splits equal? " + isEqual);

        sc.close();
    }
}
