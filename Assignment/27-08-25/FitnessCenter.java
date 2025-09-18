import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean centerOpen = true; 

        do {
            System.out.print("Enter number of members to register: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("\nRegistering Member " + i);


                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly (1000)");
                System.out.println("2. Quarterly (2500)");
                System.out.println("3. Yearly (8000)");
                int choice = sc.nextInt();
                int fee = 0;

                switch (choice) {
                    case 1: fee = 1000; break;
                    case 2: fee = 2500; break;
                    case 3: fee = 8000; break;
                    default: 
                        System.out.println("Invalid choice, setting default Monthly.");
                        fee = 1000;
                }

                System.out.print("Is member a Student or Senior Citizen? (yes/no): ");
                String discount = sc.next();
                if (discount.equalsIgnoreCase("yes")) {
                    fee = (int)(fee * 0.8);  // 20% discount
                    System.out.println("Discount applied!");
                } else {
                    System.out.println("No discount applied.");
                }

                System.out.println("Final Fee for Member " + i + " = " + fee);
            }

            System.out.print("\nRegister more members? (yes/no): ");
            String more = sc.next();
            if (more.equalsIgnoreCase("no")) {
                centerOpen = false;
            }
        } while (centerOpen);  

        System.out.println("\nRegistration Closed! Thank you.");
    }
}
