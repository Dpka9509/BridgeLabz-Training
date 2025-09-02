import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // Range: 100000 to 999999
    }

    // Method to generate 10 OTPs and store them in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] otpArray = generateMultipleOTPs(10);

        System.out.println("Generated OTPs:");
        System.out.println(Arrays.toString(otpArray));

        boolean unique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
