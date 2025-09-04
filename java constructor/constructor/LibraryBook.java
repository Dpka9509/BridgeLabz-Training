class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // default available
    }

    // Method to borrow book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    // Main method
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("C Programming", "Dennis Ritchie", 299);

        lb.display();
        lb.borrowBook();
        lb.borrowBook();
    }
}
