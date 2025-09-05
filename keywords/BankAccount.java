class BankAccount {
    // --- Static Section ---
    static String bankName = "State Bank of India"; // Shared across all accounts
    private static int totalAccounts = 0;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // --- Instance Variables ---
    private String accountHolderName;
    private final int accountNumber; // final → cannot be changed once assigned
    private double balance;

    // --- Constructor using "this" to resolve ambiguity ---
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final variable initialized here
        this.balance = balance;
        totalAccounts++;
    }

    // --- Deposit Method ---
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // --- Withdraw Method ---
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // --- Display Account Details ---
    public void displayDetails() {
        // Check if this object is instance of BankAccount
        if (this instanceof BankAccount) {
            System.out.println("Bank Name     : " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance       : " + balance);
            System.out.println("----------------------------");
        }
    }
}

// --- Main Class ---
class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Deepika", 101, 5000.0);
        BankAccount acc2 = new BankAccount("Rahul", 102, 8000.0);

        acc1.displayDetails();
        acc2.displayDetails();

        acc1.deposit(2000);
        acc1.withdraw(1500);

        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
