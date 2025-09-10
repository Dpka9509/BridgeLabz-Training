import java.util.ArrayList;

// Faculty class (independent, aggregation)
class Faculty {
    private String name;
    private String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Faculty: " + name + " | Specialization: " + specialization;
    }
}

// Department class (composition, only exists inside University)
class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department: " + deptName;
    }
}

// University class
class University {
    private String universityName;
    private ArrayList<Department> departments; // Composition
    private ArrayList<Faculty> faculties;      // Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: Departments are created within University
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculty exist independently, but can be associated with University
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDetails() {
        System.out.println("University: " + universityName);

        System.out.println(" Departments:");
        if (departments.isEmpty()) {
            System.out.println("  None");
        } else {
            for (Department d : departments) {
                System.out.println("  - " + d);
            }
        }

        System.out.println(" Faculties:");
        if (faculties.isEmpty()) {
            System.out.println("  None");
        } else {
            for (Faculty f : faculties) {
                System.out.println("  - " + f);
            }
        }
        System.out.println();
    }

    // Delete university (composition effect)
    public void closeUniversity() {
        System.out.println("Closing university: " + universityName);
        departments.clear(); // removes all departments
        // Faculties not deleted (aggregation → they can still exist)
    }
}

// Main class
public class UniversityExample {
    public static void main(String[] args) {
        // Create independent faculty members (aggregation)
        Faculty f1 = new Faculty("Alice", "Computer Science");
        Faculty f2 = new Faculty("Bob", "Mathematics");

        // Create a university
        University uni = new University("Global University");

        // Add departments (composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mathematics");

        // Add faculties (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Show university details
        uni.showDetails();

        // Delete university
        uni.closeUniversity();

        // Show again (departments gone, faculties remain)
        uni.showDetails();

        // Faculties can still exist independently
        System.out.println("Independent Faculty still exist:");
        System.out.println(f1);
        System.out.println(f2);
    }
}
