public class  NumberChecker6 {
    

    // Method to find factors of a number and return them as an array
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Main method to test all functionality
    public static void main(String[] args) {
        int number = 12; // You can change this to test other numbers

        System.out.println("Number: " + number);

        int[] factors = getFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        int greatest = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatest);

        int sum = sumOfFactors(factors);
        System.out.println("Sum of Factors: " + sum);

        long product = productOfFactors(factors);
        System.out.println("Product of Factors: " + product);

        double cubeProduct = productOfCubes(factors);
        System.out.printf("Product of Cubes of Factors: %.2f\n", cubeProduct);
    }
}

