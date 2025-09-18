import java.util.ArrayList;
import java.util.List;

public class Airline {
    static String airlineName = "Global Airlines"; // static field
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
        System.out.println("Flight " + flight.getFlightNumber() + " added to " + airlineName);
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
