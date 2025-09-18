// Superclass
class Payment {
    public void pay(double amount) {
        System.out.println("Processing generic payment of Rs. " + amount);
    }
}

// Subclass CreditCard
class CreditCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card 💳");
    }
}

// Subclass DebitCard
class DebitCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Debit Card 🏧");
    }
}

// Subclass UPI
class UPI extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI 📱");
    }
}

// Test class
public class PaymentMain {
    public static void main(String[] args) {
        Payment payment; // reference of superclass

        payment = new CreditCard();
        payment.pay(1000);   // CreditCard version executes

        payment = new DebitCard();
        payment.pay(500);    // DebitCard version executes

        payment = new UPI();
        payment.pay(250);    // UPI version executes
    }
}
