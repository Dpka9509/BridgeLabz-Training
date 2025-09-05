// Employee.java
class Employee {
    // Static variable shared across all employees
    private static String companyName = "Tech Solutions Pvt Ltd";

    // Static variable to keep track of total employees
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private String designation;
    private final int id; // final variable to ensure immutability

    // Constructor using 'this' keyword
    public Employee(String name, int id, String designation) {
        this.name = name;             // using 'this' to refer to instance variable
        this.id = id;                 // final variable initialized here
        this.designation = designation;
        totalEmployees++;             // increase employee count
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        // Using instanceof to check if the current object is Employee
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Not a valid Employee object.");
        }
    }
}
