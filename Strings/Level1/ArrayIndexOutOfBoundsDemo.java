import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException without handling
    public static void generateException(String[] names, int index) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Accessing invalid index
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    // Method to handle ArrayIndexOutOfBoundsException with try-catch
    public static void handleException(String[] names, int index) {
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        System.out.println("Array length = " + names.length);
        System.out.print("Enter an index to access: ");
        int index = sc.nextInt();

        // First method → will throw exception abruptly
        try {
            generateException(names, index);
        } catch (Exception e) {
            System.out.println("Program stopped due to unhandled exception in generateException()");
        }

        // Second method → handled with try-catch
        handleException(names, index);

        sc.close();
    }
}
