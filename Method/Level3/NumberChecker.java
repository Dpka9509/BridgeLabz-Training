
public class NumberChecker {

    // Method to count digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to check if number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        int number = 153; // You can change this to test other numbers

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out.println("Second Largest Digit: " + largestTwo[1]);

        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println("Second Smallest Digit: " + smallestTwo[1]);
    }
}