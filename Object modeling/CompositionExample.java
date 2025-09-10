import java.util.ArrayList;

// Employee class
class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " | Position: " + position;
    }
}

// Department class (only exists within Company)
class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position)); // Employees created inside Department
    }

    public void showEmployees() {
        System.out.println(" Department: " + deptName);
        if (employees.isEmpty()) {
            System.out.println("   No employees.");
        } else {
            for (Employee emp : employees) {
                System.out.println("   - " + emp);
            }
        }
    }
}

// Company class (composition: owns Departments)
class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName)); // Department created inside Company
    }

    public Department getDepartment(int index) {
        if (index >= 0 && index < departments.size()) {
            return departments.get(index);
        }
        return null;
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
        System.out.println();
    }

    // Simulate company deletion
    public void closeCompany() {
        System.out.println("Closing company: " + companyName);
        departments.clear(); // Removes all departments & employees
    }
}

// Main class
public class CompositionExample {
    public static void main(String[] args) {
        Company myCompany = new Company("TechCorp");

        // Add departments
        myCompany.addDepartment("IT");
        myCompany.addDepartment("HR");

        // Add employees to departments
        Department itDept = myCompany.getDepartment(0);
        itDept.addEmployee("Alice", "Developer");
        itDept.addEmployee("Bob", "System Admin");

        Department hrDept = myCompany.getDepartment(1);
        hrDept.addEmployee("Charlie", "HR Manager");

        // Show company details
        myCompany.showCompanyDetails();

        // Delete company (composition effect)
        myCompany.closeCompany();

        // Try to show again (should be empty)
        myCompany.showCompanyDetails();
    }
}
