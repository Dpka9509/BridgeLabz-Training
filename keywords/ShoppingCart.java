// ShoppingCart.java
public class ShoppingCart {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 50000, 1, 101);
        Product p2 = new Product("Headphones", 2000, 2, 102);
        Product p3 = new Product("Mouse", 800, 3, 103);

        // Update discount for all products
        Product.updateDiscount(10);

        // Display details
        p1.displayProductDetails();
        System.out.println("-----------------------");
        p2.displayProductDetails();
        System.out.println("-----------------------");
        p3.displayProductDetails();
    }
}
