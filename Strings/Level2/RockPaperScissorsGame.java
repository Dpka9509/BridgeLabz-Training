import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to get computer's choice using Math.random
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0, 1, or 2
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to find winner between user and computer
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if (user.equals("Rock")) {
            return (computer.equals("Scissors")) ? "User" : "Computer";
        } else if (user.equals("Paper")) {
            return (computer.equals("Rock")) ? "User" : "Computer";
        } else if (user.equals("Scissors")) {
            return (computer.equals("Paper")) ? "User" : "Computer";
        }
        return "Invalid";
    }

    // Method to calculate stats (average and percentage of wins)
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0) / totalGames);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", (computerWins * 100.0) / totalGames);

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\n===== Game Results =====");
        System.out.printf("%-10s | %-10s | %-10s | %-10s\n", "Game", "User", "Computer", "Winner");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s | %-10s | %-10s | %-10s\n", 
                gameResults[i][0], gameResults[i][1], gameResults[i][2], gameResults[i][3]);
        }

        System.out.println("\n===== Statistics =====");
        System.out.printf("%-10s | %-10s | %-15s\n", "Player", "Wins", "Winning %");
        System.out.println("-------------------------------------------");

        for (String[] row : stats) {
            System.out.printf("%-10s | %-10s | %-15s\n", row[0], row[1], row[2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of games
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][4];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine().trim();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;
        }

        // Calculate stats
        String[][] stats = calculateStats(userWins, computerWins, totalGames);

        // Display results
        displayResults(gameResults, stats);

        sc.close();
    }
}
