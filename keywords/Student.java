// Student.java
public class Student {
    // Static variable shared across all students
    private static String universityName;
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private final int rollNumber;  // final variable (cannot be changed once assigned)
    private String grade;

    // Constructor using 'this' to resolve ambiguity
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to set university name
    public static void setUniversityName(String name) {
        universityName = name;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display student details (with instanceof check)
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Object is not a Student instance.");
        }
    }

    // Update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        } else {
            System.out.println("Cannot update grade, not a Student instance.");
        }
    }
}
