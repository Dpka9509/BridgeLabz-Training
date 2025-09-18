import java.util.*;

class Teacher {
    private String name;
    private List<Course> courses;

    public Teacher(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Add course and update reverse relationship
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addTeacher(this); // maintain bidirectional link
        }
    }

    public void printCourses() {
        System.out.print("Teacher: " + name + " teaches -> ");
        for (Course c : courses) {
            System.out.print(c.getTitle() + " ");
        }
        System.out.println();
    }
}

class Course {
    private String title;
    private List<Teacher> teachers;

    public Course(String title) {
        this.title = title;
        this.teachers = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    // Add teacher and update reverse relationship
    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            teacher.addCourse(this); // maintain bidirectional link
        }
    }

    public void printTeachers() {
        System.out.print("Course: " + title + " is taught by -> ");
        for (Teacher t : teachers) {
            System.out.print(t.getName() + " ");
        }
        System.out.println();
    }
}
public class TeacherMain {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice");
        Teacher t2 = new Teacher("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Physics");
        Course c3 = new Course("Chemistry");

        // Establish relationships
        t1.addCourse(c1);
        t1.addCourse(c2);
        t2.addCourse(c2);
        t2.addCourse(c3);

        // Print Teachers with their courses
        t1.printCourses();
        t2.printCourses();

        // Print Courses with their teachers
        c1.printTeachers();
        c2.printTeachers();
        c3.printTeachers();
    }
}
