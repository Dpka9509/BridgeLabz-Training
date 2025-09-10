import java.util.ArrayList;

// Account class
class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber + " | Balance: " + balance;
    }
}

// Customer class (Associated with Bank via Account)
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account acc : accounts) {
                System.out.println(" - " + acc);
            }
        }
        System.out.println();
    }
}

// Bank class
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, int accNo, double initialBalance) {
        Account newAccount = new Account(accNo, initialBalance);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " in " + bankName);
    }

    public void showCustomers() {
        System.out.println("Bank: " + bankName + " has customers:");
        for (Customer c : customers) {
            System.out.println(" - " + c.getName());
        }
        System.out.println();
    }
}

// Main class to demonstrate association
public class AssociationExample {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI Bank");
        Bank hdfc = new Bank("HDFC Bank");

        // Create customers
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        // Open accounts in banks
        sbi.openAccount(c1, 101, 5000.0);
        sbi.openAccount(c2, 102, 10000.0);

        hdfc.openAccount(c1, 201, 2000.0); // Alice also has an account in HDFC

        // Show customers
        sbi.showCustomers();
        hdfc.showCustomers();

        // Customers view their balances
        c1.viewBalance();
        c2.viewBalance();
    }
}
