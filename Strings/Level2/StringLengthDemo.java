import java.util.Scanner;

public class StringLengthDemo {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {  // infinite loop
                text.charAt(count); // will throw exception when count exceeds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exception means end of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();  // Scanner next() → reads one word

        // Using user-defined method
        int customLength = findLength(input);

        // Using built-in method
        int builtInLength = input.length();

        // Display results
        System.out.println("Original String     : " + input);
        System.out.println("Custom Length       : " + customLength);
        System.out.println("Built-in Length     : " + builtInLength);

        sc.close();
    }
}
