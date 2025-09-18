public class VehicleMain {
     public static void main(String[] args) {
        Car car = new Car("Toyota", 80, 4);
        Bike bike = new Bike("Yamaha", 60, true);
        Bus bus = new Bus("Volvo", 50, 40);

        // All reuse start() from Vehicle
        car.start();
        bike.start();
        bus.start();

        // Extra features
        car.playMusic();
        bike.doWheelie();
        bus.announceStop();
    }
}
