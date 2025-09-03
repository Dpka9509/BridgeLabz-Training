// CartItem.java
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add items
    void addItem(int qty) {
        this.quantity += qty;
        System.out.println(qty + " items added. Total Quantity: " + quantity);
    }

    // Method to remove items
    void removeItem(int qty) {
        if (qty <= quantity) {
            this.quantity -= qty;
            System.out.println(qty + " items removed. Remaining Quantity: " + quantity);
        } else {
            System.out.println("Cannot remove more than available quantity!");
        }
    }

    // Method to display total cost
    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 55000, 1);
        item.displayTotalCost();
        item.addItem(2);
        item.displayTotalCost();
        item.removeItem(1);
        item.displayTotalCost();
    }
}
