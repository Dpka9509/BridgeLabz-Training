import java.util.Scanner;

public class DivisionCalculator {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number % divisor;    // Remainder
        result[1] = number / divisor;    // Quotient
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            int[] output = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + output[1]);
            System.out.println("Remainder: " + output[0]);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        scanner.close();
    }
}
