// Superclass: Device
class Device {
    String deviceId;
    String status; // e.g., "ON" or "OFF"

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("---------------------------");
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH123", "ON", 24.5);
        Thermostat t2 = new Thermostat("TH124", "OFF", 22.0);

        t1.displayStatus();
        t2.displayStatus();
    }
}
