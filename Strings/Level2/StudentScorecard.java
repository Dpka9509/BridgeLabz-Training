import java.util.Random;

public class StudentScorecard {

    // a) Generate random 2-digit PCM scores
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; // [students][Physics, Chemistry, Math]

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // random 60–100
            }
        }
        return scores;
    }

    // b) Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // [Total, Average, Percentage]

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0; // round to 2 decimals
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // c) Assign grade based on percentage
    public static String[] assignGrades(double[][] results) {
        int students = results.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            double percent = results[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // d) Display scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-12s %-8s\n", 
                "Stud", "Physics", "Chem", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8d %-8.0f %-10.2f %-12.2f %-8s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int students = 5; // you can change this value

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = assignGrades(results);

        displayScorecard(scores, results, grades);
    }
}
