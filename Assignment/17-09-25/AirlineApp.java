public class AirlineApp {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Person p1 = new Passenger("Alice", 30, "alice@example.com");
        Person p2 = new Pilot("Bob", 45, "bob@example.com");
        Person p3 = new CabinCrew("Charlie", 28, "charlie@example.com");

        p1.checkIn(); // Passenger check-in
        p2.checkIn(); // Pilot check-in
        p3.checkIn(); // CabinCrew check-in

        // Pilot flying
        Flyable pilotFly = (Flyable)p2;
        pilotFly.flyPlane();

        // Airline & Flights
        Airline airline = new Airline();
        Flight f1 = new Flight("GA101");
        Flight f2 = new Flight("GA102");

        airline.addFlight(f1);
        airline.addFlight(f2);

        // Passenger books flights
        ((Passenger)p1).bookFlight(f1);
        ((Passenger)p1).bookFlight(f2);

        // Ticket creation
        Ticket t1 = new Ticket("TCK1001", f1);
        t1.showDetails();
    }
}
