// VehicleRegistrationSystem.java
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Set registration fee (static variable)
        Vehicle.updateRegistrationFee(5000.0);

        // Create vehicle objects
        Vehicle v1 = new Vehicle("Alice", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Bob", "Bike", "DL05XY6789");

        // Display details
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
