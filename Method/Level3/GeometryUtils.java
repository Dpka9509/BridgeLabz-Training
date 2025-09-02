import java.util.Scanner;

public class GeometryUtils {

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    // Method to calculate slope and y-intercept of the line
    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[] { slope, intercept };
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();

        // Calculate and display distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between (%d,%d) and (%d,%d): %.2f\n", x1, y1, x2, y2, distance);

        // Calculate and display line equation
        if (x1 != x2) {
            double[] line = calculateLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", line[0], line[1]);
        } else {
            System.out.println("The line is vertical. Equation: x = " + x1);
        }
    }
}
