import java.util.Random;

public class StudentGrades {
    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        displayResults(scores, results, grades);
    }

    // (a) Generate random PCM scores
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics 40-100
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry
            scores[i][2] = 40 + rand.nextInt(61); // Math
        }
        return scores;
    }

    // (b) Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] res = new double[scores.length][3]; // total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            res[i][0] = total;
            res[i][1] = Math.round(avg * 100.0) / 100.0;
            res[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return res;
    }

    // (c) Grade based on percentage
    public static String[] calculateGrades(double[][] res) {
        String[] grade = new String[res.length];
        for (int i = 0; i < res.length; i++) {
            double p = res[i][2];
            if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else if (p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    // (d) Display results
    public static void displayResults(int[][] scores, double[][] res, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" +
                               scores[i][2] + "\t" + (int)res[i][0] + "\t" + res[i][1] + "\t" +
                               res[i][2] + "\t" + grades[i]);
        }
    }
}
