import java.util.Scanner;

public class AtmTransaction {

    public static void banking(int[] transaction) {
        int balance = 0;

        for (int i : transaction) {
            if (i > 0) {
                System.out.println("Deposit: " + i);
            } else {
                System.out.println("Withdrawal: " + Math.abs(i));
            }
            balance += i;
            System.out.println("Current Balance: " + balance);
        }

        System.out.println("Final Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        int[] transaction = new int[n];
        System.out.println("Enter transaction amounts (positive=deposit, negative=withdraw):");
        for (int i = 0; i < n; i++) {
            transaction[i] = sc.nextInt();
        }

        banking(transaction);
        sc.close();
    }
}
