import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException without handling
    public static void generateException(String input) {
        System.out.println("Generating NumberFormatException...");
        // This will throw NumberFormatException if input is not a valid integer
        int num = Integer.parseInt(input);
        System.out.println("Converted Number: " + num);
    }

    // Method to handle NumberFormatException with try-catch
    public static void handleException(String input) {
        System.out.println("Handling NumberFormatException...");
        try {
            int num = Integer.parseInt(input);
            System.out.println("Converted Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // First method → will throw exception abruptly
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Program stopped due to unhandled exception in generateException()");
        }

        // Second method → handled with try-catch
        handleException(userInput);

        sc.close();
    }
}
