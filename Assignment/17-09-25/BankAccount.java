// BankAccount.java
public class BankAccount {
    private String accountNumber;
    private double balance;
    private final int pin;

    public BankAccount(String accountNumber, double balance, int pin) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial Balance can't be Negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance can't be Negative");
        }
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        setBalance(this.balance + amount);
        System.out.println("Deposited: " + amount + " | New Balance: " + this.balance);
    }

    public void withdraw(double amount, int enteredPin) {
        if (enteredPin != pin) {
            System.out.println("Invalid PIN. Withdrawal denied.");
            return;
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        setBalance(this.balance - amount);
        System.out.println("Withdrew: " + amount + " | Remaining Balance: " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 1000.0, 1234);

        System.out.println("Account Created: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);            // valid deposit
        account.withdraw(300, 1234);     // correct PIN
        account.withdraw(200, 1111);     // wrong PIN

        try {
            account.withdraw(2000, 1234); // insufficient funds
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.deposit(-50); // invalid deposit
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
