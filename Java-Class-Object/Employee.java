public class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("  Name   : " + name);
        System.out.println("  ID     : " + id);
        System.out.printf("  Salary : $%.2f%n", salary);
    }

    // Optional: getters (if you need to access fields outside the class)
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    // Example usage
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", 101, 75000.0);
        emp.displayDetails();
    }
}