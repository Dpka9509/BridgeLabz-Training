// BankAccount.java
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Deepika", "ACC12345", 10000);
        acc1.displayBalance();
        acc1.deposit(2500);
        acc1.withdraw(5000);
        acc1.withdraw(9000); // will show insufficient balance
    }
}
