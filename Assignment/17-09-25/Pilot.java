public class Pilot extends Staff implements Flyable {
    public Pilot(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Pilot";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Pilot) is checking in for duty.");
    }

    @Override
    public void flyPlane() {
        System.out.println(name + " is flying the plane.");
    }
}
