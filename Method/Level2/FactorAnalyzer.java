import java.util.Scanner;

public class FactorAnalyzer {

    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int[] factors = findFactors(number);

            System.out.print("Factors of " + number + ": ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();

            int sum = sumOfFactors(factors);
            int product = productOfFactors(factors);
            double sumSquares = sumOfSquares(factors);

            System.out.println("Sum of factors: " + sum);
            System.out.println("Product of factors: " + product);
            System.out.printf("Sum of squares of factors: %.2f%n", sumSquares);
        }

        scanner.close();
    }
}
