import java.util.ArrayList;
import java.util.List;

// Student Class
class Student {
    private int studentId;
    private String name;
    private List<Course> courses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}

// Professor Class
class Professor {
    private int professorId;
    private String name;
    private List<Course> courses;

    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this);
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}

// Course Class
class Course {
    private int courseId;
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not Assigned");
        }
        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println("No students enrolled");
        } else {
            for (Student s : students) {
                System.out.println("- " + s.getName());
            }
        }
    }
}

// Main Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");

        // Create Professors
        Professor p1 = new Professor(101, "Dr. Smith");
        Professor p2 = new Professor(102, "Dr. Johnson");

        // Create Courses
        Course c1 = new Course(201, "Mathematics");
        Course c2 = new Course(202, "Physics");

        // Assign Professors to Courses
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Students enroll in Courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Show Course Details
        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
