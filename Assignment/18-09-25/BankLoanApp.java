import java.util.*;

abstract class Account {
    protected final String accountNumber; // final, immutable
    protected double balance;
    protected Customer owner;

    public Account(String accountNumber, double balance, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public abstract String getAccountType();

    public double getBalance() { return balance; }
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
        System.out.println("Deposited " + amount + " into " + accountNumber + ". New Balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw must be positive");
        if (amount > balance) {
            System.out.println("Insufficient balance in account " + accountNumber);
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from " + accountNumber + ". Remaining Balance: " + balance);
        return true;
    }

    public String getAccountNumber() { return accountNumber; }
}


class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance, Customer owner) {
        super(accountNumber, balance, owner);
    }

    @Override
    public String getAccountType() { return "Savings"; }
}


class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance, Customer owner) {
        super(accountNumber, balance, owner);
    }

    @Override
    public String getAccountType() { return "Current"; }
}


class Customer {
    private String customerId;
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println(name + " added account " + account.getAccountNumber());
    }

    public List<Account> getAccounts() { return accounts; }

    public String getName() { return name; }
}

interface LoanOperations {
    void approveLoan();
    double calculateEMI();
    void closeLoan();
}


class RepaymentSchedule {
    private int months;
    private double monthlyEMI;

    public RepaymentSchedule(int months, double monthlyEMI) {
        this.months = months;
        this.monthlyEMI = monthlyEMI;
    }

    public int getMonths() { return months; }
    public double getMonthlyEMI() { return monthlyEMI; }
}

abstract class Loan implements LoanOperations {
    protected Customer borrower; // Association
    protected double principalAmount;
    protected RepaymentSchedule schedule; // Composition
    protected boolean isApproved = false;

    // Static interest rate for all loans
    protected static double interestRate = 0.08; // 8% annual

    public Loan(Customer borrower, double principal, int months) {
        this.borrower = borrower;
        this.principalAmount = principal;
        double emi = calculateEMI(principal, interestRate, months);
        this.schedule = new RepaymentSchedule(months, emi);
    }

    protected abstract double calculateEMI(double principal, double rate, int months);

    public double getEMI() { return schedule.getMonthlyEMI(); }
    public Customer getBorrower() { return borrower; }
}


class HomeLoan extends Loan {
    public HomeLoan(Customer borrower, double principal, int months) { super(borrower, principal, months); }

    @Override
    public void approveLoan() { isApproved = true; System.out.println("HomeLoan approved for " + borrower.getName()); }

    @Override
    public double calculateEMI() { return schedule.getMonthlyEMI(); }

    @Override
    public void closeLoan() { isApproved = false; System.out.println("HomeLoan closed for " + borrower.getName()); }

    @Override
    protected double calculateEMI(double principal, double rate, int months) {
        double monthlyRate = rate / 12;
        return principal * monthlyRate * Math.pow(1 + monthlyRate, months) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }
}

class CarLoan extends Loan {
    public CarLoan(Customer borrower, double principal, int months) { super(borrower, principal, months); }

    @Override
    public void approveLoan() { isApproved = true; System.out.println("CarLoan approved for " + borrower.getName()); }

    @Override
    public double calculateEMI() { return schedule.getMonthlyEMI(); }

    @Override
    public void closeLoan() { isApproved = false; System.out.println("CarLoan closed for " + borrower.getName()); }

    @Override
    protected double calculateEMI(double principal, double rate, int months) {
        double monthlyRate = rate / 12;
        return principal * monthlyRate * Math.pow(1 + monthlyRate, months) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }
}

class PersonalLoan extends Loan {
    public PersonalLoan(Customer borrower, double principal, int months) { super(borrower, principal, months); }

    @Override
    public void approveLoan() { isApproved = true; System.out.println("PersonalLoan approved for " + borrower.getName()); }

    @Override
    public double calculateEMI() { return schedule.getMonthlyEMI(); }

    @Override
    public void closeLoan() { isApproved = false; System.out.println("PersonalLoan closed for " + borrower.getName()); }

    @Override
    protected double calculateEMI(double principal, double rate, int months) {
        double monthlyRate = rate / 12;
        return principal * monthlyRate * Math.pow(1 + monthlyRate, months) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }
}


class BankingSystem {
    public static void autoDebitEMI(List<Loan> loans) {
        System.out.println("\n--- Monthly EMI Auto-Debit ---");
        for (Loan loan : loans) {
            double emi = loan.getEMI();
            boolean paid = false;
            for (Account account : loan.getBorrower().getAccounts()) {
                if (account.getBalance() >= emi) {
                    account.withdraw(emi);
                    System.out.println("EMI of " + emi + " debited from " + account.getAccountNumber() +
                            " for " + loan.getBorrower().getName());
                    paid = true;
                    break;
                }
            }
            if (!paid) {
                System.out.println("Insufficient balance for " + loan.getBorrower().getName() +
                        ". EMI of " + emi + " could not be debited.");
            }
        }
        System.out.println("-------------------------------\n");
    }
}

public class BankLoanApp {
    public static void main(String[] args) {
        // Customers
        Customer alice = new Customer("C001", "Alice");
        Customer bob = new Customer("C002", "Bob");

        // Accounts
        SavingsAccount sa1 = new SavingsAccount("SA1001", 5000, alice);
        CurrentAccount ca1 = new CurrentAccount("CA1002", 2000, alice);
        SavingsAccount sa2 = new SavingsAccount("SA2001", 3000, bob);

        alice.addAccount(sa1);
        alice.addAccount(ca1);
        bob.addAccount(sa2);

        // Loans
        HomeLoan homeLoan = new HomeLoan(alice, 100000, 12);
        CarLoan carLoan = new CarLoan(bob, 50000, 10);

        homeLoan.approveLoan();
        carLoan.approveLoan();

        List<Loan> allLoans = new ArrayList<>();
        allLoans.add(homeLoan);
        allLoans.add(carLoan);

        // Show EMI
        System.out.println("Alice HomeLoan EMI: " + homeLoan.getEMI());
        System.out.println("Bob CarLoan EMI: " + carLoan.getEMI());

        // Simulate EMI auto-debit
        BankingSystem.autoDebitEMI(allLoans);

        // Simulate next month
        BankingSystem.autoDebitEMI(allLoans);
    }
}
