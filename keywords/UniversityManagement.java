// UniversityManagement.java
public class UniversityManagement {
    public static void main(String[] args) {
        // Set university name
        Student.setUniversityName("Oxford University");

        // Create student objects
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        // Display student details
        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();

        // Update grade
        s2.updateGrade("A+");
        System.out.println();
        s2.displayStudentDetails();

        // Display total students
        Student.displayTotalStudents();
    }
}
