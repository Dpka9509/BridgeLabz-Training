// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();  // any class implementing this must define refuel
}

// Subclass 1: ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        displayInfo();
        System.out.println("Charging electric vehicle. Battery capacity: " + batteryCapacity + " kWh");
        System.out.println("----------------------");
    }
}

// Subclass 2: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        displayInfo();
        System.out.println("Refueling petrol vehicle. Tank capacity: " + fuelTankCapacity + " liters");
        System.out.println("----------------------");
    }
}

// Main class to test
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 300, 60);

        ev.charge();
        pv.refuel();
    }
}
