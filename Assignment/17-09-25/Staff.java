public class Staff extends Person {
    public Staff(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Staff) is checking in with ID card.");
    }
}
