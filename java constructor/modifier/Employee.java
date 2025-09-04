// Employee.java
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Team: " + teamName);
    }

    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 60000, "Development");
        m.displayDetails();
        m.setSalary(70000);
        m.displayDetails();
    }
}
