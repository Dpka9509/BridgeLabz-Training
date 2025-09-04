class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 50.0; // fixed rate

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not Assigned";
        this.rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }

    // Main method
    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Deepika", "Honda City", 5);

        cr1.display();
        cr2.display();
    }
}
