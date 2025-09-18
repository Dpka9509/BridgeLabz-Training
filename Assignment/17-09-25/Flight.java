class Cockpit {
    private String cockpitId;

    public Cockpit(String cockpitId) {
        this.cockpitId = cockpitId;
    }

    public void operate() {
        System.out.println("Cockpit " + cockpitId + " is ready to operate the flight.");
    }
}

public class Flight {
    private String flightNumber;
    private Cockpit cockpit; // Composition

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.cockpit = new Cockpit(flightNumber + "-CPT");
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void startFlight() {
        cockpit.operate();
        System.out.println("Flight " + flightNumber + " has taken off.");
    }
}
