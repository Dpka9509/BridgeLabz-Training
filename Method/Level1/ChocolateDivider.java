import java.util.Scanner;

public class ChocolateDivider {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number % divisor;    // Remainder
        result[1] = number / divisor;    // Quotient
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren > 0) {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets " + result[1] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[0]);
        } else {
            System.out.println("Number of children must be greater than zero.");
        }

        scanner.close();
    }
}
