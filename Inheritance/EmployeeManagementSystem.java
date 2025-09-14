// Base Class
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to be overridden
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role: Manager");
        System.out.println("---------------------------");
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Role: Developer");
        System.out.println("---------------------------");
    }
}

// Subclass: Intern
class Intern extends Employee {
    String duration; // e.g., "6 months"

    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
        System.out.println("Role: Intern");
        System.out.println("---------------------------");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 75000, 10);
        Employee e2 = new Developer("Bob", 102, 55000, "Java");
        Employee e3 = new Intern("Charlie", 103, 15000, "6 months");

        // Polymorphism: same method, different outputs
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
