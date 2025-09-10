import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: $" + price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

// Order Class
class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to Order " + orderId);
    }

    public double totalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in Order:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total Amount: $" + totalAmount());
    }

    // ✅ Getter for orderId
    public int getOrderId() {
        return orderId;
    }
}

// Customer Class
class Customer {
    private int customerId;
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order " + order.getOrderId());
    }

    public String getName() {
        return name;
    }
}

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product(101, "Laptop", 1200);
        Product p2 = new Product(102, "Headphones", 150);
        Product p3 = new Product(103, "Mouse", 50);

        // Create a customer
        Customer c1 = new Customer(1, "Alice", "alice@example.com");

        // Customer places an order
        Order order1 = new Order(201, c1);
        order1.addProduct(p1);
        order1.addProduct(p3);
        c1.placeOrder(order1);

        // Show order details
        order1.showOrder();
    }
}
