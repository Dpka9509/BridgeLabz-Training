import java.util.Scanner;

public class StudentMarks {

    // Method to generate random 2-digit PCM scores for students
    public static int[][] generatePCMScores(int studentCount) {
        int[][] scores = new int[studentCount][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Math
        for (int i = 0; i < studentCount; i++) {
            scores[i][0] = (int)(Math.random() * 50) + 50; // Physics: 50–99
            scores[i][1] = (int)(Math.random() * 50) + 50; // Chemistry: 50–99
            scores[i][2] = (int)(Math.random() * 50) + 50; // Math: 50–99
        }
        return scores;
    }

    // Method to compute and display total, average, and percentage
    public static void displayResults(int[][] scores) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int math = scores[i][2];
            int total = physics + chemistry + math;
            double average = total / 3.0;
            double percent = (total / 300.0) * 100;

            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10.2f %-10.2f\n",
                    (i + 1), physics, chemistry, math, total, average, percent);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();

        int[][] scores = generatePCMScores(studentCount);
        displayResults(scores);
    }
}