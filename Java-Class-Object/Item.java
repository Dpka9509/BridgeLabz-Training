class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method
    public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 45.50);
        item1.displayDetails();
        int qty = 10;
        System.out.println("Total cost for " + qty + " units: " + item1.calculateTotalCost(qty));
    }
}