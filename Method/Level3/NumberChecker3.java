public class NumberChecker3 {
   

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
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

    // Main method to test the utility class
    public static void main(String[] args) {
        int number = 12021; // You can change this number to test other values

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Digit Count: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Digits Array: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        boolean isEqual = areArraysEqual(digits, reversed);
        System.out.println("Are Original and Reversed Arrays Equal: " + isEqual);

        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is Palindrome Number: " + isPalindrome);

        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);
    }

}
