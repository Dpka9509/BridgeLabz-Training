public class FootballTeamStat {

    // Method to generate random heights between 150 and 250 cm
    public int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150 to 250
        }
        return heights;
    }

    // Method to calculate the sum of all heights
    public int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    // Method to find the tallest height
    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    // Main method to run the program
    public static void main(String[] args) {
        FootballTeamStat stats = new FootballTeamStat();

        int[] heights = stats.generateHeights(11);
        System.out.println("Player Heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int sum = stats.calculateSum(heights);
        double mean = stats.calculateMean(heights);
        int shortest = stats.findShortest(heights);
        int tallest = stats.findTallest(heights);

        System.out.println("\n--- Team Height Stats ---");
        System.out.println("Total Height: " + sum + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean);
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }
}