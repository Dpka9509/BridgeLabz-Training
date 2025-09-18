import java.util.Scanner;

public class RailwayReservationEasy {
    static int seats = 3;   // total seats
    static int booked = 0;  // booked seats

    public static void showTrains() {
        System.out.println("\n1. Express - 500");
        System.out.println("2. SuperFast - 800");
        System.out.println("3. Local - 200");
    }

    public static void bookSeat(int ch) {
        if (booked < seats) {
            switch (ch) {
                case 1: System.out.println("Express seat booked!"); break;
                case 2: System.out.println("SuperFast seat booked!"); break;
                case 3: System.out.println("Local seat booked!"); break;
                default: System.out.println("Invalid choice!");
            }
            booked++;
        } else {
            System.out.println("No seats left → Waiting List");
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            showTrains();
            System.out.print("Choose train seat (1-3): ");
            int ch = sc.nextInt();

            bookSeat(ch);

            System.out.print("Book more? (1-Yes / 0-No): ");
        } while (sc.nextInt() == 1);

        System.out.println("Booking closed! Seats booked = " + booked);
    }
}
