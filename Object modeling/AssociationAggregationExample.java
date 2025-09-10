import java.util.ArrayList;

// Course class
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Add student to course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    // Show enrolled students
    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        if (enrolledStudents.isEmpty()) {
            System.out.println(" No students enrolled.");
        } else {
            for (Student s : enrolledStudents) {
                System.out.println(" - " + s.getName());
            }
        }
        System.out.println();
    }
}

// Student class
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Enroll in a course (two-way association)
    public void enroll(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // maintain two-way relationship
        }
    }

    // Show courses for a student
    public void viewCourses() {
        System.out.println("Student: " + name);
        if (courses.isEmpty()) {
            System.out.println(" No courses enrolled.");
        } else {
            for (Course c : courses) {
                System.out.println(" - " + c.getCourseName());
            }
        }
        System.out.println();
    }
}

// School class (Aggregation: School "has" Students)
class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student); // Aggregation: Student exists independently
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
        System.out.println();
    }
}

// Main class
public class AssociationAggregationExample {
    public static void main(String[] args) {
        // Create school
        School mySchool = new School("Greenwood High");

        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Add students to school (aggregation)
        mySchool.addStudent(s1);
        mySchool.addStudent(s2);
        mySchool.addStudent(s3);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");

        // Students enroll in courses (association: many-to-many)
        s1.enroll(math);
        s1.enroll(english);

        s2.enroll(math);
        s2.enroll(science);

        s3.enroll(science);

        // Show school students
        mySchool.showStudents();

        // Show student courses
        s1.viewCourses();
        s2.viewCourses();
        s3.viewCourses();

        // Show enrolled students in each course
        math.showEnrolledStudents();
        science.showEnrolledStudents();
        english.showEnrolledStudents();
    }
}
