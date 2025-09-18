import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {
    private List<Flight> bookedFlights = new ArrayList<>();

    public Passenger(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Passenger) is checking in with passport and luggage.");
    }

    public void bookFlight(Flight flight) {
        bookedFlights.add(flight);
        System.out.println(name + " booked flight " + flight.getFlightNumber());
    }

    public List<Flight> getBookedFlights() {
        return bookedFlights;
    }
}
