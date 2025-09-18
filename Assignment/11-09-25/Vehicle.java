class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println(brand + " is starting at speed " + speed + " km/h.");
    }
}

// Subclass Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public void playMusic() {
        System.out.println(brand + " is playing music 🎵");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    private boolean hasHelmet;

    public Bike(String brand, int speed, boolean hasHelmet) {
        super(brand, speed);
        this.hasHelmet = hasHelmet;
    }

    public void doWheelie() {
        System.out.println(brand + " is doing a wheelie! 🏍️");
    }
}

// Subclass Bus
class Bus extends Vehicle {
    private int passengerCount;

    public Bus(String brand, int speed, int passengerCount) {
        super(brand, speed);
        this.passengerCount = passengerCount;
    }

    public void announceStop() {
        System.out.println(brand + " is announcing: Next stop, please get ready! 🚌");
    }
}
