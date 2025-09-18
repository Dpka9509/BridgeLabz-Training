import java.util.*;

// 1️⃣ Abstract class Person
abstract class Person {
    protected String id;
    protected String name;
    protected String email;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract String getRole();
}

// 2️⃣ Subclasses: Student and Professor
class Student extends Person {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, Integer> courseGrades = new HashMap<>();

    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public boolean enroll(Course course) {
        if (enrolledCourses.size() >= University.MAX_COURSES_PER_STUDENT) {
            System.out.println("Cannot enroll " + name + " in " + course.getCourseCode() + ": Max courses reached.");
            return false;
        }
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in " + course.getCourseCode());
        return true;
    }

    public List<Course> getEnrolledCourses() { return enrolledCourses; }

    public void addGrade(Course course, int grade) {
        courseGrades.put(course, grade);
    }

    public Map<Course, Integer> getCourseGrades() {
        return courseGrades;
    }
}

class Professor extends Person {
    private List<Course> teachingCourses = new ArrayList<>();

    public Professor(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() { return "Professor"; }

    public void addCourse(Course course) {
        teachingCourses.add(course);
        System.out.println(name + " assigned to teach " + course.getCourseCode());
    }

    public List<Course> getTeachingCourses() { return teachingCourses; }
}

// 3️⃣ Interface: Evaluatable
interface Evaluatable {
    void conductExam();
    void evaluateStudent(Student s, int score);
}

// 4️⃣ Course base class
abstract class Course {
    protected final String courseCode; // final, immutable
    protected String courseName;
    protected Syllabus syllabus; // composition

    public Course(String code, String name) {
        this.courseCode = code;
        this.courseName = name;
        this.syllabus = new Syllabus(name + " syllabus");
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public Syllabus getSyllabus() { return syllabus; }
}

// 5️⃣ Composition: Syllabus
class Syllabus {
    private String content;

    public Syllabus(String content) {
        this.content = content;
    }

    public void showSyllabus() {
        System.out.println("Syllabus: " + content);
    }
}

// 6️⃣ Different course types implementing Evaluatable (Polymorphism)
class TheoryCourse extends Course implements Evaluatable {
    public TheoryCourse(String code, String name) { super(code, name); }

    @Override
    public void conductExam() {
        System.out.println("Conducting theory exam for " + courseCode);
    }

    @Override
    public void evaluateStudent(Student s, int score) {
        s.addGrade(this, score);
        System.out.println("Evaluated " + s.name + " in " + courseCode + " with score: " + score);
    }
}

class LabCourse extends Course implements Evaluatable {
    public LabCourse(String code, String name) { super(code, name); }

    @Override
    public void conductExam() {
        System.out.println("Conducting lab practical exam for " + courseCode);
    }

    @Override
    public void evaluateStudent(Student s, int score) {
        s.addGrade(this, score);
        System.out.println("Evaluated " + s.name + " in lab " + courseCode + " with score: " + score);
    }
}

// 7️⃣ University class with static rule
class University {
    public static final int MAX_COURSES_PER_STUDENT = 5;
}

// 8️⃣ Transcript generator
class TranscriptGenerator {
    public static void generateTranscript(Student s) {
        System.out.println("\n--- Transcript for " + s.name + " ---");
        for (Course c : s.getEnrolledCourses()) {
            int score = s.getCourseGrades().getOrDefault(c, 0);
            System.out.println(c.getCourseCode() + " - " + c.getCourseName() + " : " + score);
        }
        System.out.println("-------------------------------\n");
    }
}

// 9️⃣ Main class
public class UniversityApp {
    public static void main(String[] args) {
        // Professors
        Professor prof1 = new Professor("P101", "Dr. Smith", "smith@uni.edu");
        Professor prof2 = new Professor("P102", "Dr. Jones", "jones@uni.edu");

        // Courses
        TheoryCourse cs101 = new TheoryCourse("CS101", "Data Structures");
        LabCourse csLab101 = new LabCourse("CS101L", "Data Structures Lab");
        TheoryCourse math101 = new TheoryCourse("MATH101", "Calculus");

        // Assign courses to professors
        prof1.addCourse(cs101);
        prof1.addCourse(csLab101);
        prof2.addCourse(math101);

        // Students
        Student alice = new Student("S001", "Alice", "alice@student.edu");
        Student bob = new Student("S002", "Bob", "bob@student.edu");

        // Enroll students in courses
        alice.enroll(cs101);
        alice.enroll(csLab101);
        alice.enroll(math101);

        bob.enroll(cs101);
        bob.enroll(math101);

        // Conduct exams
        cs101.conductExam();
        csLab101.conductExam();
        math101.conductExam();

        // Evaluate students
        cs101.evaluateStudent(alice, 85);
        csLab101.evaluateStudent(alice, 90);
        math101.evaluateStudent(alice, 88);

        cs101.evaluateStudent(bob, 78);
        math101.evaluateStudent(bob, 82);

        // Generate transcripts
        TranscriptGenerator.generateTranscript(alice);
        TranscriptGenerator.generateTranscript(bob);
    }
}
