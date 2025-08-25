import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        return new String[] {
            String.format("%.2f", weight),
            String.format("%.2f", heightCm),
            String.format("%.2f", bmi),
            status
        };
    }

    // Method to display table
    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-12s\n", "Weight", "Height", "BMI", "Status");
        System.out.println("---------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-12s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2];
        String[][] results = new String[10][4];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();

            results[i] = calculateBMI(persons[i][0], persons[i][1]);
        }
        display(results);
    }
}
