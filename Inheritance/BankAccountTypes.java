// Superclass: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("---------------------------");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("---------------------------");
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int lockInPeriod; // in months

    FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("---------------------------");
    }
}

// Main class
public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount c1 = new CheckingAccount("CA456", 2000, 1000);
        FixedDepositAccount f1 = new FixedDepositAccount("FD789", 10000, 12);

        s1.displayInfo();
        s1.displayAccountType();

        c1.displayInfo();
        c1.displayAccountType();

        f1.displayInfo();
        f1.displayAccountType();
    }
}
