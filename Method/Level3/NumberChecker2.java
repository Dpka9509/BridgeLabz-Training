public class NumberChecker2 {
   

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

    // Method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // 0-9 digits
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        int number = 4214; // You can change this number to test other values

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " time(s)");
            }
        }
    }
}

