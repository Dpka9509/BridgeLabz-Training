// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties();  // all workers must implement this
}

// Subclass 1: Chef
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
        System.out.println("Duties: Cooking dishes for customers.");
        System.out.println("----------------------");
    }
}

// Subclass 2: Waiter
class Waiter extends Person implements Worker {
    String section;

    Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        displayInfo();
        System.out.println("Role: Waiter, Section: " + section);
        System.out.println("Duties: Serving food to customers.");
        System.out.println("----------------------");
    }
}

// Main class to test
public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter1 = new Waiter("John", 201, "VIP Section");

        chef1.performDuties();
        waiter1.performDuties();
    }
}
