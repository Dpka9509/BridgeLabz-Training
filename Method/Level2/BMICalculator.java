import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // [weight, height, BMI]

        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();

            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        calculateBMI(teamData);
        String[] bmiStatus = determineBMIStatus(teamData);

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Member %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s%n",
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }

        scanner.close();
    }
}
