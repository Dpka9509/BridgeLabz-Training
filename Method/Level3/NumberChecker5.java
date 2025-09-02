public class NumberChecker5 {
   

    // Method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if number is perfect
    public static boolean isPerfectNumber(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check if number is abundant
    public static boolean isAbundantNumber(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check if number is deficient
    public static boolean isDeficientNumber(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if number is strong
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Main method to test all checks
    public static void main(String[] args) {
        int number = 145; // Try with 6, 12, 28, 100, etc.

        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }

}
