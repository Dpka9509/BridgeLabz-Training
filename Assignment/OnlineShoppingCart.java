import java.util.Scanner;

public class OnlineShoppingCart {

    public static void func(){
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;
        while (moreCustomers) {
            System.out.println("\n--- Welcome to Online Shopping ---");
            System.out.println("Product Menu:");
            System.out.println("1. Laptop - Rs.40000");
            System.out.println("2. Mobile - Rs.20000");
            System.out.println("3. Headphones - Rs.2000");
            System.out.println("4. Smart Watch - Rs.5000");
            System.out.println("5. Exit Product Menu");

            int totalAmount = 0;
            int n;

            // Ensure customer adds at least one product (do-while)
            do {
                System.out.print("\nEnter number of products you want to buy (at least 1): ");
                n = sc.nextInt();
            } while (n < 1);

            // For loop to add n items
            for (int i = 1; i <= n; i++) {
                System.out.print("Select product " + i + " (1-4): ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        totalAmount += 40000;
                        System.out.println("Laptop added!");
                        break;
                    case 2:
                        totalAmount += 20000;
                        System.out.println("Mobile added!");
                        break;
                    case 3:
                        totalAmount += 2000;
                        System.out.println("Headphones added!");
                        break;
                    case 4:
                        totalAmount += 5000;
                        System.out.println("Smart Watch added!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }

            // Apply discount if amount > 5000
            if (totalAmount > 5000) {
                System.out.println("\nTotal before discount: Rs." + totalAmount);
                double discount = totalAmount * 0.10; // 10% discount
                totalAmount -= discount;
                System.out.println("Discount applied: Rs." + discount);
            }

            System.out.println("Final Amount to Pay: Rs." + totalAmount);

            // Ask if another customer
            System.out.print("\nIs there another customer? (yes/no): ");
            String ans = sc.next();
            if (!ans.equalsIgnoreCase("yes")) {
                moreCustomers = false;
            }
        }

        System.out.println("\n--- Shopping System Closed ---");
    }
    public static void main(String[] args) {
        func();
    }
}
