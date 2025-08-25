import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); // random age between 0 and 89
        }
        return ages;
    }

    // Method to check if students can vote
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // store age as string

            if (ages[i] < 0) {
                result[i][1] = "false (Invalid Age)";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Method to display results in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\n---------------------------");
        System.out.printf("%-10s | %-15s\n", "Age", "Can Vote?");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s | %-15s\n", row[0], row[1]);
        }
        System.out.println("---------------------------");
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Display result
        displayTable(results);

        sc.close();
    }
}
