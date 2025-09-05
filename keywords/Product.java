// Product.java
class Product {
    // Static variable (shared discount for all products)
    private static double discount = 0.0;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;
    private final int productID; // final variable → immutable unique ID

    // Constructor using "this"
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Calculate total price after discount
    public double calculateTotal() {
        double total = price * quantity;
        double discountedTotal = total - (total * discount / 100);
        return discountedTotal;
    }

    // Display product details with instanceof check
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total after discount: " + calculateTotal());
        } else {
            System.out.println("Invalid product object!");
        }
    }
}
