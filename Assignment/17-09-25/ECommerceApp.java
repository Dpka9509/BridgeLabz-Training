import java.util.ArrayList;
import java.util.List;

// 1️⃣ Base Abstraction
abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract String getRole();
    public abstract void placeOrder(Order order);
}

// 2️⃣ Customer
class Customer extends User {
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with ID: " + order.getOrderId());
    }

    public List<Order> getOrders() {
        return orders;
    }
}

// 3️⃣ Seller
class Seller extends User {
    public Seller(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "Seller";
    }

    @Override
    public void placeOrder(Order order) {
        System.out.println(name + " (Seller) confirms the order ID: " + order.getOrderId());
    }
}

// 4️⃣ Admin
class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    @Override
    public void placeOrder(Order order) {
        System.out.println(name + " (Admin) does not place orders directly.");
    }
}

// 5️⃣ PaymentGateway Interface
interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}

// 6️⃣ Payment Implementations
class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI."); }
    @Override
    public void refund(double amount) { System.out.println("Refunded " + amount + " via UPI."); }
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) { System.out.println("Paid " + amount + " via Credit Card."); }
    @Override
    public void refund(double amount) { System.out.println("Refunded " + amount + " via Credit Card."); }
}

class WalletPayment implements PaymentGateway {
    @Override
    public void pay(double amount) { System.out.println("Paid " + amount + " via Wallet."); }
    @Override
    public void refund(double amount) { System.out.println("Refunded " + amount + " via Wallet."); }
}

// 7️⃣ Order & Invoice (Composition)
class Invoice {
    private String invoiceId;
    public Invoice(String invoiceId) { this.invoiceId = invoiceId; }
    public void showInvoice() { System.out.println("Invoice ID: " + invoiceId); }
}

class Order {
    private String orderId;
    private Invoice invoice;

    public Order(String orderId) {
        this.orderId = orderId;
        this.invoice = new Invoice("INV-" + orderId);
    }

    public String getOrderId() { return orderId; }
    public void showInvoice() { invoice.showInvoice(); }
}

// 8️⃣ Marketplace (Aggregation, Static & Final)
class Marketplace {
    static List<Seller> sellers = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();

    static {
        System.out.println("Marketplace configuration loaded...");
    }

    public static void addSeller(Seller seller) { sellers.add(seller); }
    public static void addCustomer(Customer customer) { customers.add(customer); }

    public final void termsAndConditions() {
        System.out.println("All users must follow the marketplace terms and conditions.");
    }
}

// 9️⃣ Discount Strategy (Anonymous Inner Class)
interface DiscountStrategy {
    double applyDiscount(double amount);
}

// 10️⃣ Main Class
public class ECommerceApp {
    public static void main(String[] args) {
        // Users
        Customer customer = new Customer("Alice", "alice@email.com");
        Seller seller = new Seller("Bob's Store", "bob@email.com");
        Admin admin = new Admin("Charlie", "admin@email.com");

        // Marketplace
        Marketplace marketplace = new Marketplace();
        Marketplace.addCustomer(customer);
        Marketplace.addSeller(seller);

        marketplace.termsAndConditions();

        // Orders
        Order order1 = new Order("ORD1001");
        Order order2 = new Order("ORD1002");

        customer.placeOrder(order1); // Customer places order
        seller.placeOrder(order1);   // Seller confirms order
        admin.placeOrder(order2);    // Admin cannot place orders

        order1.showInvoice();

        // Payment
        PaymentGateway payment = new CreditCardPayment();
        payment.pay(2500);
        payment.refund(500);

        // Anonymous inner class: one-time discount
        DiscountStrategy oneTimeDiscount = new DiscountStrategy() {
            @Override
            public double applyDiscount(double amount) {
                double discounted = amount * 0.9; // 10% off
                System.out.println("One-time discount applied: " + discounted);
                return discounted;
            }
        };
        oneTimeDiscount.applyDiscount(1000);

        // Dynamic method dispatch
        User u1 = customer;
        User u2 = seller;
        u1.placeOrder(order2); // Customer version
        u2.placeOrder(order2); // Seller version
    }
}
