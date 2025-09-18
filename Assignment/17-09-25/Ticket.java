public final class Ticket {
    private String ticketId;
    private Flight flight;

    public Ticket(String ticketId, Flight flight) {
        this.ticketId = ticketId;
        this.flight = flight;
    }

    public void showDetails() {
        System.out.println("Ticket ID: " + ticketId + " | Flight: " + flight.getFlightNumber());
    }
}
