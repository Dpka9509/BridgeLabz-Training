import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException without handling
    public static void generateException(String input) {
        // This will cause IllegalArgumentException (start > end)
        System.out.println("Generating exception...");
        String sub = input.substring(5, 2); 
        System.out.println("Substring: " + sub);
    }

    // Method to handle exception with try-catch
    public static void handleException(String input) {
        System.out.println("Handling exception...");
        try {
            // Again deliberately giving wrong indexes
            String sub = input.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // First call → program will stop abruptly due to unhandled exception
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Program stopped due to unhandled exception in generateException()");
        }

        // Second call → handled gracefully
        handleException(userInput);

        sc.close();
    }
}
