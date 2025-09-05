// EmployeeManagement.java
public class EmployeeManagement {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Data Scientist");
        Employee emp3 = new Employee("Charlie", 103, "Product Manager");

        // Display employee details
        emp1.displayEmployeeDetails();
        System.out.println("-------------------------");
        emp2.displayEmployeeDetails();
        System.out.println("-------------------------");
        emp3.displayEmployeeDetails();

        // Display total employees
        System.out.println("=========================");
        Employee.displayTotalEmployees();
    }
}
