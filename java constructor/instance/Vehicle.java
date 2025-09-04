// Vehicle.java
class Vehicle {
    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 5000;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        Vehicle v2 = new Vehicle("Alice", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);
        System.out.println("\nAfter updating registration fee:");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
