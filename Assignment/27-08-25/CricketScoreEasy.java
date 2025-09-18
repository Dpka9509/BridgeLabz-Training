import java.util.Scanner;

public class CricketScoreEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of batsmen: ");
        int n = sc.nextInt();
        int[] runs = new int[n];

        input(runs, sc);
        analyze(runs);
    }

    static void input(int[] runs, Scanner sc) {
        System.out.println("Enter runs:");
        for (int i = 0; i < runs.length; i++) {
            runs[i] = sc.nextInt();
        }
    }

    static void analyze(int[] runs) {
        int max = runs[0], min = runs[0], sum = 0;
        boolean century = false;

        for (int r : runs) {
            if (r > max) max = r;
            if (r < min) min = r;
            if (r >= 100) century = true;
            sum += r;
        }

        double avg = (double) sum / runs.length;

        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
        System.out.println("Average: " + avg);
        System.out.println(century ? "Century Scorer present" : "No Century Scorer");
    }
}
