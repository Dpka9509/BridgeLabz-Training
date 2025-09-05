// Vehicle.java
public class Vehicle {
    // Static variable shared across all vehicles
    private static double registrationFee;
    
    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final variable (unique per vehicle)

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    // Method to display vehicle details (with instanceof check)
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("The object is not a Vehicle instance.");
        }
    }
}
