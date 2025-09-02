import java.util.Random;

public class MatrixManipulation {

    // Method to generate a random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values from 0 to 9
            }
        }
        return matrix;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2 for determinant.");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    // Method to print a matrix
    public static void printMatrix(String label, double[][] matrix) {
        System.out.println(label);
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Generate a 2x2 matrix for determinant and inverse
        double[][] matrix = generateMatrix(2, 2);
        printMatrix("Original Matrix:", matrix);

        // Transpose
        double[][] transpose = transposeMatrix(matrix);
        printMatrix("Transpose:", transpose);

        // Determinant
        double det = determinant2x2(matrix);
        System.out.printf("Determinant: %.2f\n\n", det);

        // Inverse
        try {
            double[][] inverse = inverse2x2(matrix);
            printMatrix("Inverse:", inverse);
        } catch (ArithmeticException e) {
            System.out.println("Inverse: Matrix is singular and cannot be inverted.\n");
        }
    }
}
