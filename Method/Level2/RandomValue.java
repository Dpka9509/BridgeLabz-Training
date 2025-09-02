public class RandomValue {


    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generates a number between 1000 and 9999
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to find average, min, and max of an array
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[] { average, min, max };
    }

    // Main method to run the program
    public static void main(String[] args) {
RandomValue stats = new RandomValue();

        int[] randomArray = stats.generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit numbers:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = stats.findAverageMinMax(randomArray);
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.printf("Minimum: %.0f\n", results[1]);
        System.out.printf("Maximum: %.0f\n", results[2]);
    }
}

