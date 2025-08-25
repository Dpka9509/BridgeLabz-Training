import java.util.Scanner;

public class SplitWordsWithLength {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end reached
        }
        return count;
    }

    // Method to split text into words manually (without split())
    public static String[] manualSplit(String text) {
        int length = findLength(text);

        // Step 1: Count spaces
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Step 2: Number of words = spaces + 1
        String[] words = new String[spaceCount + 1];

        // Step 3: Extract words manually
        int start = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        // last word
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array with word and its length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); // store length as String
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Split into words manually
        String[] words = manualSplit(input);

        // Get 2D array of words and lengths
        String[][] wordTable = wordsWithLength(words);

        // Display results in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]); // convert back to integer
            System.out.println(word + "\t" + length);
        }

        sc.close();
    }
}
