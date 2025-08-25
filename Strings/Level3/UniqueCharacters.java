import java.util.Scanner;

public class UniqueCharacters {

    // Find length without length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Find unique characters
    public static char[] findUnique(String text) {
        int len = getLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[uniqueCount++] = c;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] uniques = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : uniques) System.out.print(c + " ");
    }
}
