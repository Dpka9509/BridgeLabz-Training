// MovieTicket.java
class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book ticket
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", "A10", 350);
        ticket.displayDetails();
        ticket.bookTicket("B15", 400); // updating booking
        ticket.displayDetails();
    }
}
